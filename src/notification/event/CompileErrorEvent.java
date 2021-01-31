package notification.event;

import java.util.ArrayList;

public class CompileErrorEvent extends PseudocodeEvent {
    private final ArrayList<String> errorList;

    public CompileErrorEvent(Object source, ArrayList<String> errorList) {
        super(source);
        this.errorList = errorList;
    }

    public ArrayList<String> getErrorList() {
        return errorList;
    }
}
