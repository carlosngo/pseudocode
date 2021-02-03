package exception;

public class PrintException extends SemanticException {
    public PrintException() {
        super("invalid argument for print statement. expected String");
    }
}
