package antlr.visitor;

import antlr.PseudocodeParser;
import antlr.PseudocodeParserBaseVisitor;
import exception.StorageRedeclarationException;
import manager.*;
import notification.event.SemanticErrorEvent;
import statement.AssignmentStatement;
import statement.DeclarationStatement;
import statement.compound.CompoundStatement;
import statement.compound.FunctionCallStatement;
import storage.Array;
import storage.Function;
import storage.Storage;
import storage.Variable;

import java.util.ArrayList;
import java.util.List;

public class CompilerVisitor extends PseudocodeParserBaseVisitor<Void> {
    private final ProgramManager programManager;
    private final FunctionManager functionManager;
    private final CompilationManager compilationManager;
    private final NotificationManager notificationManager;

    public CompilerVisitor(ProgramManager programManager) {
        this.programManager = programManager;
        compilationManager = programManager.getCompilationManager();
        functionManager = programManager.getFunctionManager();
        notificationManager = programManager.getNotificationManager();
    }

    @Override
    public Void visitFunctionDefinition(PseudocodeParser.FunctionDefinitionContext ctx) {
        if (ctx.mainFunction() != null) {
            return visit(ctx.mainFunction());
        }
        int lineNumber = ctx.getStart().getLine();
        Storage.Type functionType = Storage.parseType(
                ctx.declSpecifierSeq()
                .variableSpecifier()
                .typeSpecifier()
                .getText());
        String functionName = ctx.Identifier().getText();
        ArrayList<Variable> variables = new ArrayList<>();
        if (ctx.parametersAndQualifiers() != null) {

            for (PseudocodeParser.ParameterDeclarationContext parameterContext : ctx.parametersAndQualifiers().parameterDeclarationClause().parameterDeclaration()) {
                String parameterName = parameterContext.Identifier().getText();
                Storage.Type parameterType = Storage.parseType(
                        parameterContext
                                .declSpecifierSeq()
                                .variableSpecifier()
                                .typeSpecifier()
                                .getText()
                );
                variables.add(new Variable(parameterType, parameterName));
            }
        }
        Function function = new Function(functionType, functionName, variables);
        System.out.println(function);
        try {
            functionManager.addFunction(function);
        } catch (StorageRedeclarationException e) {
            notificationManager.notifyErrorListeners(new SemanticErrorEvent(this, e, lineNumber));
        }
        functionManager.enterFunction(function);
        System.out.println("Entering " + function);
        compilationManager.enterCompoundStatement(new FunctionCallStatement(programManager, function, lineNumber));
        visit(ctx.compoundStatement());
        compilationManager.exitCompoundStatement();
        functionManager.exitFunction();
        System.out.println("Exiting " + function);
        return null;
    }

    @Override
    public Void visitMainFunction(PseudocodeParser.MainFunctionContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        Function function = new Function(Storage.Type.VOID, "main", new ArrayList<>());
        System.out.println(function);
        try {
            functionManager.addFunction(function);
        } catch (StorageRedeclarationException e) {
            notificationManager.notifyErrorListeners(new SemanticErrorEvent(this, e, lineNumber));
        }
        functionManager.enterFunction(function);
        System.out.println("Entering " + function);
        compilationManager.enterCompoundStatement(new FunctionCallStatement(programManager, function, lineNumber));
        visit(ctx.compoundStatement());
        compilationManager.exitCompoundStatement();
        functionManager.exitFunction();
        System.out.println("Exiting " + function);
        return null;
    }

    @Override
    public Void visitCompoundStatement(PseudocodeParser.CompoundStatementContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        if (ctx.parent instanceof PseudocodeParser.StatementContext) {
            compilationManager.enterCompoundStatement(new CompoundStatement(programManager, lineNumber));
            if (ctx.statementSeq() != null) {
                visit(ctx.statementSeq());
            }
            compilationManager.exitCompoundStatement();
            return null;
        }
        if (ctx.statementSeq() != null) {
            visit(ctx.statementSeq());
        }
        return null;
    }

    @Override
    public Void visitAssignmentStatement(PseudocodeParser.AssignmentStatementContext ctx) {
        return super.visitAssignmentStatement(ctx);
    }

    @Override
    public Void visitPrintStatement(PseudocodeParser.PrintStatementContext ctx) {
        return super.visitPrintStatement(ctx);
    }

    @Override
    public Void visitScanStatement(PseudocodeParser.ScanStatementContext ctx) {
        return super.visitScanStatement(ctx);
    }

    @Override
    public Void visitBreakStatement(PseudocodeParser.BreakStatementContext ctx) {
        return super.visitBreakStatement(ctx);
    }

    @Override
    public Void visitContinueStatement(PseudocodeParser.ContinueStatementContext ctx) {
        return super.visitContinueStatement(ctx);
    }

    @Override
    public Void visitReturnStatement(PseudocodeParser.ReturnStatementContext ctx) {
        return super.visitReturnStatement(ctx);
    }

    @Override
    public Void visitSelectionStatement(PseudocodeParser.SelectionStatementContext ctx) {
        return super.visitSelectionStatement(ctx);
    }

    @Override
    public Void visitForStatement(PseudocodeParser.ForStatementContext ctx) {
        return super.visitForStatement(ctx);
    }

    @Override
    public Void visitWhileStatement(PseudocodeParser.WhileStatementContext ctx) {
        return super.visitWhileStatement(ctx);
    }

    @Override
    public Void visitDoWhileStatement(PseudocodeParser.DoWhileStatementContext ctx) {
        return super.visitDoWhileStatement(ctx);
    }

    @Override
    public Void visitVariableDeclaration(PseudocodeParser.VariableDeclarationContext ctx) {
        System.out.println("variable declaration detected!");
        int lineNumber = ctx.getStart().getLine();
        boolean isFinal = ctx.variableSpecifier().Const() != null;
        Storage.Type variableType = Storage.typeOf(ctx.variableSpecifier().typeSpecifier().getText());
        VariableManager variableManager = functionManager.getCurrentFunction().getVariableManager();
        for (PseudocodeParser.InitDeclaratorContext c : ctx.initDeclaratorList().initDeclarator()) {
            String variableName = c.Identifier().getText();
            Variable variable = new Variable(variableType, variableName);
            new DeclarationStatement(programManager, variable, lineNumber);
            if (c.initializer() != null) { // initialize
                new AssignmentStatement(programManager, variableName, c.initializer().expression(), lineNumber);
            }
        }
//        String variableName =
        return null;
    }

    @Override
    public Void visitArrayDeclaration(PseudocodeParser.ArrayDeclarationContext ctx) {
        return super.visitArrayDeclaration(ctx);
    }
}
