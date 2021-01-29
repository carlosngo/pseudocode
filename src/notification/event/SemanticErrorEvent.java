package notification.event;

import error.exception.CompilationException;

public class SemanticErrorEvent extends PseudocodeEvent {
    private final CompilationException error;

    public SemanticErrorEvent(Object source, CompilationException error) {
        super(source);
        this.error = error;
    }

    public CompilationException getError() {
        return error;
    }
}
