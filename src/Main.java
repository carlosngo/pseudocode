import gui.MainView;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import gen.*;

import java.io.FileInputStream;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("gui/MainView.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 400, 600));
        primaryStage.show();
        primaryStage.setResizable(false);
    }

    public static void main(String[] args) throws Exception {
        PseudocodeLexer lexer = new PseudocodeLexer(CharStreams.fromFileName("res/in.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PseudocodeParser parser = new PseudocodeParser(tokens);
        ParseTree tree = parser.init();
        System.out.println(tree.toStringTree(parser));

        launch(args);
    }
}