package manager;

import gen.PseudocodeParser.ExpressionContext;
import statement.compound.FunctionCallStatement;

public class ProgramManager implements Manager, Runnable {
    private final ExecutionManager executionManager;
    private final FunctionManager functionManager;
    private final NotificationManager notificationManager;
    private final CompilationManager compilationManager;

    public ProgramManager(NotificationManager notificationManager) {
        executionManager = new ExecutionManager();
        functionManager = new FunctionManager();
        this.notificationManager = notificationManager;
        compilationManager = new CompilationManager();
        notificationManager.addListener(executionManager);
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

    public void compile() {

    }

    @Override
    public void run() {
        new FunctionCallStatement(
                this, "main", new ExpressionContext[0])
                .execute();
    }

    @Override
    public void reset() {
        executionManager.resumeExecution();
        functionManager.reset();
    }
}
