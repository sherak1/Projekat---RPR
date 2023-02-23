package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.CourseManager;
import ba.unsa.etf.rpr.business.StudentManager;
import ba.unsa.etf.rpr.domain.Course;
import ba.unsa.etf.rpr.exceptions.HappyCourseException;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CourseController {
    private Course course;
    private CourseManager courseMan = new CourseManager();

    public TextField courseNameFld;
    public TextField lectureNumberFld;
    public DatePicker date1Fld;
    public TextField exerciseNumberFld;
    public DatePicker date2Fld;
    public Button addCourseBtn;
    public  CourseController(Course course) {
        this.course = course;
    }


    public CourseController() {
        course = new Course();
    }
    public void addNewCourse(ActionEvent event) {
        try {
            Course course = new Course();
            course.setId(1);
            course.setCourse(course);
            course.setCourse_name(courseNameFld.getText());
            course.setLecture_number(lectureNumberFld.getText());
            course.setLecture_date(date1Fld.getValue());
            course.setExercise_number(exerciseNumberFld.getText());
            course.setExercise_date(date2Fld.getValue());
            courseMan.add(course);
            Stage stage = (Stage) addCourseBtn.getScene().getWindow();
            stage.close();
        } catch (HappyCourseException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }
    }

}


