package statement.compound;


import exception.SemanticException;
import exception.type.ConditionException;
import antlr.PseudocodeParser.ExpressionContext;
import manager.ExecutionManager;
import manager.ProgramManager;
import manager.VariableManager;
import notification.event.SemanticErrorEvent;
import statement.Statement;
import storage.Storage;
import util.evaluator.ExpressionEvaluator;

import java.util.ArrayList;

public class IfStatement extends CompoundStatement {
    private final ArrayList<Statement> negativeStatements;
    private boolean inPositive;

    private final ExpressionContext condition;

    public IfStatement(ProgramManager programManager
            , VariableManager parentVariables
            , ExpressionContext condition
            , int lineNumber) {
        super(programManager, parentVariables, lineNumber);
        this.condition = condition;
        negativeStatements = new ArrayList<>();
        inPositive = true;
        try {
            Storage.Type givenType =
                    ExpressionEvaluator.evaluateType(condition, programManager);
            if (givenType != Storage.Type.BOOLEAN) {
                throw new ConditionException(givenType);
            }
        } catch(SemanticException e) {
            notifyErrorListeners(e);
        }
    }

    public boolean isInPositive() {
        return inPositive;
    }

    public void enterPositive() {
        inPositive = true;
    }

    public void exitPositive() {
        inPositive = false;
    }

    public void addNegativeStatement(Statement statement) {
        negativeStatements.add(statement);
    }

    @Override
    public void execute() {
        tryExecution();
        try {
            boolean value = (boolean)
                    ExpressionEvaluator.evaluateValue(condition, getProgramManager());
            ExecutionManager executionManager = getProgramManager().getExecutionManager();
            executionManager.enterBlock(this);
            if (value) {
                executeOneIteration();
            } else {
                for (int i = 0; i < negativeStatements.size() && !hasBroken(); i++) {
                    negativeStatements.get(i).execute();
                }
            }
            if (!hasBroken()) {
                executionManager.exitBlock();
            }
        } catch(SemanticException e) {
            System.err.println("unexpected compilation error during runtime: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "if (" + condition.getText() +
                "), " + "negativeStatements=" + negativeStatements +
                ", inPositive=" + inPositive;
    }
}
