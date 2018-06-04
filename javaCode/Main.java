package javaCode;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/start.fxml"));
        primaryStage.setTitle("Anonymous Launcher");
        primaryStage.setMaxHeight(390);
        primaryStage.setMaxWidth(480);
        primaryStage.setMinHeight(390);
        primaryStage.setMinWidth(480);
        primaryStage.setScene(new Scene(root, 480, 390));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
