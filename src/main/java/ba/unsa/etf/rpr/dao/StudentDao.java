package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Student;
import ba.unsa.etf.rpr.domain.Course;
import ba.unsa.etf.rpr.exceptions.HappyCourseException;

import java.util.List;

/**
 * Interface that extends Dao<T> and also has methods for StudentDao
 */
public interface StudentDao extends Dao<Student> {

    /**
     * Method that find all students
     * @return list of all students
     * @throws HappyCourseException
     */
    public List<Student> allStudents() throws HappyCourseException;

    /**
     * Method that find all students based on index_number
     * @param index_number
     * @return
     * @throws HappyCourseException
     */
    public Student getByIndex_number(String index_number) throws HappyCourseException;
}