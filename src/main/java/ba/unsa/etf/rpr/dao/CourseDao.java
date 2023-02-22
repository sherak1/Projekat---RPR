package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Course;
import ba.unsa.etf.rpr.exceptions.HappyCourseException;

import java.util.List;

/**
 * Interface that extends Dao<T> and also has methods only for Course Dao
 */
public interface CourseDao extends Dao<Course> {

    /**
     * Method for getting all courses based on student id
     * @param id
     * @return list of all courses records with specified id
     * @throws HappyCourseException
     */
    public List<Course> getByIdNew(int id) throws HappyCourseException;

    public Course getByExercise_number(String exercise_number) throws HappyCourseException;
}