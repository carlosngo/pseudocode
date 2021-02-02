package statement;

import antlr.PseudocodeParserBaseVisitor;
import antlr.visitor.expression.ExpressionVisitorFactory;
import exception.SemanticException;
import antlr.PseudocodeParser.ExpressionContext;
import exception.type.AssignmentException;
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
            System.out.println(programManager.getFunctionManager().getCurrentFunction());

            Variable variable = programManager
                    .getFunctionManager()
                    .getCurrentFunction()
                    .getVariableManager()
                    .getVariable(identifier);
            PseudocodeParserBaseVisitor expressionVisitor = ExpressionVisitorFactory.getExpressionVisitor(programManager, variable.getType(), true);
            try {
                Object value = expressionVisitor.visit(valueCtx);
                if (value == null) {
                    throw new AssignmentException(variable.getType(), null);
                }
                variable.setValue(value);
            } catch(NullPointerException e) {
                e.printStackTrace();
                throw new AssignmentException(variable.getType(), null);
            }
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
            PseudocodeParserBaseVisitor expressionVisitor = ExpressionVisitorFactory.getExpressionVisitor(getProgramManager(), variable.getType(), false);

            Object value = expressionVisitor.visit(valueCtx);
            variable.setValue(value);
        } catch(SemanticException e) {
            System.err.println("unexpected compilation error during runtime: " + e.getMessage());
        }
    }
}
