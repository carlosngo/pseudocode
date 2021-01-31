package statement.compound;

import error.exception.SemanticException;
import error.exception.type.BoundException;
import gen.PseudocodeParser.ExpressionContext;
import manager.ExecutionManager;
import manager.ProgramManager;
import notification.event.SemanticErrorEvent;
import storage.Storage;
import util.evaluator.ExpressionEvaluator;

public class WhileStatement extends IterationStatement {
    private ExpressionContext initCtx;

    public WhileStatement(ProgramManager programManager, ExpressionContext boundCtx, boolean countDown, ExpressionContext initCtx) throws SemanticException {
        super(programManager, countDown, boundCtx);
        this.initCtx = initCtx;

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
    }


    @Override
    public void execute() {
        super.execute();
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
