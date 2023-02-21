package ba.unsa.etf.rpr.dao;


import ba.unsa.etf.rpr.domain.Teacher;
import ba.unsa.etf.rpr.exceptions.HappyCourseException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.TreeMap;

/**
 * This class implements all methods from Dao<T> and also methods from TeacherDao, extends AbstractDao
 */
public class TeacherDaoSQLImpl extends AbstractDao<Teacher> implements TeacherDao {

    /**
     * Constructor for table
     */
    public TeacherDaoSQLImpl() {
        super("Teacher");
    }

    /**
     * Method for getting Teacher based on id
     * @param id
     * @return
     * @throws HappyCourseException
     */
    @Override
    public Teacher getById(int id) throws HappyCourseException {
        String query = "SELECT * FROM Teacher WHERE id = ?";
        try {
            PreparedStatement statement = getConnection().prepareStatement(query);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Teacher result = row2object(rs);
                rs.close();
                return result;
            } else {
                throw new HappyCourseException("Teacher does not exist!");
            }
        } catch (SQLException e) {
            throw new HappyCourseException(e.getMessage(), e);
        }
    }

    /**
     * Method for getting Teacher by username
     * @param user_name
     * @return
     * @throws HappyCourseException
     */
    @Override
    public Teacher getByUsername(String user_name) throws HappyCourseException {
        String query = "SELECT * FROM Teacher WHERE username = ?";

        try {
            PreparedStatement statement = getConnection().prepareStatement(query);
            statement.setString(1, user_name);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
               Teacher result = row2object(rs);
                rs.close();
                return result;
            } else {
                throw new HappyCourseException("Teacher does not exist!");
            }
        } catch (SQLException e) {
            throw new HappyCourseException(e.getMessage(), e);
        }
    }

    /**
     * Method for mapping ResultSet into Object
     * @param rs
     * @return a Bean object for specific table
     * @throws HappyCourseException if there is no requested data
     * @throws SQLException in case if there is error with db
     */
    @Override
    public Teacher row2object(ResultSet rs) throws HappyCourseException, SQLException {

        try {
            Teacher teacher = new Teacher();
            teacher.setId(rs.getInt("id"));
            teacher.setFirst_name(rs.getString("first_name"));
            teacher.setLast_name(rs.getString("last_name"));
            teacher.setEmail(rs.getString("email"));
            teacher.setUsername(rs.getString("user_name"));
            teacher.setPassword(rs.getString("password"));
            return teacher;
        } catch(SQLException e) {
            throw new HappyCourseException(e.getMessage());
        }
    }

    /**
     * Method for mapping Object into Map
     * @param object - a bean object for specific table
     * @return key, value sorted map of object
     */
    @Override
    public Map<String, Object> object2row(Teacher object) {
        Map<String, Object> item = new TreeMap<String, Object>();
        item.put("id", object.getId());
        item.put("first_name", object.getFirst_name());
        item.put("last_name", object.getLast_name());
        item.put("email", object.getEmail());
        item.put("user_name", object.getUsername());
        item.put("password", object.getPassword());
        return item;
    }
}