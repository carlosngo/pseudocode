package statement;

import antlr.PseudocodeParserBaseVisitor;
import antlr.visitor.expression.ExpressionVisitorFactory;
import antlr.visitor.expression.IntegerExpressionVisitor;
import exception.NotArrayException;
import exception.SemanticException;
import antlr.PseudocodeParser.ExpressionContext;
import exception.type.AssignmentException;
import manager.ProgramManager;
import storage.Array;
import storage.Storage;
import storage.Variable;
import util.evaluator.ExpressionEvaluator;

public class AssignmentStatement extends Statement {
    private final String identifier;
    private final ExpressionContext indexCtx;
    private final ExpressionContext valueCtx;


    public AssignmentStatement(ProgramManager programManager
            , String identifier
            , ExpressionContext valueCtx
            , int lineNumber) {
        super(programManager, lineNumber);
        this.identifier = identifier;
        this.valueCtx = valueCtx;
        indexCtx = null;
        try {
            Variable variable = programManager
                    .getCompilationManager()
                    .getCurrentLocalVariables()
                    .getVariable(identifier);
            PseudocodeParserBaseVisitor expressionVisitor
                    = ExpressionVisitorFactory
                        .getExpressionVisitor(programManager, variable.getType(), true);
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

    public AssignmentStatement(ProgramManager programManager
            , String identifier
            , ExpressionContext indexCtx
            , ExpressionContext valueCtx
            , int lineNumber) {
        super(programManager, lineNumber);
        this.identifier = identifier;
        this.indexCtx = indexCtx;
        this.valueCtx = valueCtx;
        try {
            Variable variable = programManager
                    .getCompilationManager()
                    .getCurrentLocalVariables()
                    .getVariable(identifier);
            if (!(variable instanceof Array)) {
                throw new NotArrayException(variable);
            }
            PseudocodeParserBaseVisitor expressionVisitor
                    = ExpressionVisitorFactory
                    .getExpressionVisitor(programManager, variable.getType(), true);
            try {
                new IntegerExpressionVisitor(programManager, true).visit(indexCtx);
            } catch (NullPointerException e) {
                // invalid index
                throw new AssignmentException(Storage.Type.INT, null);
            }
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
            Array array = (Array) getProgramManager()
                    .getCompilationManager()
                    .getCurrentLocalVariables()
                    .getVariable(identifier);
            int index = new IntegerExpressionVisitor(
                    getProgramManager()
                    , true)
                    .visit(indexCtx);
            PseudocodeParserBaseVisitor expressionVisitor
                    = ExpressionVisitorFactory
                        .getExpressionVisitor(getProgramManager(), array.getType(), false);
            Object value = expressionVisitor.visit(valueCtx);
            array.set(index, value);
        } catch(SemanticException e) {
            System.err.println("unexpected compilation error during runtime: " + e.getMessage());
        }
    }
}
