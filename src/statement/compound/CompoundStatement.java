package statement.compound;

import statement.Statement;

public interface CompoundStatement extends Statement {
    void addStatement(Statement statement);
}
