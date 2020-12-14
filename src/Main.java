import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import gen.*;

import java.io.FileInputStream;


public class Main {
    public static void main(String[] args) throws Exception {
        PseudocodeLexer lexer = new PseudocodeLexer(CharStreams.fromFileName("res/in.txt"));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        PseudocodeParser parser = new PseudocodeParser(tokens);

        ParseTree tree = parser.init();

        System.out.println(tree.toStringTree(parser));
    }
}