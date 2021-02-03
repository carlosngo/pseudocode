package antlr.visitor.expression;

import antlr.PseudocodeParser;
import antlr.PseudocodeParserBaseVisitor;
import exception.ArrayIndexException;
import exception.NotArrayException;
import exception.SemanticException;
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

public class BooleanExpressionVisitor extends PseudocodeParserBaseVisitor<Boolean> {
    private final ProgramManager programManager;
    private final VariableManager variableManager;
    private final FunctionManager functionManager;
    private final NotificationManager notificationManager;
    private final boolean isCompiling;

    public BooleanExpressionVisitor(ProgramManager programManager
            , boolean isCompiling) {
        this.programManager = programManager;
        functionManager = programManager.getFunctionManager();
        if (isCompiling) {
            variableManager = programManager
                    .getCompilationManager()
                    .getCurrentLocalVariables();
        } else {
            variableManager = programManager
                    .getExecutionManager()
                    .getCurrentLocalVariables();
        }
        notificationManager = programManager.getNotificationManager();
        this.isCompiling = isCompiling;
    }

    @Override
    public Boolean visitExpression(PseudocodeParser.ExpressionContext ctx) {
        return visit(ctx.logicalOrExpression());
    }

    @Override
    public Boolean visitLogicalOrExpression(PseudocodeParser.LogicalOrExpressionContext ctx)  {
        super.visitLogicalOrExpression(ctx);
        PseudocodeParser.LogicalAndExpressionContext left = ctx.logicalAndExpression(0);
        if (ctx.logicalAndExpression().size() == 1) {
            return visit(ctx.logicalAndExpression(0));
        }
        PseudocodeParser.LogicalAndExpressionContext right = ctx.logicalAndExpression(1);
        Boolean leftBoolean = visit(left);
        try {
            for (int i = 2; right != null; i++) {
                Boolean rightBoolean = visit(right);
                if (leftBoolean != null && rightBoolean != null) {
                    leftBoolean = leftBoolean || rightBoolean;
                } else {
                    return null;
                }
                right = ctx.logicalAndExpression(i);
            }
            return leftBoolean;
        } catch (NullPointerException e) { }
        return null;
    }

    @Override
    public Boolean visitLogicalAndExpression(PseudocodeParser.LogicalAndExpressionContext ctx) {
        super.visitLogicalAndExpression(ctx);
        PseudocodeParser.EqualityExpressionContext left = ctx.equalityExpression(0);
        if (ctx.equalityExpression().size() == 1) {
            return visit(ctx.equalityExpression(0));
        }
        PseudocodeParser.EqualityExpressionContext right = ctx.equalityExpression(1);
        Boolean leftBoolean = visit(left);
        try {
            for (int i = 2; right != null; i++) {
                Boolean rightBoolean = visit(right);
                if (leftBoolean != null && rightBoolean != null) {
                    leftBoolean = leftBoolean && rightBoolean;
                } else {
                    return null;
                }
                right = ctx.equalityExpression(i);
            }
            return leftBoolean;
        } catch (NullPointerException e) { }

        return null;
    }

    @Override
    public Boolean visitEqualityExpression(PseudocodeParser.EqualityExpressionContext ctx) {
        super.visitEqualityExpression(ctx);
        PseudocodeParser.RelationalExpressionContext left = ctx.relationalExpression(0);
        if (ctx.relationalExpression().size() == 1) {
            return visit(ctx.relationalExpression(0));
        }
        PseudocodeParser.RelationalExpressionContext right = ctx.relationalExpression(1);
        FloatingExpressionVisitor floatVisitor = new FloatingExpressionVisitor(programManager, isCompiling);
        StringExpressionVisitor stringVisitor = new StringExpressionVisitor(programManager, isCompiling);
        Boolean leftBoolean = visit(left);
        Float leftFloat = floatVisitor.visit(left);
        String leftString = stringVisitor.visit(left);
        try {
            for (int i = 2; right != null; i++) {
                Boolean rightBoolean = visit(right);
                Float rightFloat = floatVisitor.visit(right);
                String rightString = stringVisitor.visit(right);
                if (leftFloat != null && rightFloat != null) {
                    if (ctx.Equal(i - 2) != null) {
                        leftBoolean = leftFloat.equals(rightFloat);
                    } else {
                        leftBoolean = !leftFloat.equals(rightFloat);
                    }
                } else if (leftString != null && rightString != null) {
                    if (ctx.Equal(i - 2) != null) {
                        leftBoolean = leftString.equals(rightString);
                    } else {
                        leftBoolean = !leftString.equals(rightString);
                    }
                } else if (leftBoolean != null && rightBoolean != null) {
                    if (ctx.Equal(i - 2) != null) {
                        leftBoolean = leftBoolean.equals(rightBoolean);
                    } else {
                        leftBoolean = !leftBoolean.equals(rightBoolean);
                    }
                } else {
                    return null;
                }
                leftFloat = null;
                leftString = null;
                right = ctx.relationalExpression(i);
            }
            return leftBoolean;
        } catch (NullPointerException e) { }

        return null;
    }

