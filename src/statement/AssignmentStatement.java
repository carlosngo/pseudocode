package statement;

import antlr.PseudocodeParserBaseVisitor;
import antlr.visitor.expression.ExpressionVisitorFactory;
import antlr.visitor.expression.IntegerExpressionVisitor;
import exception.ArrayIndexException;
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
//            System.out.println(variable);
            PseudocodeParserBaseVisitor expressionVisitor
                    = ExpressionVisitorFactory
                        .getExpressionVisitor(programManager, variable.getType(), true);
            Object value = expressionVisitor.visit(valueCtx);
            if (value == null) {
                System.out.println(valueCtx.getText());
                throw new AssignmentException(variable.getType(), null);
            }
            variable.setValue(value);
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
            Array array = (Array) variable;
            PseudocodeParserBaseVisitor expressionVisitor
                    = ExpressionVisitorFactory
                    .getExpressionVisitor(programManager, array.getType(), true);
            Integer index = new IntegerExpressionVisitor(
                    programManager, true).visit(indexCtx);
            if (index == null) {
                throw new ArrayIndexException();
            }
            Object value = expressionVisitor.visit(valueCtx);
            if (value == null) {
                throw new AssignmentException(array.getType(), null);
            }
//            array.set(index, value);
        } catch(SemanticException e) {
            notifyErrorListeners(e);
        }
    }
    @Override
    public void execute() {
        tryExecution();
        try {
            Variable variable = getProgramManager()
                    .getExecutionManager()
                    .getCurrentLocalVariables()
                    .getVariable(identifier);
            PseudocodeParserBaseVisitor expressionVisitor
                    = ExpressionVisitorFactory
                    .getExpressionVisitor(getProgramManager(), variable.getType(), false);
            Object value = expressionVisitor.visit(valueCtx);
            if (identifier.equals("line")) {
                System.out.println("line is going to be " + value.toString());
            }
            if (indexCtx != null) {
                int index = new IntegerExpressionVisitor(
                        getProgramManager()
                        , false)
                        .visit(indexCtx);

                ((Array) variable).set(index, value);
            } else {
                variable.setValue(value);
            }
        } catch(SemanticException e) {
            System.err.println("unexpected compilation error during runtime: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return identifier + (indexCtx != null ? "[" + indexCtx.getText() + "]" : "") + " = " + valueCtx.getText() + ";";
    }
}
