package gen;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;

import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PseudocodeErrorListener extends BaseErrorListener {

    public static final PseudocodeErrorListener INSTANCE = new PseudocodeErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {

        System.err.print("syntax error: ");

        if (e instanceof FailedPredicateException) {
            System.err.print("Failed predicate exception: " + msg);
        } else if (e instanceof InputMismatchException) {
            System.err.print("unexpected token '" + e.getOffendingToken().getText() + "'");
        } else if (e instanceof LexerNoViableAltException) {
            Pattern p = Pattern.compile("token recognition error at: \'([^\"]*)\'");
            Matcher m = p.matcher(msg);
            m.find();
            System.err.print("unknown token '" + m.group(1) + "'");
        } else if (e instanceof NoViableAltException) {
            System.err.print("unexpected token '" + e.getOffendingToken().getText() + "'");
        } else { // recovered successfully
            Parser parser = (Parser) recognizer;
            Vocabulary vocabulary = parser.getVocabulary();
            List<Integer> expectedTokens = parser.getExpectedTokens().toList();
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
