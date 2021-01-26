package storage;

import exception.ConstantReassignmentException;
import exception.TypeMismatchException;
import util.Keyword;

public class Variable extends Storage {
    public enum Type {
        UNKNOWN,
        CHAR,
        BOOLEAN,
        SHORT,
        INT,
        LONG,
        FLOAT,
        DOUBLE,
        STRING
    }

    private final boolean isFinal;
    private final Type type;
    private Object value;

    public Variable(Type type, String name) {
        this(false, type, name);
    }

    public Variable(boolean isFinal, Type type, String name) {
        super(name);
        this.type = type;
        this.isFinal = isFinal;
        value = null;
    }

    public Type getType() { return type; }

    public boolean isFinal() {
        return isFinal;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) throws TypeMismatchException, ConstantReassignmentException {
        if (getType() != Variable.typeOf(value)) {
            throw new TypeMismatchException(getType(), Variable.typeOf(value));
        }
        if (isFinal && getValue() != null) {
            throw new ConstantReassignmentException(this);
        }
        this.value = value;
    }

    public static Type parseType(String typeStr) {
        switch (typeStr) {
            case Keyword.INT:
                return Type.INT;
            case Keyword.BOOLEAN:
                return Type.BOOLEAN;
            case Keyword.CHAR:
                return Type.CHAR;
            case Keyword.SHORT:
                return Type.SHORT;
            case Keyword.LONG:
                return Type.LONG;
            case Keyword.FLOAT:
                return Type.FLOAT;
            case Keyword.DOUBLE:
                return Type.DOUBLE;
            case Keyword.STRING:
                return Type.STRING;
            default:
                return Type.UNKNOWN;
        }
    }


    public static Type typeOf(Object value) {
        if (value instanceof Character) {
            return Type.CHAR;
        } else if (value instanceof Boolean) {
            return Type.BOOLEAN;
        } else if (value instanceof Short) {
            return Type.SHORT;
        } else if (value instanceof Integer) {
            return Type.INT;
        } else if (value instanceof Long) {
            return Type.LONG;
        } else if (value instanceof Float) {
            return Type.FLOAT;
        } else if (value instanceof Double) {
            return Type.DOUBLE;
        } else if (value instanceof String) {
            return Type.STRING;
        }
        return Type.UNKNOWN;
    }
}
