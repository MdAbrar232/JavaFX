package fxpackage2;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import static javafx.application.Application.launch;

public class TestSceneBuilder {

    @FXML
    private Circle myCircle;
    private double x;
    private double y;


    public void up(ActionEvent event) {
        myCircle.setCenterY(y -= 10);
    }
    public void down(ActionEvent event) {
        myCircle.setCenterY(y += 10);
    }

    public void left(ActionEvent event) {
        myCircle.setCenterX(x -= 10);
    }
    public void right(ActionEvent event) {
        myCircle.setCenterX(x += 10);
    }
}
