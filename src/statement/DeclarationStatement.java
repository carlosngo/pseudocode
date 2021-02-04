package statement;

import exception.SemanticException;
import manager.ProgramManager;
import manager.VariableManager;
import storage.Array;
import storage.Function;
import storage.Storage;
import storage.Variable;

public class DeclarationStatement extends Statement {
    private final boolean isFinal;
    private final Integer size;
    private final String type;
    private final String identifier;

    public DeclarationStatement(ProgramManager programManager
            , boolean isFinal
            , String type
            , String identifier
            , int lineNumber) {
        super(programManager, lineNumber);
        this.isFinal = isFinal;
        this.type = type;
        size = null;
        this.identifier = identifier;
        try {
            programManager
                    .getCompilationManager()
                    .getCurrentLocalVariables()
                    .addVariable(new Variable(isFinal, Storage.parseType(type), identifier));
        } catch(SemanticException e) {
            notifyErrorListeners(e);
        }
    }

    public DeclarationStatement(ProgramManager programManager
            , boolean isFinal
            , String type
            , String identifier
            , int size
            , int lineNumber) {
        super(programManager, lineNumber);
        this.isFinal = isFinal;
        this.type = type;
        this.size = size;
        this.identifier = identifier;
        try {
            programManager
                    .getCompilationManager()
                    .getCurrentLocalVariables()
                    .addVariable(new Array(isFinal, Storage.parseType(type), identifier, size));
        } catch(SemanticException e) {
            notifyErrorListeners(e);
        }
    }

    public Storage.Type getType() {
        return Storage.parseType(type);
    }

    @Override
    public void execute() {
        tryExecution();
        try {
            System.out.println("declaring " + identifier + " at line " + getLineNumber());
            if (size == null) {
                getProgramManager()
                        .getExecutionManager()
                        .getCurrentLocalVariables()
                        .addVariable(new Variable(isFinal, Storage.parseType(type), identifier));
            } else {
                getProgramManager()
                        .getExecutionManager()
                        .getCurrentLocalVariables()
                        .addVariable(new Array(isFinal, Storage.parseType(type), identifier, size));
            }
            System.out.println("declared " + identifier + " at line " + getLineNumber());
        } catch (SemanticException e) {
            System.err.println("error from " + this);
            System.err.println("unexpected compilation error during runtime: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return (isFinal ? "final " : "") + type + (size == null ? " " : "[" + size + "] ") + identifier + ";";
    }
}
