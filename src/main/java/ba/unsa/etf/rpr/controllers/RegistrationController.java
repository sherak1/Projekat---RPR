package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.TeacherManager;
import ba.unsa.etf.rpr.domain.Teacher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;


public class RegistrationController {


    public TextField firstNameField;
    public TextField lastNameField;
    public TextField emailField;
    public TextField usernameField;
    public PasswordField passwordField;
    public PasswordField confrimField;
    public Button registerButton;

    private TeacherManager teacherManager = new TeacherManager();


    public void registration(ActionEvent event) {
        try {
            Teacher teacher = new Teacher();
            teacher.setFirst_name(firstNameField.getText());
            teacher.setLast_name(lastNameField.getText());
            teacher.setEmail(emailField.getText());
            teacher.setUsername(usernameField.getText());
            teacher.setPassword(passwordField.getText());
            teacherManager.add(teacher, confrimField.getText());
            Stage stage = (Stage) registerButton.getScene().getWindow();
            stage.close();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/login.fxml"));
            loader.setController(new LoginController());
            Parent root = loader.load();
            stage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }
    }
}