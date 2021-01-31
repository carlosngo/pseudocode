package notification.event;

public class CompileStartEvent extends PseudocodeEvent {
    private final String sourceCode;

    public CompileStartEvent(Object source, String sourceCode) {
        super(source);
        this.sourceCode = sourceCode;
    }

    public String getSourceCode() {
        return sourceCode;
    }
}
