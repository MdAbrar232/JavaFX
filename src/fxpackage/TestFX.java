package fxpackage;

import javafx.application.Application;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
//import javafx.scene.text.Font;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;


public class TestFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root,500,500, Color.MAROON);
        Image icon = new Image("fida.jpg");
        Text text = new Text("Hello nigga");
        Line line = new Line();
        Image image = new Image("fida.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setX(120);
        imageView.setY(100);
        imageView.setFitWidth(250);
        imageView.setFitHeight(250);
        line.setStartX(50);
        line.setStartY(50);
        line.setEndX(50);
        line.setEndY(400);
        line.setStroke(Color.WHITE);
        text.setX(120);
        text.setY(430);
        text.setFont(Font.font("Arial", FontWeight.BOLD, 50));
        text.setFill(Color.WHITE);
        stage.getIcons().add(icon);
        //stage.setHeight(500);
        //stage.setWidth(500);
        stage.setResizable(false);
        stage.setFullScreen(false);

        root.getChildren().add(text);
        //root.getChildren().add(line);
        root.getChildren().add(imageView);
        stage.setTitle("Fida");
        stage.setScene(scene);
        stage.show();
    }

}
