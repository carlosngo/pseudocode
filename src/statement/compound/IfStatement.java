package statement.compound;


import error.exception.CompilationException;
import error.exception.type.ConditionException;
import error.exception.type.TypeMismatchException;
import gen.PseudocodeParser.ExpressionContext;
import manager.ExecutionManager;
import manager.FunctionManager;
import manager.ProgramManager;
import manager.VariableManager;
import notification.event.SemanticErrorEvent;
import statement.Statement;
import storage.Function;
import storage.Storage;
import util.evaluator.ExpressionEvaluator;

import java.util.ArrayList;

public class IfStatement extends CompoundStatement {
    private final ArrayList<Statement> positiveStatements;
    private final ArrayList<Statement> negativeStatements;
    private boolean inPositive;

    private final ExpressionContext condition;

    public IfStatement(ProgramManager programManager, ExpressionContext condition) {
        super(programManager);
        this.condition = condition;
        positiveStatements = new ArrayList<>();
        negativeStatements = new ArrayList<>();
        inPositive = true;
        try {
            Storage.Type givenType =
                    ExpressionEvaluator.evaluateType(condition, programManager);
            if (givenType != Storage.Type.BOOLEAN) {
                throw new ConditionException(givenType);
            }
        } catch(CompilationException e) {
            SemanticErrorEvent evt = new SemanticErrorEvent(this, e);
            programManager.getNotificationManager().notifyErrorListeners(evt);
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
        } catch(CompilationException e) {
            System.err.println("unexpected compilation error during runtime: " + e.getMessage());
        }
    }
}
