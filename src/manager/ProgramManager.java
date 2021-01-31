package manager;

public class ProgramManager implements Manager {

    private final ExecutionManager executionManager;
    private final FunctionManager functionManager;
    private final NotificationManager notificationManager;
    private final CompilationManager compilationManager;

    public ProgramManager(NotificationManager notificationManager) {
        this.notificationManager = notificationManager;
        executionManager = new ExecutionManager(this);
        functionManager = new FunctionManager();
        compilationManager = new CompilationManager(this);
        notificationManager.addListener(executionManager);
        notificationManager.addListener(compilationManager);
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

    public CompilationManager getCompilationManager() { return compilationManager; }

    @Override
    public void reset() {
        executionManager.resumeExecution();
        functionManager.reset();
    }
}
