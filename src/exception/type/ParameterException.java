package exception.type;

import exception.SemanticException;
import storage.Storage;
import util.Keyword;

public class ParameterException extends SemanticException {
    private final Storage.Type expectedType;
    private final Storage.Type offendingType;

    public ParameterException(Storage.Type expectedType, Storage.Type offendingType) {
        super("parameter mismatch, " +
                (expectedType == null
                ? "too many parameters"
                : (offendingType == null
                ? "missing parameters"
                : "expected " + Keyword.parseKeyword(expectedType)
//                + ", found " + Keyword.parseKeyword(offendingType)
                )));
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
