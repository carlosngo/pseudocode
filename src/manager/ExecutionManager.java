package manager;

import error.exception.ParameterMismatchException;
import error.exception.UndeclaredStorageException;
import execution.ExecutionMonitor;
import gen.PseudocodeParser;
import notification.NotificationCenter;
import statement.FunctionCallStatement;
import storage.Function;

public class ExecutionManager implements Manager {
    private final ExecutionMonitor executionMonitor;
    private final FunctionManager functionManager;
    private final NotificationCenter notificationCenter;

    public ExecutionManager(NotificationCenter notificationCenter) {
        executionMonitor = new ExecutionMonitor();
        functionManager = new FunctionManager();
        this.notificationCenter = notificationCenter;
    }

    public ExecutionMonitor getExecutionMonitor() {
        return executionMonitor;
    }

    public FunctionManager getFunctionManager() {
        return functionManager;
    }

    public NotificationCenter getNotificationCenter() {
        return notificationCenter;
    }

    public void execute() {
        new FunctionCallStatement(
                this, "main", new PseudocodeParser.ExpressionContext[0])
                .execute(null);
    }

    @Override
    public void reset() {
        executionMonitor.resumeExecution();
        functionManager.reset();
    }
}
