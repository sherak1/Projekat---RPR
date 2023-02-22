package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Student;
import ba.unsa.etf.rpr.exceptions.HappyCourseException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class StudentDaoSQLImpl extends AbstractDao<Student> implements StudentDao {
    /**
     * Constructor for table, calls parent class
     */
    public StudentDaoSQLImpl() {
        super("Student");
    }

    /**
     * Method that getss student based on id
     * @param id - primary key
     * @return
     * @throws HappyCourseException
     */
    @Override
    public Student getById(int id) throws HappyCourseException {
        String query = "SELECT * FROM Student WHERE id = ?";
        try {
            PreparedStatement statement = getConnection().prepareStatement(query);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Student result = row2object(rs);
                rs.close();
                return result;
            } else {
                throw new HappyCourseException("Student does not exist!");
            }
        } catch (SQLException e) {
            throw new HappyCourseException(e.getMessage(), e);
        }
    }

    /**
     * Method for getting criminal based on jmbg
     * @param index_number
     * @return
     * @throws HappyCourseException
     */
    public Student getByIndex_name(String index_number) throws HappyCourseException {
        String query = "SELECT * FROM Student WHERE index_number = ?";

        try {
            PreparedStatement statement = getConnection().prepareStatement(query);
            statement.setString(1, index_number);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Student result = row2object(rs);
                rs.close();
                return result;
            } else {
                throw new HappyCourseException("Student not found!");
            }
        } catch (SQLException e) {
            throw new HappyCourseException(e.getMessage(), e);
        }
    }

    /**
     * Method for mapping ResultSet into Object
     * @param rs
     * @return
     * @throws HappyCourseException if there is no requested data
     * @throws SQLException in case if there is error with db
     */
    @Override
    public Student row2object(ResultSet rs) throws HappyCourseException {
        try {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setFirst_name(rs.getString("first_name"));
            student.setLast_name(rs.getString("last_name"));
            student.setIndex_number(rs.getString("index_number"));
            student.setAddress(rs.getString("address"));
             return student;
        } catch (SQLException e) {
            throw new HappyCourseException(e.getMessage());
        }
    }

    /**
     * Method for mapping Object into Map
     * @param object
     * @return
     */
    @Override
    public Map<String, Object> object2row (Student object) {
        Map<String, Object> item = new TreeMap<>();

        item.put("id", object.getId());
        item.put("first_name", object.getFirst_name());
        item.put("last_name", object.getLast_name());
        item.put("index_number", object.getIndex_number());
        item.put("address", object.getAddress());
         return item;
    }

    /**
     * Method for getting all criminals
     * @return
     * @throws HappyCourseException
     */
    public List<Student> allStudents() throws HappyCourseException {
        String query = "SELECT * FROM Student";
        List<Student> allStudentsList = new ArrayList<>();
        try {
            PreparedStatement statement = getConnection().prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
           Student result = row2object(rs);
                allStudentsList.add(result);
            }


        } catch (Exception e) {
            throw new HappyCourseException(e.getMessage(), e);
        }
        return allStudentsList;
    }

    @Override
    public Student getByIndex_number(String index_number) throws HappyCourseException {
        return null;
    }
}