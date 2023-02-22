package ba.unsa.etf.rpr.business;

import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.domain.Student;
import ba.unsa.etf.rpr.exceptions.HappyCourseException;

public class StudentManager {


    public static Student add(Student student) throws HappyCourseException {


        try {
            return DaoFactory.studentDao().add(student);
        } catch (HappyCourseException e) {
            throw e;
        }
    }
}
