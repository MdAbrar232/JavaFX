package fxpackage5;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.util.Objects;

public class ImageController {

    @FXML
    ImageView myImageView;

    @FXML
    Button myButton1;

    Image myImage = new Image((getClass().getResourceAsStream("Shrek2.jpg")));

    public void displayImage(){
        myImageView.setImage(myImage);
    }
}
