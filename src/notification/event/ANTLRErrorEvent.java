package notification.event;

import org.antlr.runtime.RecognitionException;

public class ANTLRErrorEvent extends PseudocodeEvent {
    private final RecognitionException error;

    public ANTLRErrorEvent(Object source, RecognitionException error) {
        super(source);
        this.error = error;
    }

    public RecognitionException getError() {
        return error;
    }
}
