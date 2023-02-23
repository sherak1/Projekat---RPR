package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.CourseManager;
import ba.unsa.etf.rpr.business.StudentManager;
import ba.unsa.etf.rpr.domain.Course;
import ba.unsa.etf.rpr.domain.Student;
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
    private Student student;
    public TextField lectureNumberFld;
    public TextField courseFld;
    public DatePicker date1Fld;
    public TextField exerciseNumberFld;
    public DatePicker date2Fld;
    public Button addCourseBtn;

    public CourseController(Student student){
        this.student=student;
    }



    public void addCourse(ActionEvent event) {
        try {
            Course course = new Course();
            course.setId(1);
            course.setStudent(student);
          //  course.setCourse(coursee);
            course.setCourse_name(courseFld.getText());
            course.setLecture_number(lectureNumberFld.getText());
            course.setLecture_date(date1Fld.getValue());
            course.setExercise_number(exerciseNumberFld.getText());
            course.setExercise_date(date2Fld.getValue());
           // courseMan.add(course);
            courseMan.add(course);
            Stage stage1 = (Stage) addCourseBtn.getScene().getWindow();
            stage1.close();


        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }
    }

}


