package statement.compound;

import gen.PseudocodeParser.ConditionContext;
import manager.ProgramManager;
import manager.VariableManager;
import statement.Statement;

import java.util.ArrayList;

public class IfStatement extends CompoundStatement {
    private ArrayList<Statement> negativeStatements;

    private ConditionContext condition;

    public IfStatement(ProgramManager programManager, ConditionContext condition) {
        super(programManager);
        this.condition = condition;
        negativeStatements = new ArrayList<>();
    }

    public void addNegativeStatement(Statement statement) {
        negativeStatements.add(statement);
    }

    @Override
    public void execute(VariableManager variableManager) {

    }
}
