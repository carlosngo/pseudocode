package statement.compound;

import gen.PseudocodeParser.ConditionContext;
import manager.VariableManager;

public class WhileStatement extends IterationStatement {

    public WhileStatement(ConditionContext condition) {
        super(condition);
    }

    @Override
    public void execute(VariableManager variableManager) {

    }
}
