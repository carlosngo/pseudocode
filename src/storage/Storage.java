package storage;

import util.Keyword;

public abstract class Storage {
    public enum Type {
        UNKNOWN,
        CHAR,
        BOOLEAN,
        SHORT,
        INT,
        LONG,
        FLOAT,
        DOUBLE,
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
            case Keyword.VOID:
                return Type.VOID;
            default:
                return Type.UNKNOWN;
        }
    }


    public static Type typeOf(Object value) {
        if (value == null) {
            return Type.VOID;
        } else if (value instanceof Character) {
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
