package notification.event;

public abstract class PseudocodeEvent {
    private final Object source;

    public PseudocodeEvent(Object source) {
        this.source = source;
    }

    public Object getSource() {
        return source;
    }
}
