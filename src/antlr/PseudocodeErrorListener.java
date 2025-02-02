package antlr;

import notification.event.SemanticErrorEvent;
import notification.listener.SemanticErrorListener;
import org.antlr.v4.runtime.*;
import statement.Statement;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PseudocodeErrorListener extends BaseErrorListener implements SemanticErrorListener {
    private final ArrayList<String> errorList = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        String errorStr = "syntax error: ";

        //System.err.print("syntax error: ");

        if (e instanceof FailedPredicateException) {
            //System.err.print("Failed predicate error.exception: " + msg);
            errorStr = errorStr.concat("Failed predicate error.exception: " + msg);
        } else if (e instanceof InputMismatchException) {
//            System.err.print("unexpected token '" + e.getOffendingToken().getText() + "'");
            errorStr = errorStr.concat("unexpected token '" + e.getOffendingToken().getText() + "'");
        } else if (e instanceof LexerNoViableAltException) {
//            System.err.println(msg);
            Pattern p = Pattern.compile("token recognition error at: \'([^\"]*)\'");
            Matcher m = p.matcher(msg);
            m.find();
            // System.err.print("unknown token '" + m.group(1) + "'");
            errorStr = errorStr.concat("unknown token '" + m.group(1) + "'");
        } else if (e instanceof NoViableAltException) {
            // System.err.print("unexpected token '" + e.getOffendingToken().getText() + "'");
            errorStr = errorStr.concat("unexpected token '" + e.getOffendingToken().getText() + "'");
        } else { // recovered successfully
            Parser parser = (Parser) recognizer;
            Vocabulary vocabulary = parser.getVocabulary();
            List<Integer> expectedTokens = parser.getExpectedTokens().toList();
            if (msg.split(" ")[0].equals("missing")) {
//                System.err.print("missing token. expected ");
                errorStr = errorStr.concat("missing token. expected ");
                if (expectedTokens.size() == 1) {
                    String name = vocabulary.getLiteralName(expectedTokens.get(0));
                    if (name == null) {
//                        System.err.print(vocabulary.getSymbolicName(expectedTokens.get(0)));
                        errorStr = errorStr.concat(vocabulary.getSymbolicName(expectedTokens.get(0)));
                    } else {
//                        System.err.print(name);
                        errorStr = errorStr.concat(name);
                    }
                } else {
//                    System.err.print("{");
                    errorStr = errorStr.concat("{");
                    for (int i = 0; i < expectedTokens.size(); i++) {
                        if (i > 0) {
//                            System.err.print(", ");
                            errorStr = errorStr.concat(", ");
                        }
                        String name = vocabulary.getLiteralName(expectedTokens.get(i));
                        if (name == null) {
//                            System.err.print(vocabulary.getSymbolicName(expectedTokens.get(i)));
                            errorStr = errorStr.concat(vocabulary.getSymbolicName(expectedTokens.get(i)));
                        } else {
//                            System.err.print(name);
                            errorStr = errorStr.concat(name);
                        }
                    }
//                    System.err.print("}");
                    errorStr = errorStr.concat("}");
                }

            } else if (msg.split(" ")[0].equals("extraneous")) {
//                System.err.print("redundant \'" + ((Token) offendingSymbol).getText() + "\'");
                errorStr = errorStr.concat("redundant \'" + ((Token) offendingSymbol).getText() + "\'");
            } else {
//                System.err.print(msg);
                errorStr = errorStr.concat(msg);
            }
        }
//        System.err.println(" at line " + line);

        errorList.add(errorStr + " at line " + line);
//        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
//        Collections.reverse(stack);
//        System.err.println("rule stack: "+stack);
//        System.err.println("line "+line+ ": "+msg);
    }

    @Override
    public void onSemanticError(SemanticErrorEvent evt) {
        evt.getError().printStackTrace();
        errorList.add("semantic error: "
                + evt.getError().getMessage()
                + " at line "
                + evt.getLineNumber());
    }

    public ArrayList<String> getErrorList() {
        return errorList;
    }
}
