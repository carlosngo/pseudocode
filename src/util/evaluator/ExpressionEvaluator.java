package util.evaluator;

import error.exception.ExpressionEvaluationException;
import gen.PseudocodeParser.ExpressionContext;
import manager.ProgramManager;
import manager.VariableManager;
import storage.Storage;

public class ExpressionEvaluator {
    public static Object evaluateValue(
            ExpressionContext ctx
            , ProgramManager programManager
            , VariableManager variableManager)
            throws ExpressionEvaluationException {
        return null;
    }

    public static Storage.Type evaluateType(
            ExpressionContext ctx
            , ProgramManager programManager
            , VariableManager variableManager)
            throws ExpressionEvaluationException {
        return null;
    }
}
