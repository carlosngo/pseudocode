package statement;

import manager.ExecutionManager;
import manager.ProgramManager;
import manager.VariableManager;

public class BreakStatement extends Statement {
    public BreakStatement(ProgramManager programManager, int lineNumber) {
        super(programManager, lineNumber);
    }

    @Override
    public void execute() {
        tryExecution();
        getProgramManager().getExecutionManager().triggerBreak();
    }

    @Override
    public String toString() {
        return "break;";
    }
}
