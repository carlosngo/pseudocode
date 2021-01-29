package manager;

import gen.PseudocodeParser;
import statement.compound.FunctionCallStatement;

public class ProgramManager implements Manager {
    private final ExecutionManager executionManager;
    private final FunctionManager functionManager;
    private final NotificationManager notificationManager;

    public ProgramManager(NotificationManager notificationManager) {
        executionManager = new ExecutionManager();
        functionManager = new FunctionManager();
        this.notificationManager = notificationManager;
    }

    public ExecutionManager getExecutionManager() {
        return executionManager;
    }

    public FunctionManager getFunctionManager() {
        return functionManager;
    }

    public NotificationManager getNotificationManager() {
        return notificationManager;
    }

    public void executeProgram() {
        new FunctionCallStatement(
                this, "main", new PseudocodeParser.ExpressionContext[0])
                .execute(null);
    }

    @Override
    public void reset() {
        executionManager.resumeExecution();
        functionManager.reset();
    }
}
