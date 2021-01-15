package gen;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PseudocodeErrorStrategy extends DefaultErrorStrategy {
    @Override
    public void recover(Parser recognizer, RecognitionException e) {
//        super.recover(recognizer, e);
        if (this.lastErrorIndex == recognizer.getInputStream().index() && this.lastErrorStates != null && this.lastErrorStates.contains(recognizer.getState())) {
            recognizer.consume();
        }

        this.lastErrorIndex = recognizer.getInputStream().index();
        if (this.lastErrorStates == null) {
            this.lastErrorStates = new IntervalSet(new int[0]);
        }

        this.lastErrorStates.add(recognizer.getState());

        while (!recognizer.getCurrentToken().equals(e.getOffendingToken())) {
            recognizer.consume();
        }
//        System.err.println("offending token = " + e.getOffendingToken());
//        System.err.println("Consuming until newline, semicolon, or right brace...");

        this.consumeUntil(recognizer, new IntervalSet(
                PseudocodeParser.LeftBrace,
                PseudocodeParser.RightBrace,
                PseudocodeParser.Semi));
        IntervalSet intervalSet = this.getErrorRecoverySet(recognizer);


        recognizer.consume();
//        System.err.println("current token = " + recognizer.getCurrentToken());
//        System.err.println("next tokens: " + intervalSet);
        this.consumeUntil(recognizer, intervalSet);
    }
}
