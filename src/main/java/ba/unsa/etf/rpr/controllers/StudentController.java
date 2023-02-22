package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.StudentManager;
import ba.unsa.etf.rpr.domain.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;


public class StudentController {

    public TextField firstNameFld;
    public TextField lastNameFld;
    public TextField  indexNumberFld;
    public TextField addressFld;
    public Button addBtn;
    private StudentManager studentManager = new StudentManager();




    public void addStudent(ActionEvent event) {
        try {
            Student student= new Student();
            student.setFirst_name(firstNameFld.getText());
            student.setLast_name(lastNameFld.getText());
            student.setIndex_number(indexNumberFld.getText());
            student.setAddress(addressFld.getText());


            Stage stage1 = (Stage) addBtn.getScene().getWindow();
            stage1.close();

           studentManager.add(student);
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/addStudent.fxml"));
            loader.setController(new StudentController());
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
            stage.setResizable(false);
            stage.show();
           // listView.refresh();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }
    }
}