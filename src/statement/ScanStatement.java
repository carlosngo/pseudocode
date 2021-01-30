package statement;

import error.exception.CompilationException;
import manager.NotificationManager;
import manager.ProgramManager;
import notification.event.EndScanEvent;
import notification.event.SemanticErrorEvent;
import notification.event.StartScanEvent;

public class ScanStatement extends Statement {
    private final String message;
    private final String identifier;

    public ScanStatement(ProgramManager programManager, String message, String identifier) {
        super(programManager);
        this.message = message;
        this.identifier = identifier;
        NotificationManager notificationManager = programManager.getNotificationManager();
        try {
            programManager
                    .getFunctionManager()
                    .getCurrentFunction()
                    .getVariableManager()
                    .getVariable(identifier);
        } catch(CompilationException e) {
            SemanticErrorEvent evt = new SemanticErrorEvent(this, e);
            notificationManager.notifyErrorListeners(evt);
        }
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public void execute() {
        super.execute();
        StartScanEvent evt = new StartScanEvent(this, message);
        getProgramManager()
                .getNotificationManager()
                .notifyScanListeners(evt);
    }

}

