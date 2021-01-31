package statement;

import error.exception.SemanticException;
import gen.PseudocodeParser.ExpressionContext;
import manager.ProgramManager;
import notification.event.PrintEvent;
import notification.event.SemanticErrorEvent;
import util.evaluator.ExpressionEvaluator;

public class PrintStatement extends Statement {
    private final ExpressionContext messageContext;

    public PrintStatement(ProgramManager programManager, ExpressionContext messageContext) throws SemanticException{
        super(programManager);
        this.messageContext = messageContext;
        ExpressionEvaluator.evaluateType(messageContext, programManager);
    }

    @Override
    public void execute() {
        super.execute();
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
