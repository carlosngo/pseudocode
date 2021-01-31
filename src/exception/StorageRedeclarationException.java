package exception;

public class StorageRedeclarationException extends SemanticException {
    private final String storageName;
    private final boolean isFunction;

    public StorageRedeclarationException(String storageName, boolean isFunction) {
        super("redeclaration of "
                + (isFunction ? "function '" : "variable '") + storageName + "'");
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
