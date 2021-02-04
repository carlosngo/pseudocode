package statement.compound;

import antlr.PseudocodeParserBaseVisitor;
import antlr.visitor.expression.ExpressionVisitorFactory;
import exception.SemanticException;
import exception.type.AssignmentException;
import exception.type.ParameterException;
import antlr.PseudocodeParser.ExpressionContext;
import manager.ExecutionManager;
import manager.ProgramManager;
import manager.FunctionManager;
import manager.VariableManager;
import statement.Statement;
import storage.Function;
import storage.Variable;
import storage.Storage;
import util.evaluator.ExpressionEvaluator;

import java.util.ArrayList;
import java.util.List;

public class FunctionCallStatement extends CompoundStatement {
    private Function function;
    private List<ExpressionContext> parameterExpressions;
    private Object returnValue;

    public FunctionCallStatement(ProgramManager programManager
            , String functionName
            , List<ExpressionContext> parameterExpressions
            , int lineNumber
            , boolean isCompiling) {
        super(programManager, new VariableManager(), lineNumber);
        if (!isCompiling) System.out.println("created function call statement at line " + lineNumber);
        try {
            FunctionManager functionManager = programManager.getFunctionManager();
            function = functionManager.getFunction(functionName);
            this.parameterExpressions = parameterExpressions;
            returnValue = null;
            ArrayList<Variable> expectedParameters = function.getParameters();

            if (parameterExpressions.size() > expectedParameters.size()) {
                throw new ParameterException(null, Storage.Type.UNKNOWN);
            }
            if (parameterExpressions.size() < expectedParameters.size()) {
                throw new ParameterException(Storage.Type.UNKNOWN, null);
            }

            for (int i = 0; i < parameterExpressions.size(); i++) {
                Variable expectedParameter = expectedParameters.get(i);
                PseudocodeParserBaseVisitor expressionVisitor = ExpressionVisitorFactory.getExpressionVisitor(programManager, expectedParameter.getType(), true);
                if (isCompiling && expressionVisitor.visit(parameterExpressions.get(i)) == null) {
                    throw new ParameterException(expectedParameter.getType(), Storage.Type.UNKNOWN);
                }
                getLocalVariables().addVariable(expectedParameter);
            }

        } catch(SemanticException e) {
            notifyErrorListeners(e);
        }
    }

    public FunctionCallStatement(ProgramManager programManager, Function function, int lineNumber) {
        super(programManager, new VariableManager(), lineNumber);
        this.function = function;
        try {
            for (Variable parameter : function.getParameters()) {
                getLocalVariables().addVariable(parameter);
            }
        } catch (SemanticException e) {
            System.err.println("unexpected " + e.getMessage());
        }
    }

    public Function getFunctionSignature() {
        return function;
    }

    public Object getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(Object returnValue) {
        this.returnValue = returnValue;
    }

    @Override
    public void addStatement(Statement statement) {
        function.addStatement(statement);
    }

    @Override
    public void execute() {
        tryExecution();
        ExecutionManager executionManager = getProgramManager().getExecutionManager();

        try {
            // evaluate given parameters and place inside local variables
            VariableManager localVariables = getLocalVariables();
            ArrayList<Variable> functionParameters = function.getParameters();
            for (int i = 0; i < functionParameters.size(); i++) {
                Variable expectedParameter = functionParameters.get(i);
                System.out.println("expected parameter = " + expectedParameter);
                Object parameterValue =
                        ExpressionVisitorFactory.getExpressionVisitor(
                                getProgramManager()
                                , expectedParameter.getType()
                                , false)
                        .visit(parameterExpressions.get(i));
                System.out.println("given value =" + parameterValue);

                expectedParameter.setValue(parameterValue);
//                localVariables.addVariable(expectedParameter);
            }
            System.out.println("function local variables: " + localVariables);
            // execute function
            executionManager.enterBlock(this);
            ArrayList<Statement> statements = function.getStatements();
            for (int i = 0; i < statements.size() && !hasBroken(); i++) {
                System.out.println("at line " + statements.get(i).getLineNumber() + ", function local variables: " + localVariables);
                statements.get(i).execute();
                if (hasBroken()) {
                    System.out.println("at i = " + i + ", cancelling other commands ");
                }
            }

            // return automatically if no return statement found
            if (!hasBroken()) {
                executionManager.triggerReturn(null);
            }
        } catch (SemanticException e) {
            System.err.println("unexpected compilation error during runtime: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(function.getName() + "(");
        for (ExpressionContext ctx : parameterExpressions) {
            sb.append(ctx.getText());
            sb.append(", ");
        }
        sb.append(")");
        return sb.toString();
    }
}
