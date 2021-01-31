package exception.type;

import storage.Storage;
import util.Keyword;

public class ConditionException extends TypeMismatchException {

    public ConditionException(Storage.Type offendingType) {
        super("condition exception, expected " 
                        + Keyword.BOOLEAN + ", found "
                        + Keyword.parseKeyword(offendingType)
                , Storage.Type.BOOLEAN, offendingType);
    }
}
