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
    private final String operator;
    private final ExpressionContext indexCtx;
    private final ExpressionContext valueCtx;


    public AssignmentStatement(ProgramManager programManager
            , String identifier
            , String operator
            , ExpressionContext valueCtx
            , int lineNumber) {
        super(programManager, lineNumber);
        this.identifier = identifier;
        this.valueCtx = valueCtx;
        this.operator = operator;
        indexCtx = null;
//        System.out.println("called from line " + lineNumber);
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
            , String operator
            , ExpressionContext valueCtx
            , int lineNumber) {
        super(programManager, lineNumber);
        this.identifier = identifier;
        this.indexCtx = indexCtx;
        this.valueCtx = valueCtx;
        this.operator = operator;
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
                Array array = (Array) variable;
                int index = new IntegerExpressionVisitor(
                        getProgramManager()
                        , false)
                        .visit(indexCtx);
                if (operator.equals("+=")) {
                    Object curValue = array.get(index);
                    array.set(index, plusEquals(curValue, value, array.getType()));
                } else if (operator.equals("=")) {
                    array.set(index, value);
                }
            } else {
                if (operator.equals("+=")) {
                    Object curValue = variable.getValue();
                    variable.setValue(plusEquals(curValue, value, variable.getType()));
                } else if (operator.equals("=")) {
                    variable.setValue(value);
                }

            }
        } catch(SemanticException e) {
            System.err.println("unexpected compilation error during runtime: " + e.getMessage());
        }
    }

    private Object plusEquals(Object a, Object b, Storage.Type type) {
        Object resultingValue = null;
        switch (type) {
            case INT:
                resultingValue = (Integer) a + (Integer) b;
                break;
            case CHAR:
                break;
            case FLOAT:
                resultingValue = (Float) a + (Float) b;
                break;
            case STRING:
                resultingValue = (String) a + (String) b;
                break;
        }
        return resultingValue;
    }

    @Override
    public String toString() {
        return identifier + (indexCtx != null ? "[" + indexCtx.getText() + "]" : "") + " = " + valueCtx.getText() + ";";
    }
}
