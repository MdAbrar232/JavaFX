package fxpackage2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestSceneBuilderMain extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("TestSceneBuilderMain.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
