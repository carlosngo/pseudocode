package statement;

import error.exception.PseudocodeException;
import manager.ExecutionManager;
import manager.VariableManager;

public abstract class Statement {
    private final ExecutionManager executionManager;

    public Statement(ExecutionManager executionManager) {
        this.executionManager = executionManager;
    }

    public ExecutionManager getExecutionManager() {
        return executionManager;
    }

    public void execute(VariableManager variableManager) {
        try {
            executionManager.getExecutionMonitor().tryExecution();
        } catch(InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
