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
    public String visitExpression(PseudocodeParser.ExpressionContext ctx) {
        return visit(ctx.logicalOrExpression());
    }

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
        super.visitAdditiveExpression(ctx);
        PseudocodeParser.MultiplicativeExpressionContext left = ctx.multiplicativeExpression(0);
        if (ctx.multiplicativeExpression().size() == 1) {
            return visit(ctx.multiplicativeExpression(0));
        }
        PseudocodeParser.MultiplicativeExpressionContext right = ctx.multiplicativeExpression(1);
        BooleanExpressionVisitor boolVisitor = new BooleanExpressionVisitor(programManager, isCompiling);
        FloatingExpressionVisitor floatVisitor = new FloatingExpressionVisitor(programManager, isCompiling);
        Boolean leftBoolean = boolVisitor.visit(left);
        Float leftFloat = floatVisitor.visit(left);
        String leftString = visit(left);
        try {
            for (int i = 2; right != null; i++) {
                Boolean rightBoolean = boolVisitor.visit(right);
                Float rightFloat = floatVisitor.visit(right);
                String rightString = visit(right);
                if (leftFloat != null && rightFloat != null) {
                    if (ctx.Plus(i - 2) != null) {
                        leftFloat = leftFloat + rightFloat;

                    } else {
                        leftFloat = leftFloat - rightFloat;
                    }
                    leftBoolean = null;
                    leftString = null;
                } else if (leftString != null && rightString != null) {
                    if (ctx.Plus(i - 2) != null) {
                        leftString = leftString.concat(rightString);
                    } else {
                        return null;
                    }
                } else if (leftString != null) {
                    if (ctx.Plus(i - 2) != null) {
                        if (rightFloat != null) {
                            leftString = leftString.concat(rightFloat.toString());
                        } else if (rightBoolean != null) {
                            leftString = leftString.concat(rightBoolean.toString());
                        } else {
                            return null;
                        }
                    } else {
                        return null;
                    }
                    leftFloat = null;
                    leftBoolean = null;
                } else if (rightString != null) {
                    if (ctx.Plus(i - 2) != null) {
                        if (leftFloat != null) {
                            leftString = leftFloat.toString().concat(rightString);
                        } else if (leftBoolean != null) {
                            leftString = leftBoolean.toString().concat(rightString);
                        } else {
                            return null;
                        }
                    } else {
                        return null;
                    }
                    leftFloat = null;
                    leftBoolean = null;
                } else {
                    return null;
                }
                right = ctx.multiplicativeExpression(i);
            }
            if (leftString != null) {
                return leftString;
            } else if (leftFloat != null) {
                return leftFloat.toString();
            } else if (leftBoolean != null) {
                return leftBoolean.toString();
            }
        } catch (NullPointerException e) { }

        return null;
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
        if (isCompiling) {
            return Storage.getRandomValueOfType(returnType).toString();
        } else {
            statement.execute();
            return statement.getReturnValue().toString();
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
            if (variable instanceof Array) {
                Array array = (Array) variable;
                if (isCompiling) {
                    return Storage.getRandomValueOfType(array.getType()).toString();
                } else {
                    return array.get(index).toString();
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
                if (variable instanceof Array) {
                    return null;
                } else {
                    if (isCompiling) {
                        return Storage.getRandomValueOfType(variable.getType()).toString();
                    } else {
                        return variable.getValue().toString();
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
        if (ctx.FloatingLiteral() != null) {
            return ctx.getText().substring(0, ctx.getText().length() - 1);
        }
        if (ctx.StringLiteral() != null) {
            return ctx.getText().substring(1, ctx.getText().length() - 1);
        }
        return ctx.getText();
    }

}
