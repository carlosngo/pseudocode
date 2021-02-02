package storage;

import exception.SemanticException;
import manager.VariableManager;
import statement.Statement;
import statement.compound.CompoundStatement;
import util.Keyword;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Function extends Storage {
    private final ArrayList<Statement> statements;
    private final ArrayList<Variable> parameters;

    public Function(Type returnType, String name,
                    ArrayList<Variable> parameters) {
        super(returnType, name);
        this.parameters = parameters;
        statements = new ArrayList<>();
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

    public String toString() {
        StringBuilder sb = new StringBuilder(Keyword.parseKeyword(getType()) + " " + getName() + "(");
        for (Variable variable : parameters) {
            sb.append(variable.toString() + ",");
        }
        sb.append(")");
        return sb.toString();
    }
}
