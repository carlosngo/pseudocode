package statement;

import antlr.visitor.expression.ExpressionVisitorFactory;
import exception.SemanticException;
import exception.type.ReturnException;
import antlr.PseudocodeParser.ExpressionContext;
import manager.ExecutionManager;
import manager.ProgramManager;
import manager.FunctionManager;
import notification.event.SemanticErrorEvent;
import storage.Function;
import storage.Storage;
import util.evaluator.ExpressionEvaluator;

public class ReturnStatement extends Statement {
    private final ExpressionContext expressionContext;

    public ReturnStatement(ProgramManager programManager
            , ExpressionContext expressionContext
            , int lineNumber) {
        super(programManager, lineNumber);
        this.expressionContext = expressionContext;
        try {
            FunctionManager functionManager = programManager.getFunctionManager();
            Function currentFunction = functionManager.getCurrentFunction();
            if (currentFunction.getType() == Storage.Type.VOID) {
                throw new ReturnException(Storage.Type.VOID, null);
            }
            Object value = ExpressionVisitorFactory.getExpressionVisitor(
                    programManager
                    , currentFunction.getType()
                    , true
            ).visit(expressionContext);
            if (value == null) {
                throw new ReturnException(currentFunction.getType(), null);
            }
        } catch(SemanticException e) {
            notifyErrorListeners(e);
        }
    }

    @Override
    public void execute() {
        tryExecution();
        ExecutionManager executionManager = getProgramManager().getExecutionManager();
        Function currentFunction = executionManager.getCurrentFunctionCall().getFunctionSignature();
        executionManager.triggerReturn(
                ExpressionVisitorFactory.getExpressionVisitor(
                        getProgramManager()
                        , currentFunction.getType()
                        , false).visit(expressionContext));
    }

    @Override
    public String toString() {
        return "return " + expressionContext.getText() + ";";
    }
}
