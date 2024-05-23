package fxpackage4;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import java.io.IOException;

public class Scene1Controller {

    @FXML
    TextField nameTextField;
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    Label myLabel;
    @FXML
    TextField passwordTextField;
    @FXML
    TextField ageTextField;

    int age;
    String password;

    public void login(ActionEvent event) throws IOException {

        String username = nameTextField.getText();
        try {
            password = passwordTextField.getText();
            System.out.println(password);
        } catch (Exception e) {
            System.out.println("Enter a valid username");
            myLabel.setText("Enter a valid username");
        }
        try {
            age = Integer.parseInt(ageTextField.getText());
            System.out.println(age);
        } catch (NumberFormatException e) {
            System.out.println("Enter only numbers");
            myLabel.setText("Enter only numbers");
        }

        if(age >= 18) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
            root = loader.load();
            Scene2Controller controller = loader.getController();
            controller.displayName(username);
            //root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else myLabel.setText("Age must be greater than 18");
    }
}
