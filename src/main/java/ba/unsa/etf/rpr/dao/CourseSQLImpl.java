package ba.unsa.etf.rpr.dao;
import ba.unsa.etf.rpr.domain.Course;
import ba.unsa.etf.rpr.exceptions.HappyCourseException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Implements all methods from Dao<T> and also methods from COurseDao, extends AbstractDao
 */
public class CourseSQLImpl extends AbstractDao<Course> implements CourseDao {
    /**
     * Constructor for specific table
     */
    public CourseSQLImpl() {
        super("Course");
    }

    /**
     * Method for getting course by id
     * @param id - record id
     * @return
     * @throws HappyCourseException
     */
    public Course getById(int id) throws HappyCourseException {
        return null;
    }

    /**
     * Method for getting list of criminal records based on id
     * @param id
     * @return
     * @throws HappyCourseException
     */
    public List<Course> getByIdNew(int id) throws HappyCourseException {
        String query = "SELECT * FROM CriminalRecord WHERE criminalId = ?";

        List<Course> allCourses = new ArrayList<>();
        try {
            PreparedStatement statement = getConnection().prepareStatement(query);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Course result = row2object(rs);
                allCourses.add(result);
            }
        } catch (SQLException e) {
            throw new HappyCourseException(e.getMessage(), e);
        }
        return allCourses;
    }

    /**
     * Method for getting course based on exercise_number
     * @param exercise_number
     * @return
     * @throws HappyCourseException
     */
    public Course getByExercise_number(String exercise_number) throws HappyCourseException{
        String query = "SELECT * FROM Course WHERE code = ?";

        try {
            PreparedStatement statement = getConnection().prepareStatement(query);
            statement.setString(1, exercise_number);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Course result = row2object(rs);
                rs.close();
                return result;
            } else {
                throw new HappyCourseException("Course not found!");
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
    public Course row2object(ResultSet rs) throws HappyCourseException {
        Course course = new Course();
        try {
            course.setId(rs.getInt("id"));
            course.setCourse_name(rs.getString("course_name"));
            course.setLecture_number(rs.getString("lecture_number"));
            course.setLecture_date(rs.getDate("lecture_date").toLocalDate());
            course.setExercise_number(rs.getString("exercise_number"));
            course.setExercise_date(rs.getDate("exercise_date").toLocalDate());

            course.setStudent(DaoFactory.studentDao().getById(rs.getInt("studentId")));
            return course;
        } catch (SQLException e) {
            throw new HappyCourseException(e.getMessage());
        }
    }


    /**
     * Method for mapping Object into Map
     * @param object - a bean object for specific table
     * @return key, value sorted map of object
     */
    @Override
    public Map<String, Object> object2row(Course object) {
        Map<String, Object> item = new TreeMap<String, Object>();

        item.put("id", object.getId());
        item.put("course_name", object.getCourse_name());
        item.put("lecture_number", object.getLecture_number());
        item.put("lecture_date", object.getLecture_date());
        item.put("exercise_number", object.getExercise_number());
        item.put("exercise_date", object.getExercise_date());
        item.put("studentId", object.getStudent().getId());
        return item;
    }

    /**
     * Method for getting all criminal Records based on criminalId
     * @param studentId
     * @return
     * @throws HappyCourseException
     */
    public List<Course> allCourses (int studentId) throws HappyCourseException {
        List<Course> allCourses = new ArrayList<>();
        String query = "SELECT * FROM Courses WHERE studentId = ?";
        try {
            PreparedStatement statement = getConnection().prepareStatement(query);
            statement.setInt(1, studentId);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
               Course result = row2object(rs);
                allCourses.add(result);
            }
        } catch (Exception e) {
            throw new HappyCourseException(e.getMessage(), e);
        }

        return allCourses;

    }
}