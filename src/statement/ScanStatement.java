package statement;

import exception.SemanticException;
import manager.ProgramManager;
import notification.event.ScanStartEvent;
import notification.event.SemanticErrorEvent;

public class ScanStatement extends Statement {
    private final String message;
    private final String identifier;

    public ScanStatement(ProgramManager programManager
            , String message
            , String identifier
            , int lineNumber) {
        super(programManager, lineNumber);
        this.message = message;
        this.identifier = identifier;
        try {
            programManager
                    .getFunctionManager()
                    .getCurrentFunction()
                    .getVariableManager()
                    .getVariable(identifier);
        } catch(SemanticException e) {
            notifyErrorListeners(e);
        }
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public void execute() {
        tryExecution();
        ScanStartEvent evt = new ScanStartEvent(this, message);
        getProgramManager()
                .getNotificationManager()
                .notifyScanListeners(evt);
    }

}

