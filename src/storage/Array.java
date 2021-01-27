package storage;

import error.exception.ConstantReassignmentException;
import error.exception.IndexOutOfBoundsException;
import error.exception.TypeMismatchException;

public class Array extends Variable {

    public Array(Type type, String name, int level, int size) {
        this(false, type, name, level, size);
    }

    public Array(boolean isFinal, Type type, String name, int level, int size) {
        super(isFinal, type, name, level);
        try {
            super.setValue(new Object[size]);
        } catch (TypeMismatchException e) {
            System.err.println("unexpected type mismatch error.exception in array");
        } catch (ConstantReassignmentException e) {
            System.err.println("unexpected constant reassignment error.exception in array");
        }
    }

    @Override
    public void setValue(Object value) throws TypeMismatchException, ConstantReassignmentException {
        throw new ConstantReassignmentException(this);
    }

    public int getSize() {
        Variable[] array = (Variable[]) getValue();
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
            throw new TypeMismatchException(getType(), typeOf(value));
        }

        Object[] array = (Object[]) getValue();
        array[index] = value;
    }
}
