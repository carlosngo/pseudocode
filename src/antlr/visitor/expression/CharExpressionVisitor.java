package antlr.visitor.expression;

import antlr.PseudocodeParser;
import antlr.PseudocodeParserBaseVisitor;
import exception.ArrayIndexException;
import exception.NotArrayException;
import exception.SemanticException;
import manager.CompilationManager;
import manager.ExecutionManager;
import manager.NotificationManager;
import manager.ProgramManager;
import notification.event.SemanticErrorEvent;
import statement.compound.FunctionCallStatement;
import storage.Array;
import storage.Storage;
import storage.Variable;

import java.util.List;

public class CharExpressionVisitor extends PseudocodeParserBaseVisitor<Character> {
    private final ProgramManager programManager;
    private final ExecutionManager executionManager;
    private final CompilationManager compilationManager;
    private final NotificationManager notificationManager;
    private final boolean isCompiling;

    public CharExpressionVisitor(ProgramManager programManager
            , boolean isCompiling) {
        this.programManager = programManager;
        executionManager = programManager.getExecutionManager();
        compilationManager = programManager.getCompilationManager();
        notificationManager = programManager.getNotificationManager();
        this.isCompiling = isCompiling;
    }

    @Override
    public Character visitExpression(PseudocodeParser.ExpressionContext ctx) {
        return visit(ctx.logicalOrExpression());
    }

    @Override
    public Character visitLogicalOrExpression(PseudocodeParser.LogicalOrExpressionContext ctx) {
        Character value = super.visitLogicalOrExpression(ctx);
        if (ctx.logicalAndExpression(1) != null) {
            return null;
        }
        return value;

    }

    @Override
    public Character visitLogicalAndExpression(PseudocodeParser.LogicalAndExpressionContext ctx) {
        Character value = super.visitLogicalAndExpression(ctx);
        if (ctx.equalityExpression(1) != null) {
            return null;
        }
        return value;
    }

    @Override
    public Character visitEqualityExpression(PseudocodeParser.EqualityExpressionContext ctx) {
        Character value = super.visitEqualityExpression(ctx);
        if (ctx.relationalExpression(1) != null) {
            return null;
        }
        return value;
    }

    @Override
    public Character visitRelationalExpression(PseudocodeParser.RelationalExpressionContext ctx) {
        Character value = super.visitRelationalExpression(ctx);
        if (ctx.additiveExpression(1) != null) {
            return null;
        }
        return value;
    }

    @Override
    public Character visitAdditiveExpression(PseudocodeParser.AdditiveExpressionContext ctx) {
        Character value = super.visitAdditiveExpression(ctx);
        if (ctx.multiplicativeExpression(1) != null) {
            return null;
        }
        return value;
    }

    @Override
    public Character visitMultiplicativeExpression(PseudocodeParser.MultiplicativeExpressionContext ctx) {
        Character value = super.visitMultiplicativeExpression(ctx);
        if (ctx.unaryExpression(1) != null) {
            return null;
        }
        return value;
    }

    @Override
    public Character visitUnaryExpression(PseudocodeParser.UnaryExpressionContext ctx) {
        Character value = super.visitUnaryExpression(ctx);
        if (ctx.Not() != null || ctx.binaryOperator() != null) {
            return null;
        }
        return value;
    }

    @Override
    public Character visitPrimaryExpression(PseudocodeParser.PrimaryExpressionContext ctx) {
        if (ctx.literal(0) != null) {
            return visit(ctx.literal(0));
        }
        if (ctx.variableName() != null) {
            return visit(ctx.variableName());
        }
        if (ctx.expression() != null) {
            return visit(ctx.expression());
        }
        return null;
    }

    @Override
    public Character visitFunctionCall(PseudocodeParser.FunctionCallContext ctx) {
        String identifier = ctx.Identifier().getText();
        System.out.println("found function call for " + identifier);
        List<PseudocodeParser.ExpressionContext> parameterContexts = ctx.expressionList().expression();
        int lineNumber = ctx.getStart().getLine();
        FunctionCallStatement statement = new FunctionCallStatement(
                programManager, identifier, parameterContexts, lineNumber, isCompiling);

        Storage.Type returnType = statement.getFunctionSignature().getType();
        if (returnType != Storage.Type.CHAR) {
            return null;
        }
        if (isCompiling) {
            return (Character) Storage.getRandomValueOfType(returnType);
        } else {
            statement.execute();
            return (Character) statement.getReturnValue();
        }
    }

    @Override
    public Character visitArrayAccess(PseudocodeParser.ArrayAccessContext ctx) {
        String identifier = ctx.Identifier().getText();
        int lineNumber = ctx.getStart().getLine();
        IntegerExpressionVisitor integerExpressionVisitor = new IntegerExpressionVisitor(programManager, isCompiling);
        Integer index = integerExpressionVisitor.visitExpression(ctx.expression());

        try {
            if (index == null) {
                throw new ArrayIndexException();
            }
            Variable variable;
            if (isCompiling) {
                variable = compilationManager.getCurrentLocalVariables().getVariable(identifier);
            } else {
                variable = executionManager.getCurrentLocalVariables().getVariable(identifier);
            }
            if (variable.getType() != Storage.Type.CHAR) {
                return null;
            }
            if (variable instanceof Array) {
                Array array = (Array) variable;
                if (isCompiling) {
                    return (Character) Storage.getRandomValueOfType(array.getType());
                } else {
                    return (Character) array.get(index);
                }
            } else {
                throw new NotArrayException(variable);
            }
        } catch (SemanticException e) {
            notificationManager.notifyErrorListeners(new SemanticErrorEvent(this, e, lineNumber));
            return null;
        }
    }

    @Override
    public Character visitVariableName(PseudocodeParser.VariableNameContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        if (ctx.Identifier() != null) {
            String identifier = ctx.Identifier().getText();
            try {
                Variable variable;
                if (isCompiling) {
                    variable = compilationManager.getCurrentLocalVariables().getVariable(identifier);
                } else {
                    variable = executionManager.getCurrentLocalVariables().getVariable(identifier);
                }
                if (variable.getType() != Storage.Type.CHAR) {
                    return null;
                }
                if (variable instanceof Array) {
                    return null;
                } else {
                    if (isCompiling) {
                        return (Character) Storage.getRandomValueOfType(variable.getType());
                    } else {
                        return (Character) variable.getValue();
                    }
                }
            } catch (SemanticException e) {
                notificationManager.notifyErrorListeners(new SemanticErrorEvent(this, e, lineNumber));
                return null;
            }
        }
        return null;
    }

    @Override
    public Character visitLiteral(PseudocodeParser.LiteralContext ctx) {
        if (ctx.CharacterLiteral() == null) {
            return null;
        }
        return ctx.CharacterLiteral().getText().charAt(1);
    }
}
