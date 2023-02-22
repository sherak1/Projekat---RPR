package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.TeacherManager;
import ba.unsa.etf.rpr.dao.DaoFactory;
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


public class LoginController {


    public Button loginButton;
    public TextField usernameField;
    public PasswordField passwordField;


    public void showTeacherWindow(ActionEvent event) {

        try {
            Teacher teacher = new Teacher();
            teacher.setUsername(usernameField.getText());
            teacher.setPassword(passwordField.getText());
            (new TeacherManager()).loginSearch(teacher.getUsername(), teacher.getPassword());
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/employee.fxml"));
           Teacher teacher1 = DaoFactory.teacherDao().getByUsername(teacher.getUsername());
            loader.setController(new TeacherController(teacher1));

            Stage s = (Stage) loginButton.getScene().getWindow();
            s.close();
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Teacher ");
            stage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }

    }
}