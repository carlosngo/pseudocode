package manager;

import exception.StorageRedeclarationException;
import exception.UndeclaredStorageException;
import storage.Function;

import java.util.HashMap;

public class FunctionManager implements Manager {
    private final HashMap<String, Function> functions;

    private Function currentFunction;

    public FunctionManager() {
        functions = new HashMap<>();
        currentFunction = null;
    }

    public Function getCurrentFunction() {
        return currentFunction;
    }

    public void enterFunction(Function function) {
        currentFunction = function;
    }

    public void exitFunction() {

        currentFunction = null;
    }

    public Function getFunction(String identifier)
            throws UndeclaredStorageException {
        if (!functions.containsKey(identifier)) {
            throw new UndeclaredStorageException(identifier, true);
        }
        return functions.get(identifier);
    }

    public void addFunction(Function function)
            throws StorageRedeclarationException {
        String name = function.getName();
        try {
            getFunction(name);
            throw new StorageRedeclarationException(name, true);
        } catch(UndeclaredStorageException e) {
            functions.put(name, function);
        }
    }

    @Override
    public void reset() {
        functions.clear();
    }
}
