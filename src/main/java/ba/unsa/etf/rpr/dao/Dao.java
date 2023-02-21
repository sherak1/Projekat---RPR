
package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.exceptions.HappyCourseException;

import java.util.List;


public interface Dao<T> {

    /**
     * Method for getting entity from database based on id
     * @param id
     * @return
     * @throws HappyCourseException
     */
    T getById(int id) throws HappyCourseException;

    /**
     * Method for saving entity into database
     * @param item - saving to db
     * @return saved item
     * @throws HappyCourseException
     */
    T add(T item) throws HappyCourseException;

    /**
     * Method for getting all entities from database.
     * @return list of entities
     * @throws HappyCourseException
     */
    List<T> getAll() throws HappyCourseException;

    /**
     * Method for delete from database based on id
     * @param id - primary key
     * @throws HappyCourseException
     */
    void delete(int id) throws HappyCourseException;

    /**
     * Updates entity in database based on id
     * @param item - bean to be updated, id must be populated
     * @return updated version of bean
     * @throws HappyCourseException
     */
    T update (T item) throws HappyCourseException;
}