package manager;

import error.exception.StorageRedeclarationException;
import statement.Statement;
import statement.compound.CompoundStatement;
import statement.compound.FunctionCallStatement;
import statement.compound.IfStatement;
import storage.Variable;

import java.util.Stack;

public class CompilationManager implements Manager {
    private final Stack<CompoundStatement> statementStack;

    public CompilationManager() {
        statementStack = new Stack<>();
    }

    public void enterCompoundStatement(CompoundStatement statement) {
        statement
                .getProgramManager()
                .getFunctionManager()
                .getCurrentFunction()
                .getVariableManager()
                .enterNewScope();
        statementStack.push(statement);
    }

    public void exitCompoundStatement() {
        CompoundStatement current = statementStack.pop();
        if (statementStack.isEmpty()) {
            System.err.println("done with function");
            return;
        }
        addStatement(current);
        current
                .getProgramManager()
                .getFunctionManager()
                .getCurrentFunction()
                .getVariableManager()
                .exitCurrentScope();
    }

    public void enterPositive() {
        ((IfStatement) statementStack.peek()).enterPositive();
    }

    public void enterNegative() {
        ((IfStatement) statementStack.peek()).exitPositive();
    }

    public void addStatement(Statement statement) {
        CompoundStatement current = statementStack.peek();
        if (current instanceof IfStatement) {
            IfStatement ifStatement = (IfStatement) current;
            if (ifStatement.isInPositive()) {
                ifStatement.addStatement(statement);
            } else {
                ifStatement.addNegativeStatement(statement);
            }
        } else {
            current.addStatement(statement);
        }
    }

    @Override
    public void reset() {
        statementStack.clear();
    }
}
