package exception;

import storage.Array;
import storage.Variable;

public class ConstantReassignmentException extends Exception {
    private final Variable constant;

    public ConstantReassignmentException(Variable constant) {
        super(constant instanceof Array
                ? "arrays cannot be re-instantiated"
                : "variable '" + constant.getName() + "' is final"
        );
        this.constant = constant;
    }

    public Variable getConstant() {
        return constant;
    }
}
