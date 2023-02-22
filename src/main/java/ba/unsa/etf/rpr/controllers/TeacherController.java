package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.domain.Teacher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;

public class TeacherController {

    private Teacher teacher=new Teacher();
    public TeacherController() {
        teacher = new Teacher();
    }

    public TeacherController(Teacher teacher) {
        this.teacher = teacher; }

        public void showProfile(ActionEvent event) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/profile.fxml"));
                loader.setController(new ProfileController(teacher));
                Parent root = loader.load();
                Stage stage = new Stage();
                stage.setTitle("Students");
                stage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
                stage.setResizable(false);
                stage.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    public void showAddStudents(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/addStudent.fxml"));
            loader.setController(new StudentController());
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Students");
            stage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
            stage.setResizable(false);
            stage.show();
            StudentController studentController = loader.getController();
           // listView.refresh();
           // criminalController.setList(listView);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
