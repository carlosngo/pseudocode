package notification.event;

public class ScanStartEvent extends PseudocodeEvent {
    private final String message;

    public ScanStartEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
