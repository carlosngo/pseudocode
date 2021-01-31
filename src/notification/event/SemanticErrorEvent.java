package notification.event;

import error.exception.SemanticException;

public class SemanticErrorEvent extends PseudocodeEvent {
    private final SemanticException error;
    private final int lineNumber;

    public SemanticErrorEvent(Object source, SemanticException error, int lineNumber) {
        super(source);
        this.error = error;
        this.lineNumber = lineNumber;
    }

    public SemanticException getError() {
        return error;
    }

    public int getLineNumber() { return lineNumber; }
}
