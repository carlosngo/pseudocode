package storage;

import manager.VariableManager;
import statement.Statement;
import statement.compound.CompoundStatement;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Function extends Storage {
    public enum ReturnType {
        CHAR,
        BOOLEAN,
        SHORT,
        INT,
        LONG,
        FLOAT,
        DOUBLE,
        STRING,
        VOID
    }
    private final ReturnType returnType;
    private final ArrayList<Statement> statements;
    private final ArrayList<Variable> parameters;
    private final VariableManager variableManager;

    public Function(ReturnType returnType, String name,
                    ArrayList<Variable> parameters) {
        super(name);
        this.returnType = returnType;
        this.parameters = parameters;
        statements = new ArrayList<>();
        variableManager = new VariableManager();
    }

    public ReturnType getReturnType() {
        return returnType;
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
