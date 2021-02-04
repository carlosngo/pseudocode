package exception;

public class MissingReturnException extends SemanticException {
    public MissingReturnException() {
        super("missing return statement. not all code paths return a value");
    }
}
