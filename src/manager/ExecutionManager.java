package manager;

import error.exception.SemanticException;
import gen.PseudocodeParser;
import notification.event.*;
import notification.listener.ExecuteListener;
import notification.listener.ScanListener;
import statement.ScanStatement;
import statement.compound.CompoundStatement;
import statement.compound.FunctionCallStatement;
import statement.compound.IterationStatement;

import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutionManager
        implements Runnable, Manager, ScanListener, ExecuteListener {
    private final ProgramManager programManager;
    private final ExecutorService executorService;
    private final Stack<FunctionCallStatement> callStack;
    private final Stack<CompoundStatement> controlStack;
    private ScanStatement awaitingScanStatement;
    private final Object executionGate = new Object();
    private boolean executionFlag;

    public ExecutionManager(ProgramManager programManager) {
        this.programManager = programManager;
        executorService = Executors.newSingleThreadExecutor();
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
    public void onScanStart(ScanStartEvent e) {
        awaitingScanStatement = (ScanStatement) e.getSource();
        stopExecution();
    }

    @Override
    public void onScanEnd(ScanEndEvent evt) {
        resumeExecution();
        try {
            callStack.peek()
                    .getLocalVariables()
                    .getVariable(awaitingScanStatement.getIdentifier())
                    .setValue(evt.getInput());
        } catch(SemanticException e) {
            System.err.println("unexpected " + e.getMessage() + " at runtime");
        }
    }

    @Override
    public void run() {
        try {
            new FunctionCallStatement(
                    programManager
                    , "main"
                    , new PseudocodeParser.ExpressionContext[0])
                    .execute();
            programManager
                    .getNotificationManager()
                    .notifyExecuteListeners(new ExecuteSuccessEvent(this));
        } catch(SemanticException e) {
            System.err.println("unexpected semantic error" + e.getMessage() + "during runtime");
            programManager
                    .getNotificationManager()
                    .notifyExecuteListeners(new ExecuteErrorEvent(this, callStack));
        }
    }

    @Override
    public void onExecuteStart(ExecuteStartEvent e) {
        executorService.execute(this);
    }

    @Override
    public void onExecuteSuccess(ExecuteSuccessEvent e) {}

    @Override
    public void onExecuteError(ExecuteErrorEvent e) {}
}
