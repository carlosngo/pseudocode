package util.evaluator;

import error.exception.ExpressionEvaluationException;
import gen.PseudocodeParser.ExpressionContext;
import manager.ExecutionManager;
import manager.FunctionManager;
import manager.VariableManager;
import storage.Variable;

public class ExpressionEvaluator {
    public static Object evaluateValue(
            ExpressionContext ctx
            , ExecutionManager executionManager
            , VariableManager variableManager)
            throws ExpressionEvaluationException {
        return null;
    }

    public static Variable.Type evaluateType(
            ExpressionContext ctx
            , ExecutionManager executionManager
            , VariableManager variableManager)
            throws ExpressionEvaluationException {
        return null;
    }
}
