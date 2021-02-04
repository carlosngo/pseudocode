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

public class DoWhileStatement extends IterationStatement {
    private final String initVarName;

    public DoWhileStatement(ProgramManager programManager
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
            executeOneIteration();
            setLocalVariables(new VariableManager(variableManager));
            beginIteration(variableManager, initVarName, initialValue, destinationValue);
            if (!hasBroken()) {
                executionManager.triggerBreak();
            }
        } catch(SemanticException e) {
            System.err.println("unexpected compilation error during runtime: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("do { ");
        for (Statement statement : getStatements()) {
            sb.append(statement.toString());
            sb.append("\n");
        }
        sb.append("}");
        sb.append("while " + initVarName + (isCountDown() ? " down " : " up ") + "to " + getBoundContext().getText() + ";");
        return sb.toString();
    }
}
