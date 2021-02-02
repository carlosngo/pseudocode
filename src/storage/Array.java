package storage;

import exception.ConstantReassignmentException;
import exception.IndexOutOfBoundsException;
import exception.type.AssignmentException;
import exception.type.TypeMismatchException;
import util.Keyword;

public class Array extends Variable {

    public Array(Type type, String name, int size) {
        this(false, type, name, size);
    }

    public Array(boolean isFinal, Type type, String name, int size) {
        super(isFinal, type, name);
        value = new Object[size];
    }

    @Override
    public void setValue(Object value) throws TypeMismatchException, ConstantReassignmentException {
        throw new ConstantReassignmentException(this);
    }

    public int getSize() {
        Object[] array = (Object[]) getValue();
        return array.length;
    }

    public Object get(int index) throws IndexOutOfBoundsException {
        if (index >= getSize() || index < 0) {
            throw new IndexOutOfBoundsException(index, getSize());
        }
        Object[] array = (Object[]) getValue();
        return array[index];
    }

    public void set(int index, Object value)
            throws IndexOutOfBoundsException, TypeMismatchException {
        if (index >= getSize() || index < 0) {
            throw new IndexOutOfBoundsException(index, getSize());
        }
        if (typeOf(value) != getType()) {
            throw new AssignmentException(getType(), typeOf(value));
        }

        Object[] array = (Object[]) getValue();
        array[index] = value;
    }

    @Override
    public String toString() {
        return Keyword.parseKeyword(getType()) + " " + getName() + "[" + getSize() + "]";
    }
}
