import gui.MainView;
import manager.NotificationManager;
import manager.ProgramManager;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.util.Arrays;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        NotificationManager notificationManager = new NotificationManager();
        ProgramManager programManager = new ProgramManager(notificationManager);

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                        "gui/MainView.fxml"
                )
        );
        primaryStage.setTitle("Pseudocode Interpreter");
        primaryStage.setScene(
                new Scene(loader.load())
        );
        MainView controller = loader.getController();
        controller.setManager(notificationManager);

        primaryStage.show();
        primaryStage.setResizable(true);
    }

    public static void main(String[] args) {
        launch(args);
    }
}