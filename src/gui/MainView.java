package gui;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainView {

    /*
    Put gui objects here
     */

    public AnchorPane mainPane;
    public GridPane bodyPane;
    public ScrollPane inputScrollPane;
    public ScrollPane errorsScrollPane;
    public Pane inputFilePane;
    public Pane inputPane1;
    public Pane errorsPane1;
    public Label inputContentsLabel;
    public Label consoleLabel;
    public Label inputFileLabel;
    public Button compileButton;
    public TextField inputFileField;

    @FXML
    public void initialize() {
        // initialize and save/edit data to FXML objects
    }
}
