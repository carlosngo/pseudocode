package statement.compound;

import manager.ProgramManager;
import statement.Statement;

public abstract class CompoundStatement extends Statement {
    public CompoundStatement(ProgramManager programManager) {
        super(programManager);
    }

    abstract void addStatement(Statement statement);
}
