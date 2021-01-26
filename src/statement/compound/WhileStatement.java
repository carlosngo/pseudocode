package statement.compound;

import gen.PseudocodeParser.ConditionContext;

public class WhileStatement extends IterationStatement {

    public WhileStatement(ConditionContext condition) {
        super(condition);
    }

    @Override
    public void execute() {

    }
}
