package gui;

import antlr.PseudocodeErrorListener;
import antlr.PseudocodeErrorStrategy;
import antlr.PseudocodeLexer;
import antlr.PseudocodeParser;
import javafx.application.Platform;
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
import notification.event.*;
import notification.listener.CompileListener;
import notification.listener.ExecuteListener;
import notification.listener.PrintListener;
import notification.listener.ScanListener;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class MainView implements PrintListener, ScanListener, ExecuteListener, CompileListener {
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
    @FXML
    public Button compileTextButton;

    private String fulltext;
    private String errortext;
    private ArrayList<String> errorList;

    public void setManager(NotificationManager manager){
        this.manager = manager;
        manager.addListener(this);
    }

    @FXML
    private void initialize() {
        // initialize and save/edit data to FXML objects
//        setIOHeader("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        ioLabel.setWrapText(true);
        /*
        * By default IO console should be hidden
        * hideIOConsole() is commented out for testing purposes.
        * */
//         hideIOConsole();
    }

    @FXML
    private void readTextFile() {
        String filepath = inputFileField.getText();
        CharStream charStream;
        try {
            charStream = CharStreams.fromPath(Paths.get(filepath));
            fulltext = charStream.toString();
            compile(compileButton, fulltext);
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
        compile(compileTextButton, inputContents.getText());
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

    private void showIOConsole () {
        GridPane.setColumnIndex(errorsScrollPane, 1);
        GridPane.setRowIndex(errorsScrollPane, 2);
        GridPane.setColumnSpan(errorsScrollPane, 1);
        GridPane.setRowSpan(errorsScrollPane, 2);

        if (!bodyPane.getChildren().contains(ioScrollPane)) {
            bodyPane.getChildren().add(ioScrollPane);
            GridPane.setColumnIndex(ioScrollPane, 1);
            GridPane.setRowIndex(ioScrollPane, 0);
            GridPane.setColumnSpan(ioScrollPane, 1);
            GridPane.setRowSpan(ioScrollPane, 2);
        }
        ioScrollPane.setVisible(true);
    }

    private void hideIOConsole () {
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

//        Platform.runLater(() -> printToIOLabel(e.getInput() + "\n"));
        printToIOLabel(tfUserInput.getText() + "\n");
        ScanEndEvent eInput = new ScanEndEvent(btnUserOk, tfUserInput.getText());
        tfUserInput.setText("");
        manager.notifyScanListeners(eInput);
    }


    @Override
    public void onPrint(PrintEvent e) {
        System.out.println(e.getMessage());
        Platform.runLater(() -> printToIOLabel(e.getMessage() + "\n"));
    }

    @Override
    public void onScanStart(ScanStartEvent e) {
//        showIOConsole();
        Platform.runLater(() -> printToIOLabel(e.getMessage() + " "));
    }

    @Override
    public void onScanEnd(ScanEndEvent e) {
        // make frontend do something after scanning
    }

    @Override
    public void onExecuteStart(ExecuteStartEvent e) {
        //
        setIOHeader("");
        consoleLabel.setText("");
    }

    @Override
    public void onExecuteSuccess(ExecuteSuccessEvent e) {
        String currText = consoleLabel.getText();

        StringBuilder sb = new StringBuilder();
        sb.append(currText);
        sb.append("\n");
        sb.append("------------------------------");
        sb.append("\n\n\n");
        sb.append("EXECUTE HAS FINISHED SUCCESSFULLY");
        sb.append("\n\n\n");
        sb.append("------------------------------");
        sb.append("\n");

        errortext = sb.toString();
        Platform.runLater(() -> consoleLabel.setText(errortext));

    }

    @Override
    public void onExecuteError(ExecuteErrorEvent e) {
        String currText = consoleLabel.getText();

        StringBuilder sb = new StringBuilder();
        sb.append(currText);
        sb.append("\n");
        sb.append("------------------------------");
        sb.append("\n\n\n");
        sb.append("EXECUTE FAILED");
        sb.append("\n\n\n");
        sb.append("------------------------------");
        sb.append("\n");

        errortext = sb.toString();
        Platform.runLater(() -> consoleLabel.setText(errortext));
    }


    public void compile (Object source, String srcCode) {
        // source is the button thats clicked
        CompileStartEvent compileStartEvent = new CompileStartEvent(source, srcCode);
        manager.notifyCompileListeners(compileStartEvent);

        showIOConsole();
    }


    @Override
    public void onCompileStart(CompileStartEvent e) {
        // probably some frontend stuff
    }

    @Override
    public void onCompileSuccess(CompileSuccessEvent e) {
        String currText = consoleLabel.getText();

        StringBuilder sb = new StringBuilder();
        sb.append(currText);
        sb.append("\n");
        sb.append("------------------------------");
        sb.append("\n\n\n");
        sb.append("COMPILED SUCCESSFULLY");
        sb.append("\n\n\n");
        sb.append("------------------------------");
        sb.append("\n");

        errortext = sb.toString();

        consoleLabel.setText(errortext);
        ExecuteStartEvent startEvent = new ExecuteStartEvent(e);
        manager.notifyExecuteListeners(startEvent);
    }

    @Override
    public void onCompileError(CompileErrorEvent e) {
        StringBuilder sb = new StringBuilder();
        for (String error: e.getErrorList()) {
            sb.append(error);
            sb.append("\n");
        }
        errortext = sb.toString();
        consoleLabel.setText(errortext);
    }
}
