package manager;

import exception.StorageRedeclarationException;
import exception.UndeclaredStorageException;
import storage.Variable;

import java.util.HashMap;

public class VariableManager implements Manager {
    private final HashMap<String, Variable> variables;
    private int currentLevel;

    public VariableManager() {
        variables = new HashMap<>();
        currentLevel = 0;
    }

    public int getCurrentLevel() { return currentLevel; }

    public void enterNewScope() {
        currentLevel++;
    }

    public void exitCurrentScope() {
        currentLevel--;
    }

    public Variable getVariable(String identifier)
            throws UndeclaredStorageException {
        if (!variables.containsKey(identifier)) {
            throw new UndeclaredStorageException(identifier, false);
        }
        Variable variable = variables.get(identifier);
        if (isInsideScope(variable, currentLevel)) {
            throw new UndeclaredStorageException(identifier, false);
        }
        return variable;
    }

    public void addVariable(Variable variable)
            throws StorageRedeclarationException {
        String name = variable.getName();
        try {
            getVariable(name);
            throw new StorageRedeclarationException(name, false);
        } catch(UndeclaredStorageException e) {
            variable.setLevel(currentLevel);
            variables.put(name, variable);
        }
    }

    private boolean isInsideScope(Variable variable, int level) {
        return variable.getLevel() >= level;
    }

    @Override
    public void reset() {
        variables.clear();
    }
}
