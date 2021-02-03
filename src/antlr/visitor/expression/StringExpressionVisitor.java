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

public class StringExpressionVisitor extends PseudocodeParserBaseVisitor<String> {
    private final ProgramManager programManager;
    private final VariableManager variableManager;
    private final FunctionManager functionManager;
    private final NotificationManager notificationManager;
    private final boolean isCompiling;

    public StringExpressionVisitor(ProgramManager programManager
            , boolean isCompiling) {
        this.programManager = programManager;
        functionManager = programManager.getFunctionManager();
        variableManager = programManager
                .getCompilationManager()
                .getCurrentLocalVariables();
        notificationManager = programManager.getNotificationManager();
        this.isCompiling = isCompiling;
    }

    @Override
    public String visitExpression(PseudocodeParser.ExpressionContext ctx) {
        return visit(ctx.logicalOrExpression());
    }

    /** if there is an boolean operator in the expression, the resulting expression will have a boolean value.
     * If there is a boolean value in the expression, it cannot be typecasted to boolean
     * Therefore, visit normally but return null
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitLogicalOrExpression(PseudocodeParser.LogicalOrExpressionContext ctx)  {
        String value = super.visitLogicalOrExpression(ctx);
        if (ctx.logicalAndExpression(1) != null) {
            return null;
        }
        return value;

    }

    @Override
    public String visitLogicalAndExpression(PseudocodeParser.LogicalAndExpressionContext ctx) {
        String value = super.visitLogicalAndExpression(ctx);
        if (ctx.equalityExpression(1) != null) {
            return null;
        }
        return value;
    }

    @Override
    public String visitEqualityExpression(PseudocodeParser.EqualityExpressionContext ctx) {
        String value = super.visitEqualityExpression(ctx);
        if (ctx.relationalExpression(1) != null) {
            return null;
        }
        return value;
    }

    @Override
    public String visitRelationalExpression(PseudocodeParser.RelationalExpressionContext ctx) {
        String value = super.visitRelationalExpression(ctx);
        if (ctx.additiveExpression(1) != null) {
            return null;
        }
        return value;
    }

    @Override
    public String visitAdditiveExpression(PseudocodeParser.AdditiveExpressionContext ctx) {
        PseudocodeParser.MultiplicativeExpressionContext left = ctx.multiplicativeExpression(0);
        PseudocodeParser.MultiplicativeExpressionContext right = ctx.multiplicativeExpression(1);

        String sum = visit(left);

        if(!ctx.PlusPlus().isEmpty() || !ctx.MinusMinus().isEmpty()){
            return null;
        }

        for (int i = 2; right != null; i++){
            if (ctx.Plus(i - 2) == null){
                return null;
            } else {
                sum.concat(visit(right));
            }
        }

        return sum;
    }

    @Override
    public String visitMultiplicativeExpression(PseudocodeParser.MultiplicativeExpressionContext ctx) {
        String value = super.visitMultiplicativeExpression(ctx);
        if (ctx.unaryExpression().size() > 1) {
            return null;
        }
        return value;
    }

    @Override
    public String visitUnaryExpression(PseudocodeParser.UnaryExpressionContext ctx) {
        String value = super.visitUnaryExpression(ctx);
        if (ctx.Not() != null || ctx.binaryOperator() != null) {
            return null;
        }
        return value;
    }

    @Override
    public String visitPrimaryExpression(PseudocodeParser.PrimaryExpressionContext ctx) {
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
    public String visitFunctionCall(PseudocodeParser.FunctionCallContext ctx) {
        String identifier = ctx.Identifier().getText();
        List<PseudocodeParser.ExpressionContext> parameterContexts = ctx.expressionList().expression();
        int lineNumber = ctx.getStart().getLine();
        FunctionCallStatement statement
                = new FunctionCallStatement(
                programManager, identifier, parameterContexts, lineNumber);
        Storage.Type returnType = statement.getFunctionSignature().getType();
        if (returnType != Storage.Type.STRING) {
            return null;
        }
        if (isCompiling) {
            return (String) Storage.getRandomValueOfType(returnType);
        } else {
            statement.execute();
            return (String) statement.getReturnValue();
        }
    }

    @Override
    public String visitArrayAccess(PseudocodeParser.ArrayAccessContext ctx) {
        String identifier = ctx.Identifier().getText();
        int lineNumber = ctx.getStart().getLine();
        IntegerExpressionVisitor integerExpressionVisitor = new IntegerExpressionVisitor(programManager, isCompiling);
        try {
            Integer index = integerExpressionVisitor.visitExpression(ctx.expression());
            if (index == null)
                throw new ArrayIndexException();
            Variable variable = variableManager.getVariable(identifier);
            if (variable.getType() != Storage.Type.STRING) {
                return null;
            }
            if (variable instanceof Array) {
                Array array = (Array) variable;
                if (isCompiling) {
                    return (String) Storage.getRandomValueOfType(array.getType());
                } else {
                    return (String) array.get(index);
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
    public String visitVariableName(PseudocodeParser.VariableNameContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        if (ctx.Identifier() != null) {
            String identifier = ctx.Identifier().getText();
            try {
                Variable variable = variableManager.getVariable(identifier);
                if (variable.getType() != Storage.Type.STRING) {
                    return null;
                }
                if (variable instanceof Array) {
                    return null;
                } else {
                    if (isCompiling) {
                        return (String) Storage.getRandomValueOfType(variable.getType());
                    } else {
                        return (String) variable.getValue();
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
    public String visitLiteral(PseudocodeParser.LiteralContext ctx) {
        if (ctx.StringLiteral() == null) {
            return null;
        }
        return String.valueOf(ctx.StringLiteral().getText());
    }

}
