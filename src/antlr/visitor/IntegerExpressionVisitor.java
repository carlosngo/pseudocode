package antlr.visitor;

import antlr.PseudocodeParser;
import antlr.PseudocodeParserBaseVisitor;
import exception.ExpressionEvaluationException;
import exception.NotArrayException;
import exception.SemanticException;
import exception.type.AssignmentException;
import exception.type.TypeMismatchException;
import manager.FunctionManager;
import manager.NotificationManager;
import manager.ProgramManager;
import manager.VariableManager;
import notification.event.SemanticErrorEvent;
import statement.compound.FunctionCallStatement;
import storage.Array;
import storage.Storage;
import storage.Variable;

import java.util.List;

public class IntegerExpressionVisitor extends PseudocodeParserBaseVisitor<Integer> {
    private final ProgramManager programManager;
    private final VariableManager variableManager;
    private final FunctionManager functionManager;
    private final NotificationManager notificationManager;
    private final boolean isCompiling;

    public IntegerExpressionVisitor(ProgramManager programManager
            , boolean isCompiling) {
        this.programManager = programManager;
        functionManager = programManager.getFunctionManager();
        variableManager = functionManager
                .getCurrentFunction()
                .getVariableManager();
        notificationManager = programManager.getNotificationManager();
        this.isCompiling = isCompiling;
    }

    @Override
    public Integer visitExpression(PseudocodeParser.ExpressionContext ctx) {
        return visit(ctx.logicalOrExpression());
    }

    @Override
    public Integer visitLogicalOrExpression(PseudocodeParser.LogicalOrExpressionContext ctx)  {
        PseudocodeParser.LogicalAndExpressionContext left = ctx.logicalAndExpression(0);
        PseudocodeParser.LogicalAndExpressionContext right = ctx.logicalAndExpression(1);

        if (right != null) {
            return null;
        }
        return visit(left);
    }

    @Override
    public Integer visitLogicalAndExpression(PseudocodeParser.LogicalAndExpressionContext ctx) {
        PseudocodeParser.EqualityExpressionContext left = ctx.equalityExpression(0);
        PseudocodeParser.EqualityExpressionContext right = ctx.equalityExpression(1);
        if (right != null) {
            return null;
        }
        return visit(left);
    }

    @Override
    public Integer visitEqualityExpression(PseudocodeParser.EqualityExpressionContext ctx) {
        PseudocodeParser.RelationalExpressionContext left = ctx.relationalExpression(0);
        PseudocodeParser.RelationalExpressionContext right = ctx.relationalExpression(1);
        if (right != null) {
            return null;
        }
        return visit(left);
    }

    @Override
    public Integer visitRelationalExpression(PseudocodeParser.RelationalExpressionContext ctx) {
        PseudocodeParser.AdditiveExpressionContext left = ctx.additiveExpression(0);
        PseudocodeParser.AdditiveExpressionContext right = ctx.additiveExpression(1);
        if (right != null) {
            return null;
        }
        return visit(left);
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
            if (ctx.Plus(i - 2) == null) {
                sum -= visit(right);
            } else {
                sum += visit(right);
            }
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
            if (ctx.Star(i - 2) == null) {
                product *= visit(right);
            } else {
                product /= visit(right);
            }
            right = ctx.unaryExpression(i);
        }
        return product;
    }

    @Override
    public Integer visitUnaryExpression(PseudocodeParser.UnaryExpressionContext ctx) {
        if (ctx.Not() != null || ctx.binaryOperator() != null || ctx.unaryExpression() != null) {
            return null;
        }
        return visit(ctx.postfixExpression());
    }

    @Override
    public Integer visitPrimaryExpression(PseudocodeParser.PrimaryExpressionContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        if (ctx.literal(0) != null) {
            return visit(ctx.literal(0));
        }
        if (ctx.Identifier(0) != null) {
            String identifier = ctx.Identifier(0).getText();
            try {
                Variable variable = variableManager.getVariable(identifier);
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
        if (ctx.expression() != null) {
            return visit(ctx.expression());
        }
        return null;
    }

    @Override
    public Integer visitFunctionCall(PseudocodeParser.FunctionCallContext ctx) {
        String identifier = ctx.Identifier().getText();
        List<PseudocodeParser.ExpressionContext> parameterContexts = ctx.expressionList().initializerList().expression();
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
            Variable variable = variableManager.getVariable(identifier);
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


}
