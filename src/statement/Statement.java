package statement;

import manager.ProgramManager;
import manager.VariableManager;
import statement.compound.CompoundStatement;

public abstract class Statement {
    private final ProgramManager programManager;

    public Statement(ProgramManager programManager) {
        this.programManager = programManager;
    }

    public ProgramManager getProgramManager() {
        return programManager;
    }

    public void execute() {
        try {
            programManager.getExecutionManager().tryExecution();
        } catch(InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
