package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.domain.Course;
import ba.unsa.etf.rpr.domain.Student;
import ba.unsa.etf.rpr.domain.Teacher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javafx.scene.control.ListView;
import java.io.IOException;
import java.util.List;

import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;

public class TeacherController {
    public ListView<Student> listView;
    public ListView<Course> Viewlist;

    public Button logoutBtn;
    private Teacher teacher=new Teacher();
    public Student student=new Student();
    public TeacherController() {
        teacher = new Teacher();
    }

    public TeacherController(Teacher teacher) {
        this.teacher = teacher; }

    public void initialize() {
        try {
             listView.setItems(FXCollections.observableArrayList(DaoFactory.studentDao().allStudents()));
Viewlist.setItems(FXCollections.observableArrayList(DaoFactory.courseDao().getAll()));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }




        public void showProfile(ActionEvent event) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/profile.fxml"));
                loader.setController(new ProfileController(teacher));
                Parent root = loader.load();
                Stage stage = new Stage();
                stage.setTitle("My Profile");
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
            //StudentController studentController = loader.getController();
            // listView.refresh();
            // criminalController.setList(listView);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        public void showAddCourses(ActionEvent event) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/addCourse.fxml"));

                loader.setController(new CourseController(listView.getSelectionModel().getSelectedItem()));
                Parent root = loader.load();
                Stage stage = new Stage();
                stage.setTitle("Courses");
                stage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
                stage.setResizable(false);
                stage.show();
               // StudentController studentController = loader.getController();
                // listView.refresh();
                // criminalController.setList(listView);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    public void showLogout(ActionEvent event) {
        Stage stage = (Stage) logoutBtn.getScene().getWindow();
        stage.close();
    }


}
