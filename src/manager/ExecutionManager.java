package manager;

import error.exception.CompilationException;
import notification.event.EndScanEvent;
import notification.event.StartScanEvent;
import notification.listener.PseudocodeListener;
import notification.listener.ScanListener;
import statement.ScanStatement;
import statement.compound.CompoundStatement;
import statement.compound.FunctionCallStatement;
import statement.compound.IterationStatement;

import java.util.Stack;

public class ExecutionManager implements Manager, ScanListener {

    private final Stack<FunctionCallStatement> callStack;
    private final Stack<CompoundStatement> controlStack;
    private ScanStatement awaitingScanStatement;
    private final Object executionGate = new Object();
    private boolean executionFlag;

    public ExecutionManager() {
        callStack = new Stack<>();
        controlStack = new Stack<>();
        executionFlag = true;
    }

    public void enterBlock(CompoundStatement statement) {
        controlStack.push(statement);
        if (statement instanceof FunctionCallStatement) {
            callStack.push((FunctionCallStatement) statement);
        } else {
            getCurrentFunctionCall().getLocalVariables().enterNewScope();
        }
    }

    public CompoundStatement exitBlock() {
        CompoundStatement statement = controlStack.pop();
        if (statement instanceof FunctionCallStatement) {
            callStack.pop();
        } else {
            getCurrentFunctionCall().getLocalVariables().exitCurrentScope();
        }
        return statement;
    }

    public void triggerReturn(Object value) {
        while (!(controlStack.peek() instanceof FunctionCallStatement)) {
            exitBlock().stopExecution();
        }
        FunctionCallStatement returnedFunction = (FunctionCallStatement) exitBlock();
        returnedFunction.setReturnValue(value);
        returnedFunction.stopExecution();
    }

    public void triggerBreak() {
        while (!(controlStack.peek() instanceof IterationStatement)) {
            exitBlock().stopExecution();
        }
        exitBlock().stopExecution();
    }

    public FunctionCallStatement getCurrentFunctionCall() {
        return callStack.peek();
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

    @Override
    public void reset() {
        callStack.empty();
        executionFlag = true;
    }

    @Override
    public void onScanStart(StartScanEvent e) {
        awaitingScanStatement = (ScanStatement) e.getSource();
        stopExecution();
    }

    @Override
    public void onScanEnd(EndScanEvent evt) {
        resumeExecution();
        try {
            callStack.peek()
                    .getLocalVariables()
                    .getVariable(awaitingScanStatement.getIdentifier())
                    .setValue(evt.getInput());
        } catch(CompilationException e) {
            System.err.println("unexpected " + e.getMessage() + " at runtime");
        }
    }
}
