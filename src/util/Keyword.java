package util;

import storage.Storage;

public class Keyword {
    public static final String INT = "int";
    public static final String CHAR = "char";
    public static final String BOOLEAN = "bool";
    public static final String FLOAT = "float";
    public static final String STRING = "String";
    public static final String VOID = "void";
    public static final String TRUE = "T";
    public static final String FALSE = "F";
    public static final String PLUS = "+";
    public static final String MINUS = "-";
    public static final String TIMES = "*";
    public static final String DIVIDE = "/";
    public static final String LESS = "<";

    public static String parseKeyword(Storage.Type type) {
        switch (type) {
            case BOOLEAN:
                return Keyword.BOOLEAN;
            case INT:
                return Keyword.INT;
            case CHAR:
                return Keyword.CHAR;
            case FLOAT:
                return Keyword.FLOAT;
            case STRING:
                return Keyword.STRING;
            case VOID:
                return Keyword.VOID;
        }
        return null;
    }
}
