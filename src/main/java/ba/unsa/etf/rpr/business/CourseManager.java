package ba.unsa.etf.rpr.business;

import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.domain.Student;
import ba.unsa.etf.rpr.domain.Course;
import ba.unsa.etf.rpr.exceptions.HappyCourseException;
import javafx.util.converter.LocalDateStringConverter;

import java.time.LocalDate;
import java.time.Period;


public class CourseManager {


    public static Course add(Course course) throws HappyCourseException {
        if (course.getLecture_date().isAfter(LocalDate.now())) {
            throw new HappyCourseException("Date is not correct");
        }
        if (course.getExercise_date().isAfter(LocalDate.now())) {
            throw new HappyCourseException("Date is not correct");
        }

        try {
            return DaoFactory.courseDao().add(course);
        } catch (HappyCourseException e) {
            throw e;
        }
    }
}

