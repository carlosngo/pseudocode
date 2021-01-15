package gui;

import gen.PseudocodeErrorListener;
import gen.PseudocodeErrorStrategy;
import gen.PseudocodeLexer;
import gen.PseudocodeParser;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class MainView {

    /*
    Put gui objects here
     */

    @FXML
    public AnchorPane mainPane;
    @FXML
    public GridPane bodyPane;
    @FXML
    public ScrollPane inputScrollPane;
    @FXML
    public ScrollPane errorsScrollPane;
    @FXML
    public Pane inputFilePane;
    @FXML
    public Pane inputPane1;
    @FXML
    public Pane errorsPane1;
    @FXML
    public Label inputContentsLabel;
    @FXML
    public Label consoleLabel;
    @FXML
    public Label inputFileLabel;
    @FXML
    public Button compileButton;
    @FXML
    public TextField inputFileField;

    private String fulltext;
    private String errortext;

    @FXML
    private void initialize() {
        // initialize and save/edit data to FXML objects
    }

    @FXML
    private void readTextFile() {
        String filepath = inputFileField.getText();
        CharStream charStream;
        try {
            charStream = CharStreams.fromPath(Paths.get(filepath));
            fulltext = charStream.toString();
            inputContentsLabel.setText(fulltext);
            PseudocodeLexer lexer = new PseudocodeLexer(CharStreams.fromFileName(filepath));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PseudocodeParser parser = new PseudocodeParser(tokens);
            lexer.removeErrorListeners();
            parser.removeErrorListeners();
            lexer.addErrorListener(PseudocodeErrorListener.INSTANCE);
            parser.addErrorListener(PseudocodeErrorListener.INSTANCE);
            parser.setErrorHandler(new PseudocodeErrorStrategy());
            ParseTree tree = parser.init();
            TreeViewer viewr = new TreeViewer(Arrays.asList(
                    parser.getRuleNames()), tree);
            viewr.open();
            System.out.println(tree.toStringTree(parser));

            StringBuilder sb = new StringBuilder();
            ArrayList<String> errorList = PseudocodeErrorListener.INSTANCE.errorList;
            for (String error: errorList) {
                sb.append(error);
                sb.append("\n");
            }
            errortext = sb.toString();

            consoleLabel.setText(errortext);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
