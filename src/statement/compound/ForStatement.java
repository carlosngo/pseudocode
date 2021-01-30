package statement.compound;

import error.exception.CompilationException;

import error.exception.type.BoundException;
import gen.PseudocodeParser.ForInitStatementContext;
import gen.PseudocodeParser.ExpressionContext;
import manager.ExecutionManager;
import manager.ProgramManager;
import manager.VariableManager;
import notification.event.SemanticErrorEvent;
import statement.Statement;
import storage.Storage;
import util.evaluator.ExpressionEvaluator;

public class ForStatement extends IterationStatement {

    private final ForInitStatementContext initCtx;
    private final ExpressionContext boundCtx;

    public ForStatement(ProgramManager programManager
            , ForInitStatementContext initCtx
            , boolean countDown
            , ExpressionContext boundCtx) {
        super(programManager, countDown, boundCtx);
        this.initCtx = initCtx;
        this.boundCtx = boundCtx;
        try {
//            Storage.Type initType = ExpressionEvaluator.evaluateType(initCtx, programManager);
            Storage.Type boundType = ExpressionEvaluator.evaluateType(boundCtx, programManager);
//            if (initType != Storage.Type.INT) {
//                throw new BoundException(initType);
//            }
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
//            int initialValue = (int) ExpressionEvaluator.evaluateValue(initCtx, getProgramManager());
            int destinationValue = (int) ExpressionEvaluator
                    .evaluateValue(getBoundContext(), getProgramManager());
            executionManager.enterBlock(this);
//            do {
//
//                initialValue = initialValue + (isCountDown() ? -1 : 1);
//            } while (initialValue != destinationValue);

            executionManager.exitBlock();
            getProgramManager().getExecutionManager().triggerBreak();
        } catch(CompilationException e) {
            System.err.println(e.getMessage());
        }
    }
}
