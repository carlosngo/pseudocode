package notification.event;

public class EndScanEvent extends PseudocodeEvent {
    private final String input;

    public EndScanEvent(Object source, String input) {
        super(source);
        this.input = input;
    }

    public String getInput() {
        return input;
    }
}
