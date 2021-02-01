package manager;

import antlr.PseudocodeErrorListener;
import antlr.PseudocodeErrorStrategy;
import antlr.PseudocodeLexer;
import antlr.PseudocodeParser;
import antlr.visitor.CompilerVisitor;
import antlr.visitor.IntegerExpressionVisitor;
import notification.event.CompileErrorEvent;
import notification.event.CompileSuccessEvent;
import notification.event.SemanticErrorEvent;
import notification.event.CompileStartEvent;
import notification.listener.CompileListener;
import notification.listener.SemanticErrorListener;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import statement.Statement;
import statement.compound.CompoundStatement;
import statement.compound.IfStatement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class CompilationManager implements Manager, CompileListener, SemanticErrorListener {
    private final ProgramManager programManager;
    private final PseudocodeErrorListener pseudocodeErrorListener;
    private final Stack<CompoundStatement> statementStack;
    private boolean compileSuccess;


    public CompilationManager(ProgramManager programManager) {
        this.programManager = programManager;
        pseudocodeErrorListener = new PseudocodeErrorListener();
        statementStack = new Stack<>();
        programManager
                .getNotificationManager()
                .addListener(pseudocodeErrorListener);
        compileSuccess = true;
    }

    public void enterCompoundStatement(CompoundStatement statement) {
        programManager
                .getFunctionManager()
                .getCurrentFunction()
                .getVariableManager()
                .enterNewScope();
        statementStack.push(statement);
    }

    public void exitCompoundStatement() {
        CompoundStatement current = statementStack.pop();
        if (statementStack.isEmpty()) {
            System.err.println("done with function");
            return;
        }
        addStatement(current);
        programManager
                .getFunctionManager()
                .getCurrentFunction()
                .getVariableManager()
                .exitCurrentScope();
    }

    public void enterPositive() {
        ((IfStatement) statementStack.peek()).enterPositive();
    }

    public void enterNegative() {
        ((IfStatement) statementStack.peek()).exitPositive();
    }

    public void addStatement(Statement statement) {
        CompoundStatement current = statementStack.peek();
        if (current instanceof IfStatement) {
            IfStatement ifStatement = (IfStatement) current;
            if (ifStatement.isInPositive()) {
                ifStatement.addStatement(statement);
            } else {
                ifStatement.addNegativeStatement(statement);
            }
        } else {
            current.addStatement(statement);
        }
    }

    public void compile(String sourceCode) {
        PseudocodeLexer lexer = new PseudocodeLexer(CharStreams.fromString(sourceCode));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PseudocodeParser parser = new PseudocodeParser(tokens);
        lexer.removeErrorListeners();
        parser.removeErrorListeners();
        lexer.addErrorListener(pseudocodeErrorListener);
        parser.addErrorListener(pseudocodeErrorListener);
        parser.setErrorHandler(new PseudocodeErrorStrategy());
        ParseTree tree = parser.init();
//        TreeViewer viewr = new TreeViewer(Arrays.asList(
//                parser.getRuleNames()), tree);
//        viewr.open();
        System.out.println(tree.toStringTree(parser));
        CompilerVisitor visitor = new CompilerVisitor(programManager);
        visitor.visit(tree);
//        IntegerExpressionVisitor visitor = new IntegerExpressionVisitor(programManager, true);
//
//        programManager.getFunctionManager().getCurrentFunction().getVariableManager()
//        visitor.visit(tree);


        ArrayList<String> errorList = pseudocodeErrorListener.getErrorList();
        NotificationManager notificationManager = programManager.getNotificationManager();
        if (errorList.size() == 0) {
            notificationManager
                    .notifyCompileListeners(new CompileSuccessEvent(this));
        } else {
            notificationManager
                    .notifyCompileListeners(new CompileErrorEvent(this, errorList));
        }

    }

    @Override
    public void reset() {
        statementStack.clear();
    }

    @Override
    public void onCompileStart(CompileStartEvent e) {
        compile(e.getSourceCode());
    }

    @Override
    public void onCompileSuccess(CompileSuccessEvent e) {}

    @Override
    public void onCompileError(CompileErrorEvent e) {}

    @Override
    public void onSemanticError(SemanticErrorEvent e) {
        compileSuccess = false;
    }
}
