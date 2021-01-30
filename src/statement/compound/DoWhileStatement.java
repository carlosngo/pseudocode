package statement.compound;

import error.exception.CompilationException;
import error.exception.type.BoundException;
import gen.PseudocodeParser.ExpressionContext;
import manager.ExecutionManager;
import manager.ProgramManager;
import notification.event.SemanticErrorEvent;
import storage.Storage;
import util.evaluator.ExpressionEvaluator;

public class DoWhileStatement extends IterationStatement {
    private ExpressionContext initCtx;

    public DoWhileStatement(ProgramManager programManager, ExpressionContext boundCtx, boolean countDown, ExpressionContext initCtx) {
        super(programManager, countDown, boundCtx);
        this.initCtx = initCtx;
        try {
            Storage.Type initType = ExpressionEvaluator.evaluateType(initCtx, programManager);
            Storage.Type boundType = ExpressionEvaluator.evaluateType(boundCtx, programManager);
            if (initType != Storage.Type.INT) {
                throw new BoundException(initType);
            }
            if (boundType != Storage.Type.INT) {
                throw new BoundException(boundType);
            }
        } catch(CompilationException e) {
            SemanticErrorEvent evt = new SemanticErrorEvent(this, e);
            programManager.getNotificationManager().notifyErrorListeners(evt);
        }
    }

    @Override
    public void execute() {
        super.execute();
        ExecutionManager executionManager = getProgramManager().getExecutionManager();
        try {
            int initialValue = (int) ExpressionEvaluator.evaluateValue(initCtx, getProgramManager());
            int destinationValue = (int) ExpressionEvaluator
                    .evaluateValue(getBoundContext(), getProgramManager());
            executionManager.enterBlock(this);
            executeOneIteration();
            beginIteration(initialValue, destinationValue);
            if (!hasBroken()) {
                executionManager.triggerBreak();
            }
        } catch(CompilationException e) {
            System.err.println("unexpected compilation error during runtime: " + e.getMessage());
        }
    }
}
