package manager;

import statement.Statement;
import statement.compound.CompoundStatement;

public class StatementManager implements Manager {
    private FunctionManager functionManager;
    private CompoundStatement previousCompoundStatement;
    private CompoundStatement currentCompoundStatement;

    private boolean inPositive;

    public void enterCompoundStatement(Statement statement) {

    }

    public void exitCompoundStatement() {
        if (previousCompoundStatement != null) {
            if (inPositive) {

            } else {

            }
        } else {

        }
    }

    public void addStatement(Statement statement) {

    }



    @Override
    public void reset() {

    }
}
