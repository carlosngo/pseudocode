package statement;

import exception.SemanticException;
import manager.ProgramManager;
import manager.VariableManager;
import notification.event.SemanticErrorEvent;
import statement.compound.CompoundStatement;

public abstract class Statement {
    private final ProgramManager programManager;
    private final int lineNumber;

    public Statement(ProgramManager programManager, int lineNumber) {
        this.programManager = programManager;
        this.lineNumber = lineNumber;
    }

    public ProgramManager getProgramManager() {
        return programManager;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    protected void notifyErrorListeners(SemanticException e) {
        programManager
                .getNotificationManager()
                .notifyErrorListeners(new SemanticErrorEvent(this, e));
    }

    protected void tryExecution() {
        try {
            programManager.getExecutionManager().tryExecution();
        } catch(InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }

    abstract public void execute();
}
