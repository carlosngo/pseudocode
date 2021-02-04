package antlr.visitor.expression;

import antlr.PseudocodeParserBaseVisitor;
import manager.ProgramManager;
import storage.Storage;

public class ExpressionVisitorFactory {
    public static PseudocodeParserBaseVisitor getExpressionVisitor(ProgramManager programManager
            , Storage.Type type
            , boolean isCompiling) {

        switch(type) {
            case BOOLEAN:
                return new BooleanExpressionVisitor(programManager, isCompiling);
            case INT:
                return new IntegerExpressionVisitor(programManager, isCompiling);
            case FLOAT:
                return new FloatingExpressionVisitor(programManager, isCompiling);
            case STRING:
                return new StringExpressionVisitor(programManager, isCompiling);
            case CHAR:
                return new CharExpressionVisitor(programManager, isCompiling);
        }
        return null;
    }
}
