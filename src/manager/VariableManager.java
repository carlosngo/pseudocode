package manager;

import error.exception.StorageRedeclarationException;
import error.exception.UndeclaredStorageException;
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
            variables.put(name, variable);
        }
    }

//    private Variable getVariable(String identifier, int level)
//            throws UndeclaredStorageException {
//        if (!variables.containsKey(identifier)) {
//            throw new UndeclaredStorageException(identifier, false);
//        }
//        Variable variable = variables.get(identifier);
//        if (isInsideScope(variable, level)) {
//            throw new UndeclaredStorageException(identifier, false);
//        }
//        return variable;
//    }




//    public Object getValue(String variableName)
//            throws UndeclaredStorageException {
//        return getVariable(variableName, currentLevel).getValue();
//    }
//
//    public Object getValue(String arrayName, int index)
//            throws UndeclaredStorageException {
//        Object[] array = (Object[]) getVariable(arrayName, currentLevel).getValue();
//        return array[index];
//    }



//    public void addVariable(boolean isFinal, Variable.Type type, String name)
//            throws StorageRedeclarationException {
//        Variable variable = new Variable(isFinal, type, name, currentLevel);
//        try {
//            getVariable(name, currentLevel);
//            throw new StorageRedeclarationException(name, false);
//        } catch(UndeclaredStorageException e) {
//            variables.put(name, variable);
//        }
//    }
//
//    public void addArray(boolean isFinal, Variable.Type type, String name, int size)
//            throws StorageRedeclarationException {
//        Array array = new Array(isFinal, type, name, currentLevel, size);
//        try {
//            getVariable(name, currentLevel);
//            throw new StorageRedeclarationException(name, false);
//        } catch(UndeclaredStorageException e) {
//            variables.put(name, array);
//        }
//    }

//    public void addArray(Array array)
//            throws StorageRedeclarationException {
//        String name = array.getName();
//        try {
//            getVariable(name, array.getLevel());
//            throw new StorageRedeclarationException(name, false);
//        } catch(UndeclaredStorageException e) {
//            variables.put(name, array);
//        }
//    }

//    public void updateVariable(String name, Object value)
//            throws ConstantReassignmentException, UndeclaredStorageException, TypeMismatchException {
//        Variable variable = getVariable(name, currentLevel);
//        variable.setValue(value);
//    }
//
//    public void updateArray(String name, int index, Object value)
//            throws IndexOutOfBoundsException, UndeclaredStorageException, TypeMismatchException {
//        Array array = (Array) getVariable(name, currentLevel);
//        array.set(index, value);
//    }

    private boolean isInsideScope(Variable variable, int level) {
        return variable.getLevel() >= level;
    }

    @Override
    public void reset() {
        variables.clear();
    }
}
