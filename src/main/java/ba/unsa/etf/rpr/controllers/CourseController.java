package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.CourseManager;
import ba.unsa.etf.rpr.business.StudentManager;
import ba.unsa.etf.rpr.domain.Course;
import ba.unsa.etf.rpr.exceptions.HappyCourseException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;

public class CourseController {

    private CourseManager courseMan = new CourseManager();

    public TextField courseNameFld;
    public TextField lectureNumberFld;
    public DatePicker date1Fld;
    public TextField exerciseNumberFld;
    public DatePicker date2Fld;
    public Button addCourseBtn;

    public void addCourse(ActionEvent event) {
        try {
            Course course = new Course();
            course.setId(1);
          //  course.setCourse(coursee);
            course.setCourse_name(courseNameFld.getText());
            course.setLecture_number(lectureNumberFld.getText());
            course.setLecture_date(date1Fld.getValue());
            course.setExercise_number(exerciseNumberFld.getText());
            course.setExercise_date(date2Fld.getValue());
           // courseMan.add(course);
            Stage stage1 = (Stage) addCourseBtn.getScene().getWindow();
            stage1.close();
            courseMan.add(course);
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/addCourse.fxml"));
            loader.setController(new StudentController());
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }
    }

}


