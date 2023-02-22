package ba.unsa.etf.rpr.controllers;


import ba.unsa.etf.rpr.domain.Teacher;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class ProfileController {

 Teacher teacher = new Teacher();
    public Label welcomeLabel;
    public TextField firstNameFld;
    public TextField lastNameFld;
    public TextField emailFld;
    public TextField usernameFld;
    public PasswordField passwordFld;

    public Button updateBtn;
    public ProfileController() {
        teacher = new Teacher ();
    }
    public ProfileController(Teacher teacher) {
        this.teacher = teacher;
    }


    public void initialize() {
        if (teacher!= null) {
            welcomeLabel.setText("Welcome, " + teacher.getFirst_name());
            firstNameFld.setText(teacher.getFirst_name());
            lastNameFld.setText(teacher.getLast_name());
            emailFld.setText(teacher.getEmail());
            usernameFld.setText(teacher.getUsername());
            passwordFld.setText(teacher.getPassword());
        }
    }
}