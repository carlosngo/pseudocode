package exception.type;

import exception.SemanticException;
import storage.Storage;

public abstract class TypeMismatchException extends SemanticException {
    private final Storage.Type expectedType;
    private final Storage.Type offendingType;


    public TypeMismatchException(String msg, Storage.Type expectedType, Storage.Type offendingType) {
        super(msg);
        this.expectedType = expectedType;
        this.offendingType = offendingType;
    }

    public Storage.Type getExpectedType() {
        return expectedType;
    }

    public Storage.Type getOffendingType() {
        return offendingType;
    }
}
