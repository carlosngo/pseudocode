package error.exception;

import storage.Variable.Type;
import util.Keyword;

public class TypeMismatchException extends PseudocodeException {
    private final Type expectedType;
    private final Type offendingType;

    public TypeMismatchException(Type expectedType, Type offendingType) {
        super("type mismatch, expected " + Keyword.parseKeyword(expectedType)
                + ", found " + Keyword.parseKeyword(offendingType));
        this.expectedType = expectedType;
        this.offendingType = offendingType;
    }

    public Type getExpectedType() {
        return expectedType;
    }

    public Type getOffendingType() {
        return offendingType;
    }
}
