package exception;

import storage.Variable;

public class NotArrayException extends SemanticException {
    Variable variable;

    public NotArrayException(Variable variable) {
        super("invalid array access of non-array variable '"
                + variable.getName() + "'");
        this.variable = variable;
    }

    public Variable getVariable() {
        return variable;
    }
}
