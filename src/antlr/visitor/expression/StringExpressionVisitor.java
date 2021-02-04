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
import storage.Function;
import storage.Storage;
import storage.Variable;
import java.util.List;

public class StringExpressionVisitor extends PseudocodeParserBaseVisitor<String> {
    private final ProgramManager programManager;
    private final CompilationManager compilationManager;
    private final ExecutionManager executionManager;
    private final NotificationManager notificationManager;
    private final boolean isCompiling;

    public StringExpressionVisitor(ProgramManager programManager
            , boolean isCompiling) {
        this.programManager = programManager;
        compilationManager = programManager.getCompilationManager();
        executionManager = programManager.getExecutionManager();
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
        IntegerExpressionVisitor intVisitor = new IntegerExpressionVisitor(programManager, isCompiling);
        CharExpressionVisitor charVisitor = new CharExpressionVisitor(programManager, isCompiling);
        Boolean leftBoolean = boolVisitor.visit(left);
        Float leftFloat = floatVisitor.visit(left);
        Integer leftInt = intVisitor.visit(left);
        String leftString = visit(left);
        Character leftCharacter = charVisitor.visit(left);
        try {
            for (int i = 2; right != null; i++) {
                Boolean rightBoolean = boolVisitor.visit(right);
                Float rightFloat = floatVisitor.visit(right);
                String rightString = visit(right);
                Integer rightInt = intVisitor.visit(right);
                Character rightCharacter = charVisitor.visit(right);

//                System.out.println("left =" + left.getText());
//                System.out.println("right =" + right.getText());
//                System.out.println("leftBoolean = " + leftBoolean);
//                System.out.println("leftFloat = " + leftFloat);
//                System.out.println("leftString = " + leftString);
//                System.out.println("leftInt = " + leftInt);
//
//                System.out.println("rightBoolean = " + rightBoolean);
//                System.out.println("rightFloat = " + rightFloat);
//                System.out.println("rightString = " + rightString);
//                System.out.println("rightInt = " + rightInt);
                if (leftFloat != null && rightFloat != null) {
                    if (ctx.Plus(i - 2) != null) {
                        leftFloat = leftFloat + rightFloat;

                    } else {
                        leftFloat = leftFloat - rightFloat;
                    }
                    leftBoolean = null;
                    leftInt = null;
                    leftString = null;
                    leftCharacter = null;
                } else if (leftInt != null && rightInt != null) {
                    if (ctx.Plus(i - 2) != null) {
                        leftInt = leftInt + rightInt;

                    } else {
                        leftInt = leftInt - rightInt;
                    }
                    leftBoolean = null;
                    leftString = null;
                    leftFloat = null;
                    leftCharacter = null;
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
                        } else if (rightInt != null) {
                            leftString = leftString.concat(rightInt.toString());
                        } else if (rightCharacter != null) {
                            leftString = leftString.concat(rightCharacter.toString());
                        } else {
                            return null;
                        }
                    } else {
                        return null;
                    }
                    leftFloat = null;
                    leftBoolean = null;
                    leftInt = null;
                    leftCharacter = null;
                } else if (rightString != null) {
                    if (ctx.Plus(i - 2) != null) {
                        if (leftFloat != null) {
                            leftString = leftFloat.toString().concat(rightString);
                        } else if (leftBoolean != null) {
                            leftString = leftBoolean.toString().concat(rightString);
                        } else if (leftInt != null) {
                            leftString = leftInt.toString().concat(rightString);
                        } else if (leftCharacter != null) {
                            leftString = leftCharacter.toString().concat(rightString);
                        } else {
                            return null;
                        }
                    } else {
                        return null;
                    }
                    leftFloat = null;
                    leftBoolean = null;
                    leftInt = null;
                    leftCharacter = null;
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
            } else if (leftInt != null) {
                return leftInt.toString();
            } else if (leftCharacter != null) {
                return leftCharacter.toString();
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
        FunctionCallStatement statement = new FunctionCallStatement(
                programManager, identifier, parameterContexts, lineNumber, isCompiling);
        Storage.Type returnType = statement.getFunctionSignature().getType();
        if (returnType != Storage.Type.STRING) {
            return null;
        }
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
            Variable variable;
            if (isCompiling) {
                variable = compilationManager.getCurrentLocalVariables().getVariable(identifier);
            } else {
                variable = executionManager.getCurrentLocalVariables().getVariable(identifier);
            }
            if (variable.getType() != Storage.Type.STRING) {
                return null;
            }
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
                Variable variable;
                if (isCompiling) {
                    variable = compilationManager.getCurrentLocalVariables().getVariable(identifier);
                } else {
                    variable = executionManager.getCurrentLocalVariables().getVariable(identifier);
//                    System.out.println("currentVariableManager = " + executionManager.getCurrentLocalVariables());
                }
                if (variable.getType() != Storage.Type.STRING) {
                    return null;
                }
//                System.out.println("evaluated " + variable);
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
        if (ctx.StringLiteral() != null) {
            return ctx.getText().substring(1, ctx.getText().length() - 1);
        }
        return null;
    }

}
