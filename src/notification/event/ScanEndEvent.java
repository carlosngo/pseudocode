package notification.event;

public class ScanEndEvent extends PseudocodeEvent {
    private final String input;

    public ScanEndEvent(Object source, String input) {
        super(source);
        this.input = input;
    }

    public String getInput() {
        return input;
    }
}
