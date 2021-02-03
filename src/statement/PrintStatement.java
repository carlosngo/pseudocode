package statement;

import antlr.visitor.expression.StringExpressionVisitor;
import exception.PrintException;
import exception.SemanticException;
import antlr.PseudocodeParser.ExpressionContext;
import manager.ProgramManager;
import notification.event.PrintEvent;
import notification.event.SemanticErrorEvent;
import util.evaluator.ExpressionEvaluator;

public class PrintStatement extends Statement {
    private final ExpressionContext messageContext;

    public PrintStatement(ProgramManager programManager
            , ExpressionContext messageContext
            , int lineNumber) {
        super(programManager, lineNumber);
        this.messageContext = messageContext;
        try {
            String message = new StringExpressionVisitor(programManager, true).visit(messageContext);
            if (message == null) {
                throw new PrintException();
            }
        } catch(SemanticException e) {
            notifyErrorListeners(e);
        }
    }

    @Override
    public void execute() {
        tryExecution();
        ProgramManager programManager = getProgramManager();
        String message = new StringExpressionVisitor(programManager, false).visit(messageContext);
        PrintEvent evt = new PrintEvent(this, message);
        programManager.getNotificationManager().notifyPrintListeners(evt);
    }

    @Override
    public String toString() {
        return "print(" + messageContext.getText() + ");";
    }
}
