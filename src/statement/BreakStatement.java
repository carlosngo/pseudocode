package statement;

import manager.ExecutionManager;
import manager.ProgramManager;
import manager.VariableManager;

public class BreakStatement extends Statement {
    public BreakStatement(ProgramManager programManager) {
        super(programManager);
    }

    @Override
    public void execute() {
        super.execute();
        getProgramManager().getExecutionManager().triggerBreak();
    }
}
