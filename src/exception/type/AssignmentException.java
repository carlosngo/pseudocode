package exception.type;

import storage.Storage;
import util.Keyword;

public class AssignmentException extends TypeMismatchException {
    public AssignmentException(Storage.Type expectedType, Storage.Type offendingType) {
        super("assignment type mismatch, expected " + Keyword.parseKeyword(expectedType)
                + ", found " + Keyword.parseKeyword(offendingType)
                , expectedType, offendingType);
    }
}
