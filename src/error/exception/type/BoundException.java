package error.exception.type;

import storage.Storage;
import util.Keyword;

public class BoundException extends TypeMismatchException {

    public BoundException(Storage.Type offendingType) {
        super("bound exception, expected "
                        + Keyword.INT + ", found "
                        + Keyword.parseKeyword(offendingType)
                , Storage.Type.INT, offendingType);
    }
}
