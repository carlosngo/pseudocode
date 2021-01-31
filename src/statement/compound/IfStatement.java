package statement.compound;


import error.exception.SemanticException;
import error.exception.type.ConditionException;
import gen.PseudocodeParser.ExpressionContext;
import manager.ExecutionManager;
import manager.ProgramManager;
import notification.event.SemanticErrorEvent;
import statement.Statement;
import storage.Storage;
import util.evaluator.ExpressionEvaluator;

import java.util.ArrayList;

public class IfStatement extends CompoundStatement {
    private final ArrayList<Statement> positiveStatements;
    private final ArrayList<Statement> negativeStatements;
    private boolean inPositive;

    private final ExpressionContext condition;

    public IfStatement(ProgramManager programManager, ExpressionContext condition) throws SemanticException {
        super(programManager);
        this.condition = condition;
        positiveStatements = new ArrayList<>();
        negativeStatements = new ArrayList<>();
        inPositive = true;
        Storage.Type givenType =
                ExpressionEvaluator.evaluateType(condition, programManager);
        if (givenType != Storage.Type.BOOLEAN) {
            throw new ConditionException(givenType);
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

    @Override
    public void addStatement(Statement statement) {
        positiveStatements.add(statement);
    }

    public void addNegativeStatement(Statement statement) {
        negativeStatements.add(statement);
    }

    @Override
    public void execute() {
        super.execute();
        try {
            boolean value = (boolean)
                    ExpressionEvaluator.evaluateValue(condition, getProgramManager());
            ExecutionManager executionManager = getProgramManager().getExecutionManager();
            executionManager.enterBlock(this);
            if (value) {
                for (int i = 0; i < positiveStatements.size() && !hasBroken(); i++) {
                    positiveStatements.get(i).execute();
                }
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
}
