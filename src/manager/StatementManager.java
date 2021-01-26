package manager;

import statement.Statement;
import statement.compound.CompoundStatement;
import statement.compound.IfStatement;
import statement.compound.IterationStatement;

import java.util.Stack;

public class StatementManager implements Manager {
    private Stack<Statement> callStack;

    private Statement currentCompoundStatement;

    private boolean inPositive;

    public StatementManager() {
        callStack = new Stack<>();
        currentCompoundStatement = null;
        inPositive = true;
    }

    public void setCurrentCompoundStatement(IfStatement ifStatement) {
        callStack.push(ifStatement);
        currentCompoundStatement = ifStatement;
    }

    public void setCurrentCompoundStatement(CompoundStatement compoundStatement) {
        callStack.push(compoundStatement);
        currentCompoundStatement = compoundStatement;
    }


    @Override
    public void reset() {
        callStack.clear();
        currentCompoundStatement = null;
        inPositive = true;
    }
}
