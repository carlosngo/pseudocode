package statement.compound;

import antlr.PseudocodeParser.ExpressionContext;
import exception.SemanticException;
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

    protected void beginIteration(VariableManager originalVariables, String identifier, int initialValue, int destinationValue) {


        try {
            if (isCountDown()) {
                System.out.println("iterating from initial value = " + initialValue + " down to " + destinationValue);
                while (initialValue >= destinationValue && !hasBroken()) {
                    System.out.println("iterating initValue = " + initialValue);
                    setLocalVariables(new VariableManager(originalVariables));
                    System.out.println("variable manager = " + getLocalVariables());
                    executeOneIteration();
                    initialValue--;
                    getLocalVariables().getVariable(identifier).setValue(initialValue);
                }
            } else {
                System.out.println("iterating from initial value = " + initialValue + " up to " + destinationValue);
                while (initialValue <= destinationValue && !hasBroken()) {
                    System.out.println("iterating initValue = " + initialValue);
                    setLocalVariables(new VariableManager(originalVariables));
                    System.out.println("variable manager = " + getLocalVariables());
                    executeOneIteration();
                    initialValue++;
                    getLocalVariables().getVariable(identifier).setValue(initialValue);
                }
            }
        } catch (SemanticException e) {
            e.printStackTrace();
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
