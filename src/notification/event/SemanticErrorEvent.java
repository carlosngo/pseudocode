package notification.event;

import exception.SemanticException;

public class SemanticErrorEvent extends PseudocodeEvent {
    private final SemanticException error;

    public SemanticErrorEvent(Object source, SemanticException error) {
        super(source);
        this.error = error;
    }

    public SemanticException getError() {
        return error;
    }

}
