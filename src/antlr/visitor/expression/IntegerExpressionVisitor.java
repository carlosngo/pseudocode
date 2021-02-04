package antlr.visitor.expression;

import antlr.PseudocodeParser;
import antlr.PseudocodeParserBaseVisitor;
import exception.ExpressionEvaluationException;
import exception.NotArrayException;
    import exception.SemanticException;
import exception.type.AssignmentException;
import exception.type.TypeMismatchException;
import manager.*;
import notification.event.SemanticErrorEvent;
import statement.compound.FunctionCallStatement;
import storage.Array;
import storage.Storage;
import storage.Variable;

import java.util.List;

public class IntegerExpressionVisitor extends PseudocodeParserBaseVisitor<Integer> {
    private final ProgramManager programManager;
    private final ExecutionManager executionManager;
    private final CompilationManager compilationManager;
    private final NotificationManager notificationManager;
    private final boolean isCompiling;

    public IntegerExpressionVisitor(ProgramManager programManager
            , boolean isCompiling) {
        this.programManager = programManager;
        executionManager = programManager.getExecutionManager();
        compilationManager = programManager.getCompilationManager();
        notificationManager = programManager.getNotificationManager();
        this.isCompiling = isCompiling;
    }

    @Override
    public Integer visitExpression(PseudocodeParser.ExpressionContext ctx) {

        return visit(ctx.logicalOrExpression());
    }

    @Override
    public Integer visitLogicalOrExpression(PseudocodeParser.LogicalOrExpressionContext ctx)  {
        Integer value = super.visitLogicalOrExpression(ctx);
        if (ctx.logicalAndExpression(1) != null) {
            return null;
        }
        return value;

    }

    @Override
    public Integer visitLogicalAndExpression(PseudocodeParser.LogicalAndExpressionContext ctx) {
        Integer value = super.visitLogicalAndExpression(ctx);
        if (ctx.equalityExpression(1) != null) {
            return null;
        }
        return value;
    }

    @Override
    public Integer visitEqualityExpression(PseudocodeParser.EqualityExpressionContext ctx) {
        Integer value = super.visitEqualityExpression(ctx);
        if (ctx.relationalExpression(1) != null) {
            return null;
        }
        return value;
    }

    @Override
    public Integer visitRelationalExpression(PseudocodeParser.RelationalExpressionContext ctx) {
        Integer value = super.visitRelationalExpression(ctx);
        if (ctx.additiveExpression(1) != null) {
            return null;
        }
        return value;
    }

    @Override
    public Integer visitAdditiveExpression(PseudocodeParser.AdditiveExpressionContext ctx) {
        PseudocodeParser.MultiplicativeExpressionContext left = ctx.multiplicativeExpression(0);
        PseudocodeParser.MultiplicativeExpressionContext right = ctx.multiplicativeExpression(1);
        Integer sum = visit(left);
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
    public Integer visitMultiplicativeExpression(PseudocodeParser.MultiplicativeExpressionContext ctx) {
        PseudocodeParser.UnaryExpressionContext left = ctx.unaryExpression(0);
        PseudocodeParser.UnaryExpressionContext right = ctx.unaryExpression(1);
        Integer product = visit(left);
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
    public Integer visitUnaryExpression(PseudocodeParser.UnaryExpressionContext ctx) {
        Integer value = super.visitUnaryExpression(ctx);
        if (ctx.Not() != null || ctx.binaryOperator() != null) {
            return null;
        }
        return value;
    }

    @Override
    public Integer visitPrimaryExpression(PseudocodeParser.PrimaryExpressionContext ctx) {
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
    public Integer visitFunctionCall(PseudocodeParser.FunctionCallContext ctx) {
        String identifier = ctx.Identifier().getText();
        List<PseudocodeParser.ExpressionContext> parameterContexts = ctx.expressionList().expression();
        int lineNumber = ctx.getStart().getLine();
        FunctionCallStatement statement
                = new FunctionCallStatement(
                        programManager, identifier, parameterContexts, lineNumber);
        Storage.Type returnType = statement.getFunctionSignature().getType();
        if (returnType != Storage.Type.INT) {
            return null;
        }
        if (isCompiling) {
            return (Integer) Storage.getRandomValueOfType(returnType);
        } else {
            statement.execute();
            return (Integer) statement.getReturnValue();
        }
    }

    @Override
    public Integer visitArrayAccess(PseudocodeParser.ArrayAccessContext ctx) {
        String identifier = ctx.Identifier().getText();
        Integer index = visit(ctx.expression());
        int lineNumber = ctx.getStart().getLine();
        if (index == null) {
            return null;
        }
        try {
            Variable variable;
            if (isCompiling) {
                variable = compilationManager.getCurrentLocalVariables().getVariable(identifier);
            } else {
                variable = executionManager.getCurrentLocalVariables().getVariable(identifier);
            }
            if (variable.getType() != Storage.Type.INT) {
                return null;
            }
            if (variable instanceof Array) {
                Array array = (Array) variable;
                if (isCompiling) {
                    return (Integer) Storage.getRandomValueOfType(array.getType());
                } else {
                    return (Integer) array.get(index);
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
    public Integer visitVariableName(PseudocodeParser.VariableNameContext ctx) {
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
                if (variable.getType() != Storage.Type.INT) {
                    return null;
                }
                if (variable instanceof Array) {
                    return null;
                } else {
                    if (isCompiling) {
                        return (Integer) Storage.getRandomValueOfType(variable.getType());
                    } else {
                        return (Integer) variable.getValue();
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
    public Integer visitLiteral(PseudocodeParser.LiteralContext ctx) {
        if (ctx.IntegerLiteral() == null) {
            return null;
        }
        return Integer.valueOf(ctx.IntegerLiteral().getText());
    }
}
