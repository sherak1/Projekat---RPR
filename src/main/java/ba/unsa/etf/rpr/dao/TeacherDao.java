
package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Teacher;
import ba.unsa.etf.rpr.exceptions.HappyCourseException;

/**
 * Interface that extends Dao<T> and also has methods only for TeacherDao
 */
public interface TeacherDao extends Dao<Teacher> {

    /**
     * Method for getting Employee by username
     * @param user_name
     * @return
     * @throws HappyCourseException
     */
    Teacher getByUsername(String user_name) throws HappyCourseException;
}