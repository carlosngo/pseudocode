package statement.compound;

import manager.ExecutionManager;
import manager.ProgramManager;
import manager.VariableManager;
import statement.Statement;

import java.util.ArrayList;

public class CompoundStatement extends Statement {
    private final ArrayList<Statement> statements;
    private final VariableManager localVariables;
    private boolean breakFlag;

    public CompoundStatement(ProgramManager programManager, VariableManager parentVariables, int lineNumber) {
        super(programManager, lineNumber);
        localVariables = new VariableManager(parentVariables);
        statements = new ArrayList<>();
        breakFlag = false;
    }

    public VariableManager getLocalVariables() {
        return localVariables;
    }

    public boolean hasBroken() {
        return breakFlag;
    }

    public void stopExecution() {
        breakFlag = true;
    }

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    public void addStatement(Statement statement) {
        statements.add(statement);
    }

    protected void executeOneIteration() {
        for (int i = 0; i < statements.size() && !hasBroken(); i++) {
            getStatements().get(i).execute();
        }
    }

    @Override
    public void execute() {
        tryExecution();
        ExecutionManager executionManager = getProgramManager().getExecutionManager();
        executionManager.enterBlock(this);
        executeOneIteration();
        executionManager.exitBlock();
    }
}
