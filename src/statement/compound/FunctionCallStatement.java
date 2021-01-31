package statement.compound;

import exception.*;
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

public class FunctionCallStatement extends CompoundStatement {
    private Function function;
    private ExpressionContext[] parameterExpressions;
    private Object returnValue;
    private VariableManager localVariables;

    public FunctionCallStatement(ProgramManager programManager
            , String functionName
            , ExpressionContext[] parameterExpressions
            , int lineNumber) {
        super(programManager, lineNumber);
        try {
            FunctionManager functionManager = programManager.getFunctionManager();
            function = functionManager.getFunction(functionName);
            this.parameterExpressions = parameterExpressions;
            returnValue = null;
            ArrayList<Variable> expectedParameters = function.getParameters();
            if (parameterExpressions.length > expectedParameters.size()) {
                throw new ParameterException(null, Storage.Type.UNKNOWN);
            }
            if (parameterExpressions.length < expectedParameters.size()) {
                throw new ParameterException(Storage.Type.UNKNOWN, null);
            }

            for (int i = 0; i < parameterExpressions.length; i++) {
                Variable expectedParameter = expectedParameters.get(i);
                Storage.Type givenType = ExpressionEvaluator
                        .evaluateType(parameterExpressions[i], programManager);
                if (givenType != expectedParameter.getType()) {
                    throw new ParameterException(expectedParameter.getType(), givenType);
                }
            }
        } catch(SemanticException e) {
            notifyErrorListeners(e);
        }
    }

    public VariableManager getLocalVariables() {
        return localVariables;
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
            localVariables = new VariableManager();
            ArrayList<Variable> functionParameters = function.getParameters();
            for (int i = 0; i < functionParameters.size(); i++) {

                Object parameterValue = ExpressionEvaluator.evaluateValue(
                        parameterExpressions[i], getProgramManager());

                Variable expectedParameter = functionParameters.get(i);
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

}
