package notification.event;

import statement.compound.FunctionCallStatement;

import java.util.Stack;

public class ExecuteErrorEvent extends PseudocodeEvent {
    private final Stack<FunctionCallStatement> callStack;

    public ExecuteErrorEvent(Object source, Stack<FunctionCallStatement> callStack) {
        super(source);
        this.callStack = callStack;
    }

    public Stack<FunctionCallStatement> getCallStack() {
        return callStack;
    }
}
