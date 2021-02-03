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
            , int lineNumber) {
        super(programManager, new VariableManager(), lineNumber);
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
                try {
                    if (expressionVisitor.visit(parameterExpressions.get(i)) == null) {
                        throw new ParameterException(expectedParameter.getType(), Storage.Type.UNKNOWN);
                    }
                    getLocalVariables().addVariable(expectedParameter);
                } catch(NullPointerException e) {
//                e.printStackTrace();
                    throw new ParameterException(expectedParameter.getType(), Storage.Type.UNKNOWN);
                }
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
                Object parameterValue =
                        ExpressionVisitorFactory.getExpressionVisitor(
                                getProgramManager()
                                , expectedParameter.getType()
                                , false)
                        .visit(parameterExpressions.get(i));


                expectedParameter.setValue(parameterValue);
                localVariables.addVariable(expectedParameter);
            }

            // execute function
            executionManager.enterBlock(this);
            ArrayList<Statement> statements = function.getStatements();
            for (int i = 0; i < statements.size() && !hasBroken(); i++) {
                statements.get(i).execute();
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
        return "FunctionCallStatement{" +
                "function=" + function +
                ", parameterExpressions=" + parameterExpressions +
                ", returnValue=" + returnValue +
                '}';
    }
}
