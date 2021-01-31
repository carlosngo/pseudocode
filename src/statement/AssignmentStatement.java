package statement;

import exception.SemanticException;
import antlr.PseudocodeParser.ExpressionContext;
import manager.ProgramManager;
import storage.Storage;
import storage.Variable;
import util.evaluator.ExpressionEvaluator;

public class AssignmentStatement extends Statement {
    private final String identifier;
    private final ExpressionContext valueCtx;

    public AssignmentStatement(ProgramManager programManager
            , String identifier
            , ExpressionContext valueCtx
            , int lineNumber) {
        super(programManager, lineNumber);
        this.identifier = identifier;
        this.valueCtx = valueCtx;
        try {
            Variable variable = programManager
                    .getFunctionManager()
                    .getCurrentFunction()
                    .getVariableManager()
                    .getVariable(identifier);
            Storage.Type givenType =
                    ExpressionEvaluator.evaluateType(valueCtx, programManager);
            variable.setValue(Storage.getRandomValueOfType(givenType));
        } catch(SemanticException e) {
            notifyErrorListeners(e);
        }
    }

    @Override
    public void execute() {
        tryExecution();
        try {
            Variable variable = getProgramManager()
                    .getFunctionManager()
                    .getCurrentFunction()
                    .getVariableManager()
                    .getVariable(identifier);
            Object value =
                    ExpressionEvaluator.evaluateValue(valueCtx, getProgramManager());
            variable.setValue(value);
        } catch(SemanticException e) {
            System.err.println("unexpected compilation error during runtime: " + e.getMessage());
        }
    }
}
