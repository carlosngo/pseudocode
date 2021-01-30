package error.exception.type;

import error.exception.CompilationException;
import storage.Storage;

public abstract class TypeMismatchException extends CompilationException {
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