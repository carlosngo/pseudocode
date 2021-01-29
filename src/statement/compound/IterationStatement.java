package statement.compound;

import gen.PseudocodeParser.ConditionContext;
import manager.ProgramManager;
import statement.Statement;

import java.util.ArrayList;

public abstract class IterationStatement extends CompoundStatement {
    private final ConditionContext condition;
    private final ArrayList<Statement> statements;

    public IterationStatement(ProgramManager programManager, ConditionContext condition) {
        super(programManager);
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
