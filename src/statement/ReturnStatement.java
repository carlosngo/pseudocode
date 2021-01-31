package statement;

import exception.SemanticException;
import exception.type.ReturnException;
import gen.PseudocodeParser.ExpressionContext;
import manager.ExecutionManager;
import manager.ProgramManager;
import manager.FunctionManager;
import notification.event.SemanticErrorEvent;
import storage.Function;
import storage.Storage;
import util.evaluator.ExpressionEvaluator;

public class ReturnStatement extends Statement {
    private final ExpressionContext expressionContext;

    public ReturnStatement(ProgramManager programManager
            , ExpressionContext expressionContext
            , int lineNumber) {
        super(programManager, lineNumber);
        this.expressionContext = expressionContext;
        try {
            FunctionManager functionManager = programManager.getFunctionManager();
            Function currentFunction = functionManager.getCurrentFunction();
            Storage.Type givenReturnType = ExpressionEvaluator
                    .evaluateType(expressionContext, programManager);
            if (givenReturnType != currentFunction.getType()) {
                throw new ReturnException(currentFunction.getType(), givenReturnType);
            }
        } catch(SemanticException e) {
            notifyErrorListeners(e);
        }
    }

    @Override
    public void execute() {
        tryExecution();
        ExecutionManager executionManager = getProgramManager().getExecutionManager();
        try {
            executionManager.triggerReturn(
                    ExpressionEvaluator
                            .evaluateValue(expressionContext, getProgramManager()));
        } catch(SemanticException e) {
            System.err.println("unexpected " + e.getMessage() + " at runtime");
        }
    }
}
