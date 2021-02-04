package antlr.visitor.expression;

import antlr.PseudocodeParser;
import antlr.PseudocodeParserBaseVisitor;
import exception.ArrayIndexException;
import exception.NotArrayException;
import exception.SemanticException;
import manager.*;
import notification.event.SemanticErrorEvent;
import statement.compound.FunctionCallStatement;
import storage.Array;
import storage.Storage;
import storage.Variable;

import java.util.List;

public class FloatingExpressionVisitor extends PseudocodeParserBaseVisitor<Float> {
    private final ProgramManager programManager;
    private final ExecutionManager executionManager;
    private final CompilationManager compilationManager;
    private final NotificationManager notificationManager;
    private final boolean isCompiling;

    public FloatingExpressionVisitor(ProgramManager programManager
            , boolean isCompiling) {
        this.programManager = programManager;
        this.executionManager = programManager.getExecutionManager();
        compilationManager = programManager.getCompilationManager();

        notificationManager = programManager.getNotificationManager();
        this.isCompiling = isCompiling;
    }


    @Override
    public Float visitExpression(PseudocodeParser.ExpressionContext ctx) {
        return visit(ctx.logicalOrExpression());
    }

    @Override
    public Float visitLogicalOrExpression(PseudocodeParser.LogicalOrExpressionContext ctx)  {
        Float value = super.visitLogicalOrExpression(ctx);
        if (ctx.logicalAndExpression(1) != null) {
            return null;
        }
        return value;

    }

    @Override
    public Float visitLogicalAndExpression(PseudocodeParser.LogicalAndExpressionContext ctx) {
        Float value = super.visitLogicalAndExpression(ctx);
        if (ctx.equalityExpression(1) != null) {
            return null;
        }
        return value;
    }

    @Override
    public Float visitEqualityExpression(PseudocodeParser.EqualityExpressionContext ctx) {
        Float value = super.visitEqualityExpression(ctx);
        if (ctx.relationalExpression(1) != null) {
            return null;
        }
        return value;
    }

    @Override
    public Float visitRelationalExpression(PseudocodeParser.RelationalExpressionContext ctx) {
        Float value = super.visitRelationalExpression(ctx);
        if (ctx.additiveExpression(1) != null) {
            return null;
        }
        return value;
    }

    @Override
    public Float visitAdditiveExpression(PseudocodeParser.AdditiveExpressionContext ctx) {
        PseudocodeParser.MultiplicativeExpressionContext left = ctx.multiplicativeExpression(0);
        PseudocodeParser.MultiplicativeExpressionContext right = ctx.multiplicativeExpression(1);
        Float sum = visit(left);
        if (!ctx.PlusPlus().isEmpty() || !ctx.MinusMinus().isEmpty()) {
            return null;
        }
        for (int i = 2; right != null; i++) {
            try {
                if (ctx.Plus(i - 2) == null) {
                    sum -= visit(right);
                } else {
                    sum += visit(right);
                }
            } catch (NullPointerException e) { }
            right = ctx.multiplicativeExpression(i);
        }
        return sum;
    }

    @Override
    public Float visitMultiplicativeExpression(PseudocodeParser.MultiplicativeExpressionContext ctx) {
        PseudocodeParser.UnaryExpressionContext left = ctx.unaryExpression(0);
        PseudocodeParser.UnaryExpressionContext right = ctx.unaryExpression(1);
        Float product = visit(left);
        for (int i = 2; right != null; i++) {
            try {
                if (ctx.Star(i - 2) == null) {
                    product /= visit(right);
                } else {
                    product *= visit(right);
                }
            } catch (NullPointerException e) { }
            right = ctx.unaryExpression(i);
        }
        return product;
    }

    @Override
    public Float visitUnaryExpression(PseudocodeParser.UnaryExpressionContext ctx) {
        Float value = super.visitUnaryExpression(ctx);
        if (ctx.Not() != null || ctx.binaryOperator() != null) {
            return null;
        }
        return value;
    }

    @Override
    public Float visitPrimaryExpression(PseudocodeParser.PrimaryExpressionContext ctx) {
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
    public Float visitFunctionCall(PseudocodeParser.FunctionCallContext ctx) {
        String identifier = ctx.Identifier().getText();
        List<PseudocodeParser.ExpressionContext> parameterContexts = ctx.expressionList().expression();
        int lineNumber = ctx.getStart().getLine();
        FunctionCallStatement statement
                = new FunctionCallStatement(
                programManager, identifier, parameterContexts, lineNumber);
        Storage.Type returnType = statement.getFunctionSignature().getType();
        if (returnType != Storage.Type.FLOAT && returnType != Storage.Type.INT) {
            return null;
        }
        if (isCompiling) {
            return (Float) Storage.getRandomValueOfType(Storage.Type.FLOAT);
        } else {
            statement.execute();
            Object value = statement.getReturnValue();
            if (value instanceof Integer) {
                return ((Integer) value).floatValue();
            }
            return (Float) value;
        }
    }

    @Override
    public Float visitArrayAccess(PseudocodeParser.ArrayAccessContext ctx) {
        String identifier = ctx.Identifier().getText();
        int lineNumber = ctx.getStart().getLine();
        IntegerExpressionVisitor integerExpressionVisitor = new IntegerExpressionVisitor(programManager, isCompiling);
        try {
            Integer index = integerExpressionVisitor.visitExpression(ctx.expression());
            if (index == null)
                throw new ArrayIndexException();
            Variable variable;
            if (isCompiling) {
                variable = compilationManager.getCurrentLocalVariables().getVariable(identifier);
            } else {
                variable = executionManager.getCurrentLocalVariables().getVariable(identifier);
            }
            if (variable.getType() != Storage.Type.FLOAT && variable.getType() != Storage.Type.INT) {
                return null;
            }
            if (variable instanceof Array) {
                Array array = (Array) variable;
                if (isCompiling) {
                    return (Float) Storage.getRandomValueOfType(Storage.Type.FLOAT);
                } else {
                    Object value = array.get(index);
                    if (value instanceof Integer) {
                        return ((Integer) value).floatValue();
                    }
                    return (Float) value;
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
    public Float visitVariableName(PseudocodeParser.VariableNameContext ctx) {
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
                if (variable.getType() != Storage.Type.FLOAT && variable.getType() != Storage.Type.INT) {
                    return null;
                }
                if (variable instanceof Array) {
                    return null;
                } else {
                    if (isCompiling) {
                        return (Float) Storage.getRandomValueOfType(Storage.Type.FLOAT);
                    } else {
                        Object value = variable.getValue();
                        if (value instanceof Integer) {
                            return ((Integer) value).floatValue();
                        }
                        return (Float) value;
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
    public Float visitLiteral(PseudocodeParser.LiteralContext ctx) {
        if (ctx.FloatingLiteral() != null) {
            return Float.valueOf(ctx.FloatingLiteral().getText());
        }
        if (ctx.IntegerLiteral() != null) {
            return Float.valueOf(ctx.IntegerLiteral().getText());
        }
        return null;
    }
}
