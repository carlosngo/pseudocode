package statement.compound;

import antlr.PseudocodeParser;
import antlr.visitor.expression.IntegerExpressionVisitor;
import exception.SemanticException;

import exception.type.BoundException;
import antlr.PseudocodeParser.ExpressionContext;

import manager.ExecutionManager;
import manager.ProgramManager;
import manager.VariableManager;
import notification.event.SemanticErrorEvent;
import statement.AssignmentStatement;
import statement.DeclarationStatement;
import storage.Storage;
import storage.Variable;
import util.evaluator.ExpressionEvaluator;

public class ForStatement extends IterationStatement {

    private DeclarationStatement initDeclaration;
    private AssignmentStatement initAssignment;
    private String initVarName;
    private final ExpressionContext boundCtx;

    public ForStatement(ProgramManager programManager
            , VariableManager parentVariables
            , String initVarName
            , boolean countDown
            , ExpressionContext boundCtx,
            int lineNumber) {
        super(programManager, parentVariables, countDown, boundCtx, lineNumber);
        this.initVarName = initVarName;
        this.boundCtx = boundCtx;
        try {
            Integer bound = new IntegerExpressionVisitor(programManager, true).visit(boundCtx);
            if (bound == null) {
                throw new BoundException(null);
            }
        } catch(SemanticException e) {
            notifyErrorListeners(e);
        }
    }

    public void setInitDeclaration(DeclarationStatement initDeclaration) {
        this.initDeclaration = initDeclaration;
        if (initDeclaration.getVariable().getType() != Storage.Type.INT) {
            notifyErrorListeners(new BoundException(null));
        }
    }

    public void setInitAssignment(AssignmentStatement initAssignment) {
        this.initAssignment = initAssignment;
    }

    @Override
    public void execute() {
        tryExecution();
        ExecutionManager executionManager = getProgramManager().getExecutionManager();
        try {
//            int initialValue = (int) ExpressionEvaluator.evaluateValue(initCtx, getProgramManager());
            int destinationValue = (int) ExpressionEvaluator
                    .evaluateValue(getBoundContext(), getProgramManager());
            executionManager.enterBlock(this);
//            do {
//
//                initialValue = initialValue + (isCountDown() ? -1 : 1);
//            } while (initialValue != destinationValue);

            executionManager.exitBlock();
            getProgramManager().getExecutionManager().triggerBreak();
        } catch(SemanticException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "ForStatement{" +
                "boundCtx=" + boundCtx.getText() +
                '}';
    }
}
