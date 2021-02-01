package storage;

import exception.ExpressionEvaluationException;
import util.Keyword;

public abstract class Storage {
    public enum Type {
        UNKNOWN,
        BOOLEAN,
        INT,
        FLOAT,
        STRING,
        VOID
    }

    private final Type type;
    private final String name;

    public Storage(Type type, String name) {
        this.type = type;
        this.name = name;
    }

    public Type getType() { return type; }

    public String getName() {
        return name;
    }

    public static Type parseType(String typeStr) {
        switch (typeStr) {
            case Keyword.INT:
                return Type.INT;
            case Keyword.BOOLEAN:
                return Type.BOOLEAN;
            case Keyword.FLOAT:
                return Type.FLOAT;
            case Keyword.STRING:
                return Type.STRING;
            case Keyword.VOID:
                return Type.VOID;
        }
        return Type.UNKNOWN;
    }

    public static Type typeOf(Object value) {
        if (value == null) {
            return Type.VOID;
        } else if (value instanceof Boolean) {
            return Type.BOOLEAN;
        } else if (value instanceof Integer) {
            return Type.INT;
        } else if (value instanceof Float) {
            return Type.FLOAT;
        } else if (value instanceof String) {
            return Type.STRING;
        }
        return Type.UNKNOWN;
    }

    public static Object getRandomValueOfType(Type type) {
        switch (type) {
            case BOOLEAN:
                return Boolean.TRUE;
            case INT:
                return Integer.MIN_VALUE;
            case FLOAT:
                return Float.MIN_VALUE;
            case STRING:
                return "";
        }
        return null;
    }

    public static Type getResultingType(
            Type leftOperand
            , String operator
            , Type rightOperand) throws ExpressionEvaluationException {


        switch(operator) {
            case Keyword.PLUS:
                if (leftOperand == Type.STRING || rightOperand == Type.STRING) {
                    return Type.STRING;
                }

                break;
            case Keyword.MINUS:
                if (leftOperand == Type.STRING || rightOperand == Type.STRING) {
                    // cannot do String - String
                    throw new ExpressionEvaluationException(leftOperand, operator, rightOperand);
                }
                break;
            case Keyword.TIMES:
                break;
            case Keyword.DIVIDE:
                break;

        }
        return Type.UNKNOWN;
    }

}
