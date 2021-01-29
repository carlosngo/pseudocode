package statement.compound;

import error.exception.*;
import error.exception.type.ParameterException;
import error.exception.type.ReturnException;
import gen.PseudocodeParser.ExpressionContext;
import manager.ProgramManager;
import manager.FunctionManager;
import manager.VariableManager;
import notification.event.SemanticErrorEvent;
import statement.ReturnStatement;
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

    public FunctionCallStatement(ProgramManager programManager, String functionName
            , ExpressionContext[] parameterExpressions) {
        super(programManager);
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
                        .evaluateType(parameterExpressions[i], programManager, function.getVariableManager());
                if (givenType != expectedParameter.getType()) {
                    throw new ParameterException(expectedParameter.getType(), givenType);
                }
            }
        } catch (CompilationException e) {
            SemanticErrorEvent evt = new SemanticErrorEvent(this, e);
            programManager.getNotificationManager().notifyListeners(evt);
        }
    }

    public Object getReturnValue() {
        return returnValue;
    }

    @Override
    public void addStatement(Statement statement) {
        function.addStatement(statement);
    }

    @Override
    public void execute(VariableManager variableManager) {
        super.execute(variableManager);
        try {
            boolean hasReturned = false;
            VariableManager newVariableManager = new VariableManager();
            ArrayList<Variable> functionParameters = function.getParameters();
            for (int i = 0; i < functionParameters.size(); i++) {

                Object parameterValue = ExpressionEvaluator.evaluateValue(
                        parameterExpressions[i], getExecutionManager(), variableManager);

                Variable expectedParameter = functionParameters.get(i);
                Storage.Type givenType = Storage.typeOf(parameterValue);
                if (givenType != expectedParameter.getType()) {
                    throw new ParameterException(expectedParameter.getType(), givenType);
                }
                expectedParameter.setValue(parameterValue);
                newVariableManager.addVariable(expectedParameter);
            }

            for (Statement statement : function.getStatements()) {
                statement.execute(newVariableManager);
                if (statement instanceof ReturnStatement) {
                    returnValue = ((ReturnStatement) statement).getReturnValue();
                    if (returnValue == null) {
                        if (function.getType() != Storage.Type.VOID) {
                            throw new ReturnException(function.getType(), null);
                        } else {
                            throw new ReturnException(null, Storage.typeOf(returnValue));
                        }

                    }
                    hasReturned = true;
                    break;
                }
            }
            if (!hasReturned) {
                if (function.getType() != Storage.Type.VOID) {
                    throw new ReturnException(function.getType(), null);
                }
            }
        } catch (CompilationException e) {
            System.err.println("there shouldn't be any errors during runtime... hmmm...");
        }
    }

}
