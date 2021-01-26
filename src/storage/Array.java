package storage;

import exception.ConstantReassignmentException;
import exception.IndexOutOfBoundsException;
import exception.TypeMismatchException;

public class Array extends Variable {

    public Array(Type type, String name, int level, int size) {
        this(false, type, name, level, size);
    }

    public Array(boolean isFinal, Type type, String name, int level, int size) {
        super(isFinal, type, name, level);
        try {
            super.setValue(new Variable[size]);
        } catch (TypeMismatchException e) {
            System.err.println("unexpected type mismatch exception in array");
        } catch (ConstantReassignmentException e) {
            System.err.println("unexpected constant reassignment exception in array");
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

    public Variable get(int index) throws IndexOutOfBoundsException {
        if (index >= getSize() || index < 0) {
            throw new IndexOutOfBoundsException(index, getSize());
        }
        Variable[] array = (Variable[]) getValue();
        return array[index];
    }

    public void set(int index, Variable variable)
            throws IndexOutOfBoundsException, TypeMismatchException {
        if (index >= getSize() || index < 0) {
            throw new IndexOutOfBoundsException(index, getSize());
        }
        if (variable.getType() != getType()) {
            throw new TypeMismatchException(getType(), variable.getType());
        }

        Variable[] array = (Variable[]) getValue();
        array[index] = variable;
    }
}
