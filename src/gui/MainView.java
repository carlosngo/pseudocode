package gui;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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

    @FXML
    private void initialize() {
        // initialize and save/edit data to FXML objects
    }

    @FXML
    private void readTextFile() {
        String filepath = inputFileField.getText();
        try(BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            fulltext = sb.toString();
            inputContentsLabel.setText(fulltext);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void checkCode() {
        // where you put the
    }

    private void createErrorText() {
        //
    }
}
