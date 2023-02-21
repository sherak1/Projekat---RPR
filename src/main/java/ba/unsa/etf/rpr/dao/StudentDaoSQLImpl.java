package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Student;
import ba.unsa.etf.rpr.exceptions.HappyCourseException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class StudentDaoSQLImpl extends AbstractDao<Student> implements StudentDao {


    @Override
    public Student row2object(ResultSet rs) throws HappyCourseException, SQLException {
        return null;
    }

    @Override
    public Map<String, Object> object2row(Student Object) {
        return null;
    }

    @Override
    public Student getById(int id) throws HappyCourseException {
        return null;
    }

    @Override
    public List<Student> allStudents() throws HappyCourseException {
        return null;
    }

    @Override
    public Student getByIndex_number(String index_number) throws HappyCourseException {
        return null;
    }
}
