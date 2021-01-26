package exception;

public class UndeclaredStorageException extends Exception {
    private final String storageName;
    private final boolean isFunction;

    public UndeclaredStorageException(String storageName, boolean isFunction) {
        super("undeclared "
                + (isFunction ? "function '" : "variable '")
                + storageName + "'");
        this.storageName = storageName;
        this.isFunction = isFunction;
    }

    public String getStorageName() {
        return storageName;
    }

    public boolean isFunction() {
        return isFunction;
    }
}
