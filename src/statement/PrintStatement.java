package statement;

import exception.SemanticException;
import gen.PseudocodeParser.ExpressionContext;
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
            ExpressionEvaluator.evaluateType(messageContext, programManager);
        } catch(SemanticException e) {
            notifyErrorListeners(e);
        }
    }

    @Override
    public void execute() {
        tryExecution();
        try {
            ProgramManager programManager = getProgramManager();
            String message = ExpressionEvaluator
                    .evaluateValue(messageContext, programManager).toString();
            PrintEvent evt = new PrintEvent(this, message);
            programManager.getNotificationManager().notifyPrintListeners(evt);
        } catch(SemanticException e) {
            System.err.println("unexpected " + e.getMessage() + " at runtime");
        }
    }
}
