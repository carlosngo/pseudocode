package statement.compound;

import gen.PseudocodeParser.ConditionContext;
import manager.ProgramManager;
import manager.VariableManager;
import statement.Statement;
import util.evaluator.ConditionEvaluator;

public class ForStatement extends IterationStatement {

    private Statement initStatement;
    private Statement updateStatement;

    public ForStatement(ProgramManager programManager, Statement initStatement, ConditionContext condition, Statement updateStatement) {
        super(programManager, condition);
        this.initStatement = initStatement;
        this.updateStatement = updateStatement;
    }

    @Override
    public void execute(VariableManager variableManager) {
        initStatement.execute(variableManager);
        while (ConditionEvaluator.evaluate(getCondition())) {
            for (Statement statement : getStatements()) {
                statement.execute(variableManager);
            }
            updateStatement.execute(variableManager);
        }
    }
}
