package storage;

import exception.ConstantReassignmentException;
import exception.TypeMismatchException;
import util.Keyword;

public abstract class Storage {
    private final String name;

    public Storage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
