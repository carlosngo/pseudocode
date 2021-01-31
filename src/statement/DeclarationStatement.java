package statement;

import exception.SemanticException;
import manager.ProgramManager;
import manager.VariableManager;
import storage.Function;
import storage.Variable;

public class DeclarationStatement extends Statement {
    private final Variable variable;

    public DeclarationStatement(ProgramManager programManager
            , Variable variable
            , int lineNumber) {
        super(programManager, lineNumber);
        this.variable = variable;
        try {
            programManager
                    .getFunctionManager()
                    .getCurrentFunction()
                    .getVariableManager()
                    .addVariable(variable);
        } catch(SemanticException e) {
            notifyErrorListeners(e);
        }
    }


    @Override
    public void execute() {
        tryExecution();
        try {
            getProgramManager()
                    .getExecutionManager()
                    .getCurrentFunctionCall()
                    .getLocalVariables()
                    .addVariable(variable);
        } catch (SemanticException e) {
            System.err.println("unexpected compilation error during runtime: " + e.getMessage());
        }
    }
}
