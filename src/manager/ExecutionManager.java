package manager;

public class ExecutionManager {

    private final Object executionGate = new Object();
    private boolean executionFlag;

    public ExecutionManager() {
        executionFlag = true;
    }

    public void tryExecution() throws InterruptedException {
        synchronized(executionGate) {
            while (!executionFlag) {
                executionGate.wait();
            }
        }
    }

    public void stopExecution() {
        executionFlag = false;
    }

    public void resumeExecution() {
        synchronized(executionGate) {
            executionFlag = true;
            executionGate.notify();
        }
    }
}
