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
import statement.Statement;
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
        if (initDeclaration.getType() != Storage.Type.INT) {
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
        setLocalVariables(new VariableManager(executionManager.getCurrentLocalVariables()));
        try {
            executionManager.enterBlock(this);
            System.out.println("before init: " + executionManager.getCurrentLocalVariables());
            if (initDeclaration != null) {
                initDeclaration.execute();
            }
            if (initAssignment != null) {
                initAssignment.execute();
            }
            System.out.println("after init: " + executionManager.getCurrentLocalVariables());
            VariableManager variableManager = executionManager.getCurrentLocalVariables();
            int initialValue = (int) variableManager.getVariable(initVarName).getValue();
            Integer destinationValue = new IntegerExpressionVisitor(
                    getProgramManager()
                    , false)
                    .visit(getBoundContext());
            beginIteration(variableManager, initVarName, initialValue, destinationValue);
            if (!hasBroken()) {
                executionManager.exitBlock();
            }
        } catch(SemanticException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("for " + initVarName + (isCountDown() ? " down " : " up ") + "to " + getBoundContext().getText() + " {\n");
        for (Statement statement : getStatements()) {
            sb.append(statement.toString());
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
