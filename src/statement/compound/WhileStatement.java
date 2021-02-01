package statement.compound;

import exception.SemanticException;
import exception.type.BoundException;
import gen.PseudocodeParser.ExpressionContext;
import manager.ExecutionManager;
import manager.ProgramManager;
import notification.event.SemanticErrorEvent;
import storage.Storage;
import util.evaluator.ExpressionEvaluator;

public class WhileStatement extends IterationStatement {
    private ExpressionContext initCtx;

    public WhileStatement(ProgramManager programManager
            , ExpressionContext boundCtx
            , boolean countDown
            , ExpressionContext initCtx
            , int lineNumber) {
        super(programManager, countDown, boundCtx, lineNumber);
        this.initCtx = initCtx;
        try {
            Storage.Type initType = ExpressionEvaluator
                    .evaluateType(initCtx, programManager);
            Storage.Type boundType = ExpressionEvaluator
                    .evaluateType(boundCtx, programManager);
            if (initType != Storage.Type.INT) {
                throw new BoundException(initType);
            }
            if (boundType != Storage.Type.INT) {
                throw new BoundException(boundType);
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
            int initialValue = (int) ExpressionEvaluator
                    .evaluateValue(initCtx, getProgramManager());
            int destinationValue = (int) ExpressionEvaluator
                    .evaluateValue(getBoundContext(), getProgramManager());
            executionManager.enterBlock(this);
            beginIteration(initialValue, destinationValue);

            // if condition is false and no break statement was called, automatically break
            if (!hasBroken()) {
                executionManager.triggerBreak();
            }
        } catch(SemanticException e) {
            System.err.println("unexpected compilation error during runtime: " + e.getMessage());
        }
    }
}
