package manager;

import scope.Scope;

public class ScopeManager implements Manager {
    private Scope currentScope;

    public ScopeManager() {
        currentScope = null;
    }

    public Scope getCurrentScope() {
        return currentScope;
    }

    public Scope enterNewScope() {
        if (currentScope == null) {
            currentScope = new Scope();
        } else {
            Scope childScope = new Scope(currentScope);
            currentScope.addChildScope(childScope);
            currentScope = childScope;
        }
        return currentScope;
    }

    public void exitCurrentScope() {
        Scope parentScope = currentScope.getParentScope();
        if (parentScope == null) {
            System.err.println("reached root scope");
            return;
        }
        currentScope = parentScope;
    }

    @Override
    public void reset() {
        currentScope = null;
    }
}
