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

   /* @Override
    public void start(Stage primaryStage) throws Exception {
        NotificationManager notificationManager = new NotificationManager();

        Parent root =  FXMLLoader.load(getClass().getResource("gui/MainView.fxml"));
//        FXMLLoader loader = FXMLLoader.load(getClass().getResource("gui/MainView.fxml"));
//        Parent root = loader.load();
//        MainView controller = loader.getController();
//        controller.setManager(notificationManager);

        primaryStage.setTitle("Pseudocode Interpreter");
        primaryStage.setScene(new Scene(root, 1000, 600));
        primaryStage.show();
        primaryStage.setResizable(true);
    }*/

    public static void main(String[] args) {
//        CPP14Lexer lexer = new CPP14Lexer(CharStreams.fromFileName("res/in.txt"));
//        PseudocodeLexer lexer = new PseudocodeLexer(CharStreams.fromFileName("res/in.txt"));
//        System.out.println(CharStreams.fromFileName("res/in.txt"));
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        PseudocodeParser parser = new PseudocodeParser(tokens);
//        lexer.removeErrorListeners();
//        parser.removeErrorListeners();
//        lexer.addErrorListener(PseudocodeErrorListener.INSTANCE);
//        parser.addErrorListener(PseudocodeErrorListener.INSTANCE);
//        parser.setErrorHandler(new PseudocodeErrorStrategy());
//        ParseTree tree = parser.init();
//        TreeViewer viewr = new TreeViewer(Arrays.asList(
//                parser.getRuleNames()), tree);
//        viewr.open();
//        System.out.println(tree.toStringTree(parser));

//        NotificationManager notificationManager = new NotificationManager();
//        ProgramManager programManager = new ProgramManager(notificationManager);

//        MainView controller  = new MainView();

        launch(args);
    }
}