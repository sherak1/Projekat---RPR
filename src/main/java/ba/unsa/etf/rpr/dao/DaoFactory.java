package ba.unsa.etf.rpr.dao;



/**
 * DaoFactory class that make instances of dao classes
 */
public class DaoFactory {

    /**
     * Static methods for DaoFactory
     */
    private static final TeacherDao teacherDao = new TeacherDaoSQLImpl();
    private static  final StudentDao studentDao = new StudentDaoSQLImpl();
    private static final CourseDao courseDao = new CourseSQLImpl();

    /**
     * Constructor without parameters
     */
    private DaoFactory() {}

    /**
     * Method for access TeacherDao instance
     * @return
     */
    public static TeacherDao teacherDao() {
        return  teacherDao;
    }

    /**
     * Method for access StudentDao instance
     * @return
     */
    public static StudentDao studentDao() { return studentDao; }

    /**
     * Method for access CoruseDao instance
     * @return
     */
    public static CourseDao courseDao() { return courseDao; }
}