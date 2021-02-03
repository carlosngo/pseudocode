package antlr.visitor;

import antlr.PseudocodeParser;
import antlr.PseudocodeParserBaseVisitor;
import antlr.visitor.expression.IntegerExpressionVisitor;
import exception.ArraySizeException;
import exception.SemanticException;
import exception.StorageRedeclarationException;
import exception.type.AssignmentException;
import exception.type.BoundException;
import manager.*;
import notification.event.SemanticErrorEvent;
import statement.*;
import statement.compound.*;
import storage.Array;
import storage.Function;
import storage.Storage;
import storage.Variable;

import java.util.ArrayList;

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
        visitFunction(function, lineNumber, ctx.compoundStatement());
        return null;
    }

    @Override
    public Void visitMainFunction(PseudocodeParser.MainFunctionContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        Function function = new Function(Storage.Type.VOID, "main", new ArrayList<>());
        visitFunction(function, lineNumber, ctx.compoundStatement());
        return null;
    }

    @Override
    public Void visitCompoundStatement(PseudocodeParser.CompoundStatementContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        if (ctx.parent instanceof PseudocodeParser.StatementContext) {
            compilationManager.enterCompoundStatement(
                    new CompoundStatement(programManager
                            , compilationManager.getCurrentLocalVariables()
                            , lineNumber));
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
        int lineNumber = ctx.getStart().getLine();
        String identifier;
        PseudocodeParser.ExpressionContext valueCtx = ctx.expression();
        AssignmentStatement assignmentStatement;
        if (ctx.variableName() != null) {
            identifier = ctx.variableName().Identifier().getText();
            assignmentStatement = new AssignmentStatement(
                    programManager
                    , identifier
                    , valueCtx
                    , lineNumber);
        } else {
            identifier = ctx.arrayAccess().Identifier().getText();
            PseudocodeParser.ExpressionContext indexCtx = ctx.arrayAccess().expression();
            assignmentStatement = new AssignmentStatement(
                    programManager
                    , identifier
                    , indexCtx
                    , valueCtx
                    , lineNumber);
        }
        compilationManager.addStatement(assignmentStatement);
        return null;
    }

    @Override
    public Void visitPrintStatement(PseudocodeParser.PrintStatementContext ctx) {
        compilationManager.addStatement(new PrintStatement(
                programManager
                , ctx.expression()
                , ctx.getStart().getLine()));
        return null;
    }

    @Override
    public Void visitScanStatement(PseudocodeParser.ScanStatementContext ctx) {
        compilationManager.addStatement(new ScanStatement(
                programManager,
                ctx.StringLiteral().getText(),
                ctx.Identifier().getText(),
                ctx.getStart().getLine()
        ));
        return null;
    }

    @Override
    public Void visitBreakStatement(PseudocodeParser.BreakStatementContext ctx) {
        compilationManager.addStatement(new BreakStatement(
                programManager
                , ctx.getStart().getLine()));
        return null;
    }

    @Override
    public Void visitContinueStatement(PseudocodeParser.ContinueStatementContext ctx) {
        return super.visitContinueStatement(ctx);
    }

    @Override
    public Void visitReturnStatement(PseudocodeParser.ReturnStatementContext ctx) {
        compilationManager.addStatement(new ReturnStatement(
                programManager
                , ctx.expression()
                , ctx.getStart().getLine()
        ));
        return super.visitReturnStatement(ctx);
    }

    @Override
    public Void visitSelectionStatement(PseudocodeParser.SelectionStatementContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        PseudocodeParser.IfStatementContext ifCtx = ctx.ifStatement();
        VariableManager parentLocalVariables = compilationManager.getCurrentLocalVariables();
        IfStatement currentIf = new IfStatement(
                programManager
                , parentLocalVariables
                , ifCtx.expression()
                , lineNumber);
        compilationManager.enterCompoundStatement(currentIf);
        visit(ifCtx.compoundStatement());
        for (int i = 0; i < ctx.elseIfStatement().size(); i++) {
            PseudocodeParser.ElseIfStatementContext elseIfCtx = ctx.elseIfStatement(i);
            compilationManager.enterNegative();
            IfStatement elseIfStatement = new IfStatement(
                    programManager
                    , parentLocalVariables
                    , elseIfCtx.expression()
                    , lineNumber
            );
            compilationManager.addStatement(elseIfStatement);
            compilationManager.exitCompoundStatement();
            compilationManager.enterCompoundStatement(elseIfStatement);
            visit(elseIfCtx.compoundStatement());
//            compilationManager.exitCompoundStatement();
        }
        if (ctx.elseStatement() != null) {
            compilationManager.enterNegative();
            visit(ctx.elseStatement().compoundStatement());
        }
        compilationManager.exitCompoundStatement();
        return null;
    }

    @Override
    public Void visitForStatement(PseudocodeParser.ForStatementContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String initVarName = ctx.iterationInit().initDeclarator().Identifier().getText();
        PseudocodeParser.ExpressionContext boundCtx = ctx.expression();
        boolean isCountDown = ctx.Down() != null;
        ForStatement forStatement =
                new ForStatement(programManager
                        , compilationManager.getCurrentLocalVariables()
                        , initVarName
                        , isCountDown
                        , boundCtx
                        , lineNumber);
        compilationManager.enterCompoundStatement(forStatement);
        if (ctx.iterationInit().variableSpecifier() != null) {
            Storage.Type varType = Storage.parseType(ctx.iterationInit().variableSpecifier().getText());
            DeclarationStatement declarationStatement =
                    new DeclarationStatement(programManager
                            , new Variable(false, varType, initVarName)
                            , lineNumber);

            compilationManager.addStatement(declarationStatement);
            forStatement.setInitDeclaration(declarationStatement);
        }
        if (ctx.iterationInit().initDeclarator().initializer() != null) {
            AssignmentStatement assignmentStatement =
                    new AssignmentStatement(
                            programManager
                            , initVarName
                            , ctx.iterationInit().initDeclarator().initializer().expression()
                            , lineNumber);
            compilationManager.addStatement(assignmentStatement);
            forStatement.setInitAssignment(assignmentStatement);
        }
        visit(ctx.compoundStatement());
        compilationManager.exitCompoundStatement();
        return null;
    }

    @Override
    public Void visitWhileStatement(PseudocodeParser.WhileStatementContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String initVarName = ctx.iterationInit().initDeclarator().Identifier().getText();
        PseudocodeParser.ExpressionContext boundCtx = ctx.expression();
        boolean isCountDown = ctx.Down() != null;
        compilationManager.enterCompoundStatement(
                new WhileStatement(
                        programManager
                        , compilationManager.getCurrentLocalVariables()
                        , boundCtx
                        , isCountDown
                        , initVarName
                        , lineNumber));
        visit(ctx.compoundStatement());
        compilationManager.exitCompoundStatement();
        return null;
    }

    @Override
    public Void visitDoWhileStatement(PseudocodeParser.DoWhileStatementContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String initVarName = ctx.iterationInit().initDeclarator().Identifier().getText();
        PseudocodeParser.ExpressionContext boundCtx = ctx.expression();
        boolean isCountDown = ctx.Down() != null;
        compilationManager.enterCompoundStatement(
                new DoWhileStatement(
                        programManager
                        , compilationManager.getCurrentLocalVariables()
                        , boundCtx
                        , isCountDown
                        , initVarName
                        , lineNumber));
        visit(ctx.compoundStatement());
        compilationManager.exitCompoundStatement();
        return null;
    }

    @Override
    public Void visitVariableDeclaration(PseudocodeParser.VariableDeclarationContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        boolean isFinal = ctx.variableSpecifier().Const() != null;
        Storage.Type variableType = Storage.parseType(ctx.variableSpecifier().typeSpecifier().getText());
        for (PseudocodeParser.InitDeclaratorContext c : ctx.initDeclaratorList().initDeclarator()) {
            String variableName = c.Identifier().getText();
            Variable variable = new Variable(isFinal, variableType, variableName);
            compilationManager.addStatement(
                    new DeclarationStatement(programManager, variable, lineNumber));
            if (c.initializer() != null) { // initialize
                compilationManager.addStatement(
                        new AssignmentStatement(programManager, variableName, c.initializer().expression(), lineNumber)
                );
            }
        }
        return null;
    }

    @Override
    public Void visitArrayDeclaration(PseudocodeParser.ArrayDeclarationContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        boolean isFinal = ctx.arraySpecifier().Const() != null;
        Storage.Type arrayType = Storage.parseType(ctx.arraySpecifier().typeSpecifier().getText());
        String arrayName = ctx.Identifier().getText();
        PseudocodeParser.ExpressionContext sizeContext = ctx.createExpression().expression();
        Storage.Type createType = Storage.parseType(ctx.createExpression().typeSpecifier().getText());

        try {
            if (arrayType != createType) {
                throw new AssignmentException(arrayType, createType);
            }
            try {
                Integer size = new IntegerExpressionVisitor(programManager, true).visit(sizeContext);
                if (size == null) {
                    throw new ArraySizeException();
                }
                Array array = new Array(isFinal, arrayType, arrayName, size);
                compilationManager.addStatement(
                        new DeclarationStatement(programManager, array, lineNumber));
                System.out.println("initialized array: " + array);
            } catch (NullPointerException e) {
                throw new ArraySizeException();
            }
        } catch (SemanticException e) {
            notificationManager.notifyErrorListeners(new SemanticErrorEvent(this, e, lineNumber));
        }
        return null;
    }


    private void visitFunction(Function function, int lineNumber, PseudocodeParser.CompoundStatementContext ctx) {
        System.out.println(function);
        try {
            functionManager.addFunction(function);
        } catch (StorageRedeclarationException e) {
            notificationManager.notifyErrorListeners(new SemanticErrorEvent(this, e, lineNumber));
        }
        functionManager.enterFunction(function);
        System.out.println("Entering " + function);
        compilationManager.enterCompoundStatement(new FunctionCallStatement(programManager, function, lineNumber));
        visit(ctx);
        compilationManager.exitCompoundStatement();
        functionManager.exitFunction();
        System.out.println("Exiting " + function);
    }
}
