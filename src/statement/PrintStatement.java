package statement;

import error.exception.CompilationException;
import gen.PseudocodeParser.ExpressionContext;
import manager.ProgramManager;
import notification.event.PrintEvent;
import notification.event.SemanticErrorEvent;
import storage.Storage;
import util.evaluator.ExpressionEvaluator;

public class PrintStatement extends Statement {
    private final ExpressionContext messageContext;

    public PrintStatement(ProgramManager programManager, ExpressionContext messageContext) {
        super(programManager);
        this.messageContext = messageContext;
        try {
            ExpressionEvaluator.evaluateType(messageContext, programManager);
        } catch(CompilationException e) {
            SemanticErrorEvent evt = new SemanticErrorEvent(this, e);
            programManager.getNotificationManager().notifyErrorListeners(evt);
        }
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
        } catch(CompilationException e) {
            System.err.println("unexpected " + e.getMessage() + " at runtime");
        }
    }
}
