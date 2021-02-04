package statement.compound;

import antlr.PseudocodeParser.ExpressionContext;
import manager.ProgramManager;
import manager.VariableManager;
import statement.Statement;

public abstract class IterationStatement extends CompoundStatement {
    private final boolean countDown;
    private final ExpressionContext boundCtx;


    public IterationStatement(ProgramManager programManager
            , VariableManager variableManager
            , boolean countDown
            , ExpressionContext boundCtx
            , int lineNumber) {
        super(programManager, variableManager, lineNumber);
        this.countDown = countDown;
        this.boundCtx = boundCtx;
    }

    public ExpressionContext getBoundContext() {
        return boundCtx;
    }

    protected boolean isCountDown() {
        return countDown;
    }

    protected void beginIteration(VariableManager originalVariables, int initialValue, int destinationValue) {
        System.out.println("iterating from initial value = " + initialValue + " to " + destinationValue);
        if (isCountDown()) {
            while (initialValue >= destinationValue && !hasBroken()) {
                setLocalVariables(new VariableManager(originalVariables));
                executeOneIteration();
                initialValue--;
            }
        } else {
            while (initialValue <= destinationValue && !hasBroken()) {
                setLocalVariables(new VariableManager(originalVariables));
                executeOneIteration();
                initialValue++;
            }
        }
    }

    @Override
    public String toString() {
        return "for (" +
                "countDown=" + countDown +
                ", boundCtx=" + boundCtx.getText() +
                ')';
    }
}
