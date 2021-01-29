package storage;

import manager.VariableManager;
import statement.Statement;
import statement.compound.CompoundStatement;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Function extends Storage {
    private final ArrayList<Statement> statements;
    private final ArrayList<Variable> parameters;
    private final VariableManager variableManager;

    public Function(Type returnType, String name,
                    ArrayList<Variable> parameters) {
        super(returnType, name);
        this.parameters = parameters;
        statements = new ArrayList<>();
        variableManager = new VariableManager();
    }

    public ArrayList<Variable> getParameters() {
        return parameters;
    }

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    public void addStatement(Statement statement) {
        statements.add(statement);
    }

    public VariableManager getVariableManager() {
        return variableManager;
    }
}
