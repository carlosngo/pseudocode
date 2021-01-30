package gui;

import gen.PseudocodeErrorListener;
import gen.PseudocodeErrorStrategy;
import gen.PseudocodeLexer;
import gen.PseudocodeParser;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
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
    public TextArea inputContents;
//    public Label inputContentsLabel;
    @FXML
    public Label consoleLabel;
    @FXML
    public Label inputFileLabel;
    @FXML
    public Button compileButton;
    @FXML
    public Button selectFileButton;
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
            inputContents.setText(fulltext);
            PseudocodeLexer lexer = new PseudocodeLexer(CharStreams.fromFileName(filepath));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PseudocodeParser parser = new PseudocodeParser(tokens);
            PseudocodeErrorListener pseudocodeErrorListener = new PseudocodeErrorListener();
            lexer.removeErrorListeners();
            parser.removeErrorListeners();
            lexer.addErrorListener(pseudocodeErrorListener);
            parser.addErrorListener(pseudocodeErrorListener);
            parser.setErrorHandler(new PseudocodeErrorStrategy());
            ParseTree tree = parser.init();
            TreeViewer viewr = new TreeViewer(Arrays.asList(
                    parser.getRuleNames()), tree);
            viewr.open();
            System.out.println(tree.toStringTree(parser));

            StringBuilder sb = new StringBuilder();
            ArrayList<String> errorList = pseudocodeErrorListener.errorList;
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

    public void selectFile(MouseEvent mouseEvent) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text files", "*.txt"));
        File selectedFile = fc.showOpenDialog(null);

        if(selectedFile!=null){
            inputFileField.setText(selectedFile.getAbsolutePath());
        } else {
            consoleLabel.setText("File Cannot be NULL");
        }
    }

    public void compileText(MouseEvent mouseEvent) {
       String inputs = inputContents.getText();

//        CharStreams.fromString(inputs);
        PseudocodeLexer lexer = new PseudocodeLexer(CharStreams.fromString(inputs));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PseudocodeParser parser = new PseudocodeParser(tokens);
        PseudocodeErrorListener pseudocodeErrorListener = new PseudocodeErrorListener();
        lexer.removeErrorListeners();
        parser.removeErrorListeners();
        lexer.addErrorListener(pseudocodeErrorListener);
        parser.addErrorListener(pseudocodeErrorListener);
        parser.setErrorHandler(new PseudocodeErrorStrategy());
        ParseTree tree = parser.init();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()), tree);
        viewr.open();
        System.out.println(tree.toStringTree(parser));

        StringBuilder sb = new StringBuilder();
        ArrayList<String> errorList = pseudocodeErrorListener.errorList;
        for (String error: errorList) {
            sb.append(error);
            sb.append("\n");
        }
        errortext = sb.toString();

        consoleLabel.setText(errortext);
    }
}
