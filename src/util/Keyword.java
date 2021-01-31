package util;

import storage.Storage;

public class Keyword {
    public static final String INT = "int";
    public static final String BOOLEAN = "boolean";
    public static final String CHAR = "char";
    public static final String SHORT = "short";
    public static final String LONG = "long";
    public static final String FLOAT = "float";
    public static final String DOUBLE = "double";
    public static final String STRING = "String";
    public static final String VOID = "void";
    public static final String TRUE = "T";
    public static final String FALSE = "F";

    public static String parseKeyword(Storage.Type type) {
        switch (type) {
            case UNKNOWN:
                return null;
            case CHAR:
                return Keyword.CHAR;
            case BOOLEAN:
                return Keyword.BOOLEAN;
            case SHORT:
                return Keyword.SHORT;
            case INT:
                return Keyword.INT;
            case LONG:
                return Keyword.LONG;
            case FLOAT:
                return Keyword.FLOAT;
            case DOUBLE:
                return Keyword.DOUBLE;
            case STRING:
                return Keyword.STRING;
            case VOID:
                return Keyword.VOID;
        }
        return null;
    }
}
