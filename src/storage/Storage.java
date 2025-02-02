package storage;

import exception.ExpressionEvaluationException;
import util.Keyword;

public abstract class Storage {
    public enum Type {
        UNKNOWN,
        BOOLEAN,
        INT,
        CHAR,
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
            case Keyword.CHAR:
                return Type.CHAR;
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
        } else if (value instanceof Character) {
            return Type.CHAR;
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
                return 100;
            case CHAR:
                return 'a';
            case FLOAT:
                return 100.0f;
            case STRING:
                return "";
        }
        return null;
    }

    public static Object convertFromString(String value, Type type) {
        switch (type) {
            case BOOLEAN:
                return Boolean.parseBoolean(value);
            case INT:
                return Integer.parseInt(value);
            case CHAR:
                if (value.length() == 1) {
                    return value.charAt(0);
                }
            case FLOAT:
                return Float.parseFloat(value);
            case STRING:
                return value;
        }
        return null;
    }


}
