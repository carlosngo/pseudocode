package storage;

import statement.Statement;
import statement.compound.CompoundStatement;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Function extends Storage implements CompoundStatement {
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
    private ReturnType returnType;
    private Variable returnValue;
    private ArrayList<Statement> statements;
    private LinkedHashMap<String, Variable> parameters;

    public Function(ReturnType returnType, String name) {
        super(name);
        this.returnType = returnType;
        statements = new ArrayList<>();
        parameters = new LinkedHashMap<>();
    }

    public void addStatement(Statement statement) {
        statements.add(statement);
    }

    public void execute() {
        for (Statement statement : statements) {
            statement.execute();
        }
    }
}
