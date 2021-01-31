package statement;

import error.exception.SemanticException;
import manager.ProgramManager;
import notification.event.ScanStartEvent;

public class ScanStatement extends Statement {
    private final String message;
    private final String identifier;

    public ScanStatement(ProgramManager programManager, String message, String identifier) throws SemanticException {
        super(programManager);
        this.message = message;
        this.identifier = identifier;
        programManager
                .getFunctionManager()
                .getCurrentFunction()
                .getVariableManager()
                .getVariable(identifier);
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public void execute() {
        super.execute();
        ScanStartEvent evt = new ScanStartEvent(this, message);
        getProgramManager()
                .getNotificationManager()
                .notifyScanListeners(evt);
    }

}

