package statement.compound;

import gen.PseudocodeParser.ConditionContext;
import manager.ProgramManager;
import manager.VariableManager;

public class DoWhileStatement extends IterationStatement {

    public DoWhileStatement(ProgramManager programManager, ConditionContext condition) {
        super(programManager, condition);
    }

    @Override
    public void execute(VariableManager variableManager) {

    }
}
