package fxpackage4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import javax.swing.*;

public class TestControllerCom extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

        //method to created to call logout method below
        primaryStage.setOnCloseRequest(event -> {
            event.consume();  //b|c of this line, the app will not close if you pressed cancel
            logout(primaryStage);
        });

    }

//    Following method created so that it would log out -
//  -  if you pressed the cross button
    public void logout(Stage stage) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout!");
        alert.setContentText("Do you want to save before exiting?");

        if(alert.showAndWait().get() == ButtonType.OK) {
            //stage = (Stage) scenePane.getScene().getWindow();
            System.out.println("Logged out successfully");
            stage.close();
        }
    }
}
