package error.exception;

public class IndexOutOfBoundsException extends SemanticException {
    private final int index;
    private final int arraySize;

    public IndexOutOfBoundsException(int index, int arraySize) {
        super("index " + index + " is out of bounds in array of size " + arraySize);
        this.index = index;
        this.arraySize = arraySize;
    }

    public int getIndex() {
        return index;
    }

    public int getArraySize() {
        return arraySize;
    }
}
