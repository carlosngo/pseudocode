package exception;

public class ArrayIndexException extends SemanticException {
    public ArrayIndexException() {
        super("array index should be an integer");
    }
}
