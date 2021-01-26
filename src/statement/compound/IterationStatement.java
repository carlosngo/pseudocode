package statement.compound;

import gen.PseudocodeParser.ConditionContext;
import statement.Statement;

import java.util.ArrayList;

public abstract class IterationStatement implements CompoundStatement {
    private ArrayList<Statement> statements;
    private ConditionContext condition;

    public IterationStatement(ConditionContext condition) {
        statements = new ArrayList<>();
        this.condition = condition;
    }

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    public ConditionContext getCondition() {
        return condition;
    }

    @Override
    public void addStatement(Statement statement) {
        statements.add(statement);
    }
}
