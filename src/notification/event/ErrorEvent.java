package notification.event;

import error.exception.PseudocodeException;

public class ErrorEvent extends PseudocodeEvent {
    private final PseudocodeException error;

    public ErrorEvent(Object source, PseudocodeException error) {
        super(source);
        this.error = error;
    }

    public PseudocodeException getError() {
        return error;
    }
}
