package gen;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;

import java.util.Collections;
import java.util.List;


public class PseudocodeErrorListener extends BaseErrorListener {

    public static final PseudocodeErrorListener INSTANCE = new PseudocodeErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        Parser parser = (Parser) recognizer;
        Vocabulary vocabulary = parser.getVocabulary();
        List<Integer> expectedTokens = parser.getExpectedTokens().toList();

        System.err.print("syntax error: ");

        if (e instanceof FailedPredicateException) {
            System.err.print("Failed predicate exception: " + msg);
        } else if (e instanceof InputMismatchException) {
            System.err.print("Input mismatch exception: " + msg);
        } else if (e instanceof LexerNoViableAltException) {
            System.err.print("Lexer no viable alt exception: " + msg);
        } else if (e instanceof NoViableAltException) {
            System.err.print("No viable alt exception: " + msg);
        } else { // recovered successfully
            if (msg.split(" ")[0].equals("missing")) {
                System.err.print("expected ");
                if (expectedTokens.size() == 1) {
                    System.err.print(vocabulary.getLiteralName(expectedTokens.get(0)));
                } else {
                    System.err.print("{");
                    for (int i = 0; i < expectedTokens.size(); i++) {
                        if (i > 0) {
                            System.err.print(", ");
                        }
                        System.err.print(vocabulary.getLiteralName(expectedTokens.get(i)));
                    }
                    System.err.print("}");
                }

            } else if (msg.split(" ")[0].equals("extraneous")) {
                System.err.print("redundant \'" + ((Token) offendingSymbol).getText() + "\'");
            } else {
                System.err.print(msg);
            }
        }
        System.err.println(" at line " + line);
//        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
//        Collections.reverse(stack);
//        System.err.println("rule stack: "+stack);
//        System.err.println("line "+line+ ": "+msg);
    }
}
