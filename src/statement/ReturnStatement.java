package statement;

import error.exception.CompilationException;
import error.exception.type.ReturnException;
import gen.PseudocodeParser.ExpressionContext;
import manager.ProgramManager;
import manager.FunctionManager;
import manager.VariableManager;
import notification.event.SemanticErrorEvent;
import storage.Function;
import storage.Storage;
import util.evaluator.ExpressionEvaluator;

public class ReturnStatement extends Statement {
    private Object returnValue;
    private ExpressionContext expressionContext;

    public ReturnStatement(ProgramManager programManager, ExpressionContext expressionContext) {
        super(programManager);
        returnValue = null;
        this.expressionContext = expressionContext;
        try {
            FunctionManager functionManager = programManager.getFunctionManager();
            Function currentFunction = functionManager.getCurrentFunction();
            Storage.Type givenReturnType = ExpressionEvaluator
                    .evaluateType(expressionContext, programManager, currentFunction.getVariableManager());
            if (givenReturnType != currentFunction.getType()) {
                throw new ReturnException(currentFunction.getType(), givenReturnType);
            }
        } catch(CompilationException e) {
            SemanticErrorEvent evt = new SemanticErrorEvent(this, e);
            programManager.getNotificationManager().notifyListeners(evt);
        }
    }

    public Object getReturnValue() {
        return returnValue;
    }

    @Override
    public void execute(VariableManager variableManager) {
        super.execute(variableManager);
        try {
            returnValue = ExpressionEvaluator.evaluateValue(expressionContext, getExecutionManager(), variableManager);
        } catch(CompilationException e) {
            System.err.println("unexpected " + e.getMessage() + " at runtime");
        }
    }
}
