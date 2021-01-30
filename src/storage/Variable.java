package storage;

import error.exception.ConstantReassignmentException;
import error.exception.type.AssignmentException;
import error.exception.type.TypeMismatchException;
import util.Keyword;

public class Variable extends Storage {


    private final boolean isFinal;
    private int level;
    private Object value;

    public Variable(Type type, String name) {
        this(false, type, name);
    }

    public Variable(boolean isFinal, Type type, String name) {
        super(type, name);
        this.isFinal = isFinal;
        value = null;
    }


    public boolean isFinal() {
        return isFinal;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) throws TypeMismatchException, ConstantReassignmentException {
        if (getType() != Storage.typeOf(value)) {
            throw new AssignmentException(getType(), Storage.typeOf(value));
        }
        if (isFinal && getValue() != null) {
            throw new ConstantReassignmentException(this);
        }
        this.value = value;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}