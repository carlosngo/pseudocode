package error.exception.type;

import storage.Storage;
import util.Keyword;

public class ReturnException extends TypeMismatchException {

    public ReturnException(Storage.Type expectedType, Storage.Type offendingType) {
        super("return type mismatch, expected " + Keyword.parseKeyword(expectedType)
                + ", found " + Keyword.parseKeyword(offendingType)
                , expectedType, offendingType);
    }
}
