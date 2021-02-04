package statement.compound;


import antlr.visitor.expression.BooleanExpressionVisitor;
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
            Boolean value = new BooleanExpressionVisitor(programManager, true).visit(condition);
            if (value == null) {
                throw new ConditionException(null);
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
        Boolean value = new BooleanExpressionVisitor(getProgramManager(), false)
                .visit(condition);
        ExecutionManager executionManager = getProgramManager().getExecutionManager();
        setLocalVariables(new VariableManager(executionManager.getCurrentLocalVariables()));
        executionManager.enterBlock(this);
        if (value.booleanValue()) {
            System.out.println("condition is true");
            executeOneIteration();
        } else {
            System.out.println("condition is false");
            for (int i = 0; i < negativeStatements.size() && !hasBroken(); i++) {
                negativeStatements.get(i).execute();
            }
        }
        if (!hasBroken()) {
            executionManager.exitBlock();
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("if (" + condition.getText() + ") {\n");
        for (Statement statement : getStatements()) {
            sb.append(statement.toString());
            sb.append("\n");
        }
        sb.append("} else {\n");
        for (Statement statement : negativeStatements) {
            sb.append(statement.toString());
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
