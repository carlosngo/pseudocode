package exception;

import storage.Storage;
import util.Keyword;

public class ExpressionEvaluationException extends SemanticException {
    private final Storage.Type leftType;
    private final Storage.Type rightType;
    private final String operator;

    public ExpressionEvaluationException(Storage.Type leftType
            , String operator
            , Storage.Type rightType) {
        super("operator '" + operator + "' cannot be applied to '"
                + Keyword.parseKeyword(leftType)
                + "' and '"
                + Keyword.parseKeyword(rightType) + "'");
        this.leftType = leftType;
        this.rightType = rightType;
        this.operator = operator;
    }

    public Storage.Type getLeftType() {
        return leftType;
    }

    public Storage.Type getRightType() {
        return rightType;
    }

    public String getOperator() {
        return operator;
    }
}
