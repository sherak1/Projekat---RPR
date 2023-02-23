package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.domain.Course;
import javafx.event.ActionEvent;

public class CourseController {
    public void addNewRecord(ActionEvent event) {
        try {
            Course course = new Course();
            course.setId(1);
            course.setCourse(course);
            course.setPlace(placeFld.getText());
            course.setDate(dateFld.getValue());
            course.setCode(codeFld.getText());
            course.setDescription(descriptionFld.getText());
            criminalRecordMan.add(course);
            Stage stage = (Stage) addRecordBtn.getScene().getWindow();
            stage.close();
        } catch (CriminalRecordsException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }
    }

}
