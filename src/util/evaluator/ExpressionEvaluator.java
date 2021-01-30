package util.evaluator;

import error.exception.ExpressionEvaluationException;
import error.exception.UndeclaredStorageException;
import gen.PseudocodeParser.ExpressionContext;
import manager.ProgramManager;
import manager.VariableManager;
import statement.compound.FunctionCallStatement;
import storage.Function;
import storage.Storage;

public class ExpressionEvaluator {
    public static Object evaluateValue(
            ExpressionContext ctx
            , ProgramManager programManager)
            throws ExpressionEvaluationException, UndeclaredStorageException {

        FunctionCallStatement currentFunctionCall
                = programManager.getExecutionManager().getCurrentFunctionCall();
        VariableManager variableManager = currentFunctionCall.getLocalVariables();
        return null;
    }

    public static Storage.Type evaluateType(
            ExpressionContext ctx
            , ProgramManager programManager)
            throws ExpressionEvaluationException, UndeclaredStorageException {
        Function currentFunction
                = programManager.getFunctionManager().getCurrentFunction();
        VariableManager variableManager = currentFunction.getVariableManager();
        return null;
    }
}
