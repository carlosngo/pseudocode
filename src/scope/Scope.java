package scope;

import exception.StorageRedeclarationException;
import exception.UndeclaredStorageException;
import storage.Variable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class Scope {

    private final Scope parentScope;
    private final ArrayList<Scope> childScopes;

    private final HashMap<String, Variable> variables;

    public Scope() {
        this(null);
    }

    public Scope(Scope parentScope) {
        this.parentScope = parentScope;
        childScopes = new ArrayList<>();
        variables = new HashMap<>();
    }

    public Scope getParentScope() {
        return parentScope;
    }

    public ArrayList<Scope> getChildScopes() {
        return childScopes;
    }

    public void addChildScope(Scope scope) {
        childScopes.add(scope);
    }

    public void addVariable(Variable variable) throws StorageRedeclarationException {
        String name = variable.getName();
        try {
            searchVariable(name);
            throw new StorageRedeclarationException(name, false);
        } catch(UndeclaredStorageException e) {
            variables.put(name, variable);
        }
    }

    public Variable getVariable(String identifier) {
        if (!variables.containsKey(identifier)) {
            return null;
        }
        return variables.get(identifier);
    }

    public Variable searchVariable(String identifier) throws UndeclaredStorageException {
        Scope curScope = this;
        while (curScope != null) {
            Variable variable = curScope.getVariable(identifier);
            if (variable != null) {
                return variable;
            }
            curScope = curScope.getParentScope();
        }
        throw new UndeclaredStorageException(identifier, false);
    }
}
