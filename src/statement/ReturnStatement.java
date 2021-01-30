package statement;

import error.exception.CompilationException;
import error.exception.type.ReturnException;
import gen.PseudocodeParser.ExpressionContext;
import manager.ExecutionManager;
import manager.ProgramManager;
import manager.FunctionManager;
import manager.VariableManager;
import notification.event.SemanticErrorEvent;
import storage.Function;
import storage.Storage;
import util.evaluator.ExpressionEvaluator;

public class ReturnStatement extends Statement {
    private final ExpressionContext expressionContext;

    public ReturnStatement(ProgramManager programManager, ExpressionContext expressionContext) {
        super(programManager);
        this.expressionContext = expressionContext;
        try {
            FunctionManager functionManager = programManager.getFunctionManager();
            Function currentFunction = functionManager.getCurrentFunction();
            Storage.Type givenReturnType = ExpressionEvaluator
                    .evaluateType(expressionContext, programManager);
            if (givenReturnType != currentFunction.getType()) {
                throw new ReturnException(currentFunction.getType(), givenReturnType);
            }
        } catch(CompilationException e) {
            SemanticErrorEvent evt = new SemanticErrorEvent(this, e);
            programManager.getNotificationManager().notifyErrorListeners(evt);
        }
    }

    @Override
    public void execute() {
        super.execute();
        ExecutionManager executionManager = getProgramManager().getExecutionManager();
        try {
            executionManager.triggerReturn(
                    ExpressionEvaluator
                            .evaluateValue(expressionContext, getProgramManager()));
        } catch(CompilationException e) {
            System.err.println("unexpected " + e.getMessage() + " at runtime");
        }
    }
}
