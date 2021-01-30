package statement.compound;

import manager.ProgramManager;
import manager.VariableManager;
import statement.Statement;

public abstract class CompoundStatement extends Statement {
    private boolean breakFlag;

    public CompoundStatement(ProgramManager programManager) {
        super(programManager);
        breakFlag = false;
    }

    public boolean hasBroken() {
        return breakFlag;
    }

    public void stopExecution() {
        breakFlag = true;
    }

    public abstract void addStatement(Statement statement);

    @Override
    public void execute() {
        super.execute();
    }
}
