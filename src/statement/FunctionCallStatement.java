package statement;

import error.exception.*;
import gen.PseudocodeParser.ExpressionContext;
import manager.ExecutionManager;
import manager.FunctionManager;
import manager.VariableManager;
import notification.event.ErrorEvent;
import notification.event.PseudocodeEvent;
import storage.Array;
import storage.Function;
import storage.Variable;
import util.evaluator.ExpressionEvaluator;

import java.util.ArrayList;

public class FunctionCallStatement extends Statement {
    private ExecutionManager executionManager;
    private Function function;
    private ExpressionContext[] parameterExpressions;
    private Object returnValue;

    public FunctionCallStatement(ExecutionManager executionManager, String functionName
            , ExpressionContext[] parameterExpressions) {
        super(executionManager);
        try {
            FunctionManager functionManager = executionManager.getFunctionManager();
            this.executionManager = executionManager;
            function = functionManager.getFunction(functionName);
            this.parameterExpressions = parameterExpressions;
            returnValue = null;
            ArrayList<Variable> expectedParameters = function.getParameters();
            if (parameterExpressions.length > expectedParameters.size()) {
                throw new ParameterMismatchException(null, Variable.Type.UNKNOWN);
            }
            if (parameterExpressions.length < expectedParameters.size()) {
                throw new ParameterMismatchException(Variable.Type.UNKNOWN, null);
            }

            for (int i = 0; i < parameterExpressions.length; i++) {
                Variable expectedParameter = expectedParameters.get(i);
                Variable.Type givenType = ExpressionEvaluator
                        .evaluateType(parameterExpressions[i], executionManager, function.getVariableManager());
                if (givenType != expectedParameter.getType()) {
                    throw new ParameterMismatchException(expectedParameter.getType(), givenType);
                }
            }
        } catch (PseudocodeException e) {
            ErrorEvent evt = new ErrorEvent(this, e);
            executionManager.getNotificationCenter().notifyListeners(evt);
        }
    }

    public Object getReturnValue() {
        return returnValue;
    }

    @Override
    public void execute(VariableManager variableManager) {
        super.execute(variableManager);
        try {
            VariableManager newVariableManager = new VariableManager();
            ArrayList<Variable> functionParameters = function.getParameters();
            for (int i = 0; i < functionParameters.size(); i++) {

                Object parameterValue = ExpressionEvaluator.evaluateValue(
                        parameterExpressions[i], executionManager, variableManager);

                Variable expectedParameter = functionParameters.get(i);
                Variable.Type givenType = Variable.typeOf(parameterValue);
                if (givenType != expectedParameter.getType()) {
                    throw new ParameterMismatchException(expectedParameter.getType(), givenType);
                }
                expectedParameter.setValue(parameterValue);
                newVariableManager.addVariable(expectedParameter);
            }

            for (Statement statement : function.getStatements()) {
                statement.execute(newVariableManager);
                if (statement instanceof BreakStatement || statement instanceof ReturnStatement) {
                    break;
                }
            }
        } catch (PseudocodeException e) {
            System.err.println("there shouldn't be any errors during runtime... hmmm...");
        }
    }
}
