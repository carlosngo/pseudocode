package statement.compound;

import antlr.visitor.expression.IntegerExpressionVisitor;
import exception.SemanticException;
import exception.type.BoundException;
import antlr.PseudocodeParser.ExpressionContext;
import manager.ExecutionManager;
import manager.ProgramManager;
import manager.VariableManager;
import notification.event.SemanticErrorEvent;
import statement.Statement;
import storage.Storage;
import util.evaluator.ExpressionEvaluator;

public class WhileStatement extends IterationStatement {
    private final String initVarName;

    public WhileStatement(ProgramManager programManager
            , VariableManager parentVariables
            , ExpressionContext boundCtx
            , boolean countDown
            , String initVarName
            , int lineNumber) {
        super(programManager, parentVariables, countDown, boundCtx, lineNumber);
        this.initVarName = initVarName;
        try {
            Storage.Type initType = parentVariables.getVariable(initVarName).getType();
            Integer bound = new IntegerExpressionVisitor(programManager, true).visit(boundCtx);
            if (bound == null) {
                throw new BoundException(null);
            }
            if (initType != Storage.Type.INT) {
                throw new BoundException(initType);
            }
        } catch(SemanticException e) {
            notifyErrorListeners(e);
        }
    }


    @Override
    public void execute() {
        tryExecution();
        ExecutionManager executionManager = getProgramManager().getExecutionManager();
        VariableManager variableManager = executionManager.getCurrentLocalVariables();
        setLocalVariables(new VariableManager(variableManager));
        variableManager = getLocalVariables();
        try {
            int initialValue = (int) variableManager.getVariable(initVarName).getValue();
            Integer destinationValue = new IntegerExpressionVisitor(
                    getProgramManager()
                    , false)
                    .visit(getBoundContext());
            executionManager.enterBlock(this);
            beginIteration(variableManager, initVarName, initialValue, destinationValue);

            // if condition is false and no break statement was called, automatically break
            if (!hasBroken()) {
                executionManager.triggerBreak();
            }
        } catch(SemanticException e) {
            System.err.println("unexpected compilation error during runtime: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("while " + initVarName + (isCountDown() ? " down " : " up ") + "to " + getBoundContext().getText() + " {\n");
        for (Statement statement : getStatements()) {
            sb.append(statement.toString());
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
