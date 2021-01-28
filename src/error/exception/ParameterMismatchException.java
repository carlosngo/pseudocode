package error.exception;

import storage.Variable;
import util.Keyword;

public class ParameterMismatchException extends PseudocodeException {
    private Variable.Type expectedType;
    private Variable.Type offendingType;

    public ParameterMismatchException(Variable.Type expectedType, Variable.Type offendingType) {
        super("parameter mismatch, " +
                (expectedType == null
                ? "too many parameters"
                : (offendingType == null
                ? "missing parameters"
                : "expected " + Keyword.parseKeyword(expectedType)
                + ", found " + Keyword.parseKeyword(offendingType))));
        this.expectedType = expectedType;
        this.offendingType = offendingType;
    }

    public Variable.Type getExpectedType() {
        return expectedType;
    }

    public Variable.Type getOffendingType() {
        return offendingType;
    }
}