    @Override
    public Boolean visitRelationalExpression(PseudocodeParser.RelationalExpressionContext ctx) {
        super.visitRelationalExpression(ctx);
        PseudocodeParser.AdditiveExpressionContext left = ctx.additiveExpression(0);
        if (ctx.additiveExpression().size() == 1) {
            return visit(ctx.additiveExpression(0));
        }
        PseudocodeParser.AdditiveExpressionContext right = ctx.additiveExpression(1);
        FloatingExpressionVisitor floatVisitor = new FloatingExpressionVisitor(programManager, isCompiling);
        Float leftFloat = floatVisitor.visit(left);
        Float rightFloat = floatVisitor.visit(right);
        try {
            if (leftFloat != null && rightFloat != null) {
                if (ctx.Less(0) != null) {
                    return leftFloat < rightFloat;
                } else if (ctx.Greater(0) != null) {
                    return leftFloat > rightFloat;
                } else if (ctx.GreaterEqual(0) != null) {
                    return leftFloat <= rightFloat;
                } else {
                    return leftFloat >= rightFloat;
                }
            }
        } catch (NullPointerException e) { }
        return null;
    }

    @Override
    public Boolean visitAdditiveExpression(PseudocodeParser.AdditiveExpressionContext ctx) {
        Boolean value = super.visitAdditiveExpression(ctx);
        if (ctx.multiplicativeExpression(1) != null) {
            return null;
        }
        return value;
    }

    @Override
    public Boolean visitMultiplicativeExpression(PseudocodeParser.MultiplicativeExpressionContext ctx) {
        Boolean value = super.visitMultiplicativeExpression(ctx);
        if (ctx.unaryExpression(1) != null) {
            return null;
        }
        return value;
    }

    @Override
    public Boolean visitUnaryExpression(PseudocodeParser.UnaryExpressionContext ctx) {
        Boolean value = super.visitUnaryExpression(ctx);
        if (ctx.binaryOperator() != null) {
            return null;
        }
        if (ctx.Not() != null && value != null) {
            return !value;
        }
        return value;
    }

    @Override
    public Boolean visitPrimaryExpression(PseudocodeParser.PrimaryExpressionContext ctx) {
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
    public Boolean visitFunctionCall(PseudocodeParser.FunctionCallContext ctx) {
        String identifier = ctx.Identifier().getText();
        List<PseudocodeParser.ExpressionContext> parameterContexts = ctx.expressionList().expression();
        int lineNumber = ctx.getStart().getLine();
        FunctionCallStatement statement
                = new FunctionCallStatement(
                programManager, identifier, parameterContexts, lineNumber);
        Storage.Type returnType = statement.getFunctionSignature().getType();
        if (returnType != Storage.Type.BOOLEAN) {
            return null;
        }
        if (isCompiling) {
            return (Boolean) Storage.getRandomValueOfType(returnType);
        } else {
            statement.execute();
            return (Boolean) statement.getReturnValue();
        }
    }

    @Override
    public Boolean visitArrayAccess(PseudocodeParser.ArrayAccessContext ctx) {
        String identifier = ctx.Identifier().getText();
        int lineNumber = ctx.getStart().getLine();
        IntegerExpressionVisitor integerExpressionVisitor = new IntegerExpressionVisitor(programManager, isCompiling);
        try {
            Integer index = integerExpressionVisitor.visitExpression(ctx.expression());
            if (index == null)
                throw new ArrayIndexException();
            Variable variable = variableManager.getVariable(identifier);
            if (variable.getType() != Storage.Type.BOOLEAN) {
                return null;
            }
            if (variable instanceof Array) {
                Array array = (Array) variable;
                if (isCompiling) {
                    return (Boolean) Storage.getRandomValueOfType(array.getType());
                } else {
                    return (Boolean) array.get(index);
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
    public Boolean visitVariableName(PseudocodeParser.VariableNameContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        if (ctx.Identifier() != null) {
            String identifier = ctx.Identifier().getText();
            try {
                Variable variable = variableManager.getVariable(identifier);
                if (variable.getType() != Storage.Type.BOOLEAN) {
                    return null;
                }
                if (variable instanceof Array) {
                    return null;
                } else {
                    if (isCompiling) {
                        return (Boolean) Storage.getRandomValueOfType(variable.getType());
                    } else {
                        return (Boolean) variable.getValue();
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
    public Boolean visitLiteral(PseudocodeParser.LiteralContext ctx) {
        if (ctx.BooleanLiteral() != null) {
            return Boolean.valueOf(ctx.BooleanLiteral().getText());
        }
        return null;
    }



}
