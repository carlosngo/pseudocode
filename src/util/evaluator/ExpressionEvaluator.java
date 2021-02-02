package util.evaluator;

import exception.ExpressionEvaluationException;
import exception.UndeclaredStorageException;
import antlr.PseudocodeParser.ExpressionContext;
import manager.FunctionManager;
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

    /**
     * This is going to require some ANTLR familiarity (especially parse tree walking)
     * which I do not have yet. You might have to create new classes to perform this task.
     *
     * Context: you are given the parse tree node which in plaintext looks like this
     * "x + 50 - funcA()". You are to traverse this node somehow and evaluate the expected
     * type after evaluation.
     *
     * Basically, you don't care about the values of the variables or the return values
     * of the functions. You just have to evaluate what type will result if int + int,
     * int + double, etc.
     *
     * You can do functionManager.getFunction to extract a Function instance given its name
     *
     * You can do variableMnaager.getVariable to extract a Variable instance given its name
     *
     * Assume all functions and variables exist
     *
     * Function and Variable instances have the getType which returns its type.
     *
     * throw an ExpressionEvaluationException when handling incompatible types (for ex.
     * int + boolean)
     *
     * note to self (ignore this): remember to initialize the functions as an in-between
     *
     * @param ctx the parse tree
     * @return the expected type of the expression
     */
    public static Storage.Type evaluateType(
            ExpressionContext ctx
            , ProgramManager programManager)
            throws ExpressionEvaluationException, UndeclaredStorageException {
        FunctionManager functionManager = programManager.getFunctionManager();

        Function currentFunction = functionManager.getCurrentFunction();
        VariableManager variableManager = programManager
                .getCompilationManager()
                .getCurrentLocalVariables();

        return null;
    }
}
