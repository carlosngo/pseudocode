package statement.compound;

import gen.PseudocodeParser.IterationInitContext;
import gen.PseudocodeParser.ConditionContext;
import statement.Statement;
import util.evaluator.ConditionEvaluator;

public class ForStatement extends IterationStatement {

    private Statement initStatement;
    private Statement updateStatement;

    public ForStatement(Statement initStatement, ConditionContext condition, Statement updateStatement) {
        super(condition);
        this.initStatement = initStatement;
        this.updateStatement = updateStatement;
    }

    @Override
    public void execute() {
        initStatement.execute();
        while (ConditionEvaluator.evaluate(getCondition())) {
            for (Statement statement : getStatements()) {
                statement.execute();
            }
            updateStatement.execute();
        }
    }
}
