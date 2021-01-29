package statement;

import manager.ProgramManager;
import manager.VariableManager;

public abstract class Statement {
    private final ProgramManager programManager;

    public Statement(ProgramManager programManager) {
        this.programManager = programManager;
    }

    public ProgramManager getExecutionManager() {
        return programManager;
    }

    public void execute(VariableManager variableManager) {
        try {
            programManager.getExecutionManager().tryExecution();
        } catch(InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
