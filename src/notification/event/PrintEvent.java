package notification.event;

public class PrintEvent extends PseudocodeEvent {
    private final String message;

    public PrintEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
