package statement.compound;

import antlr.PseudocodeParser.ExpressionContext;
import manager.ProgramManager;

public abstract class IterationStatement extends CompoundStatement {
    private final boolean countDown;
    private final ExpressionContext boundCtx;


    public IterationStatement(ProgramManager programManager
            , boolean countDown
            , ExpressionContext boundCtx
            , int lineNumber) {
        super(programManager, lineNumber);
        this.countDown = countDown;
        this.boundCtx = boundCtx;
    }

    public ExpressionContext getBoundContext() {
        return boundCtx;
    }

    protected boolean isCountDown() {
        return countDown;
    }

    protected void beginIteration(int initialValue, int destinationValue) {
        if (isCountDown()) {
            while (initialValue >= destinationValue && !hasBroken()) {
                executeOneIteration();
                initialValue--;
            }
        } else {
            while (initialValue <= destinationValue && !hasBroken()) {
                executeOneIteration();
                initialValue++;
            }
        }
    }
}
