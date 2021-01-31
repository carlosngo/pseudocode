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
import manager.NotificationManager;
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
    private NotificationManager manager;
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
    @FXML
    public ScrollPane ioScrollPane;
    @FXML
    public Label ioLabel;
    @FXML
    public TextField tfUserInput;
    @FXML
    public Button btnUserOk;
    @FXML
    public Button btnUserCancel;

    private String fulltext;
    private String errortext;

    public void setManager(NotificationManager manager){
        this.manager = manager;
    }

    @FXML
    private void initialize() {
        // initialize and save/edit data to FXML objects
        setIOHeader("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        ioLabel.setWrapText(true);
        /*
        * By default IO console should be hidden
        * hideIOConsole() is commented out for testing purposes.
        * */
        // hideIOConsole();
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
            ArrayList<String> errorList = pseudocodeErrorListener.getErrorList();
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
        ArrayList<String> errorList = pseudocodeErrorListener.getErrorList();
        for (String error: errorList) {
            sb.append(error);
            sb.append("\n");
        }
        errortext = sb.toString();

        consoleLabel.setText(errortext);
    }

    private void setIOHeader (String text) {
        ioLabel.setText(text);
    }

    private void resetIOLabel () {
        ioLabel.setText("");
    }

    private void printToIOLabel (String text) {
        ioLabel.setText(ioLabel.getText() + text);
    }

    public void showIOConsole () {
        GridPane.setColumnIndex(errorsScrollPane, 1);
        GridPane.setRowIndex(errorsScrollPane, 2);
        GridPane.setColumnSpan(errorsScrollPane, 1);
        GridPane.setRowSpan(errorsScrollPane, 2);

        bodyPane.getChildren().add(ioScrollPane);
        GridPane.setColumnIndex(ioScrollPane, 1);
        GridPane.setRowIndex(ioScrollPane, 0);
        GridPane.setColumnSpan(ioScrollPane, 1);
        GridPane.setRowSpan(ioScrollPane, 2);
        ioScrollPane.setVisible(true);
    }

    public void hideIOConsole () {
        ioScrollPane.setVisible(false);

        bodyPane.getChildren().remove(ioScrollPane);

        GridPane.setColumnIndex(errorsScrollPane, 1);
        GridPane.setRowIndex(errorsScrollPane, 0);
        GridPane.setColumnSpan(errorsScrollPane, 1);
        GridPane.setRowSpan(errorsScrollPane, 4);
    }

    public void cancelInput () {
        // linked to cancel button
    }

    public void submitInput () {
        // linked to "OK" button
        String input = tfUserInput.getText();
    }
}
