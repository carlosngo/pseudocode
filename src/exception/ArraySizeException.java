package exception;

public class ArraySizeException extends SemanticException {
    public ArraySizeException() {
        super("array size should be an integer");
    }
}
