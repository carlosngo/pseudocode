package notification.event;

public class StartScanEvent extends PseudocodeEvent {
    private final String message;

    public StartScanEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
