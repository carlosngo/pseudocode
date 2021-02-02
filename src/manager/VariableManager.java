package manager;

import exception.SemanticException;
import exception.StorageRedeclarationException;
import exception.UndeclaredStorageException;
import storage.Variable;

import java.util.HashMap;

public class VariableManager implements Manager {
    private final HashMap<String, Variable> variables;

    public VariableManager() {
        variables = new HashMap<>();
    }

    public VariableManager(VariableManager variableManager) {
        this();
        HashMap<String, Variable> parentScope = variableManager.getVariables();
        try {
            for (String varName : parentScope.keySet()) {
                addVariable(parentScope.get(varName));
            }
        } catch (SemanticException e) {
            System.err.println("unexpected " + e.getMessage());
        }
    }

    private HashMap<String, Variable> getVariables() {
        return variables;
    }

    public Variable getVariable(String identifier)
            throws UndeclaredStorageException {
        if (!variables.containsKey(identifier)) {
            throw new UndeclaredStorageException(identifier, false);
        }
        Variable variable = variables.get(identifier);
        return variable;
    }

    public void addVariable(Variable variable)
            throws StorageRedeclarationException {
        String name = variable.getName();
        try {
            getVariable(name);
            throw new StorageRedeclarationException(name, false);
        } catch(UndeclaredStorageException e) {
            variables.put(name, variable);
        }
    }

    @Override
    public void reset() {
        variables.clear();
    }
}
