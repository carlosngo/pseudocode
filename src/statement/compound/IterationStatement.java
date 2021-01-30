package statement.compound;

import gen.PseudocodeParser.ExpressionContext;
import manager.ProgramManager;
import manager.VariableManager;
import statement.Statement;

import java.util.ArrayList;

public abstract class IterationStatement extends CompoundStatement {
    private final boolean countDown;
    private final ExpressionContext boundCtx;
    private final ArrayList<Statement> statements;


    public IterationStatement(ProgramManager programManager, boolean countDown, ExpressionContext boundCtx) {
        super(programManager);
        statements = new ArrayList<>();
        this.countDown = countDown;
        this.boundCtx = boundCtx;
    }

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    public ExpressionContext getBoundContext() {
        return boundCtx;
    }

    public boolean isCountDown() {
        return countDown;
    }

    @Override
    public void addStatement(Statement statement) {
        statements.add(statement);
    }

    @Override
    public void execute() {
        super.execute();
    }
}
