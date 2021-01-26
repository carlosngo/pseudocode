package statement.compound;

import gen.PseudocodeParser.ConditionContext;
import statement.Statement;

import java.util.ArrayList;

public class IfStatement implements Statement {
    private ArrayList<Statement> positiveStatements;
    private ArrayList<Statement> negativeStatements;

    private ConditionContext condition;

    public IfStatement(ConditionContext condition) {
        this.condition = condition;
        positiveStatements = new ArrayList<>();
        negativeStatements = new ArrayList<>();
    }

    public void addPositiveStatement(Statement statement) {
        positiveStatements.add(statement);
    }

    public void addNegativeStatement(Statement statement) {
        negativeStatements.add(statement);
    }

    @Override
    public void execute() {

    }
}
