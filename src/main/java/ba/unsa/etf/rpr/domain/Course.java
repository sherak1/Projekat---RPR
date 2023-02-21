package ba.unsa.etf.rpr.domain;

import java.time.LocalDate;

public class Course implements Idable {
    /**
     * Attributes for class Course
     */
    private int id;
    private String course_name;
    private String lecture_number;
    private LocalDate lecture_date;
    private String exercise_number;
    private LocalDate exercise_date;
    private Student student; //key
    /**
     * Constructor with all parameters
     * @param id
     * @param course_name
     * @param lecture_number
     * @param lecture_date
     * @param exercise_number
     * @param exercise_date
     * @param student
     */
    public Course(int id, String course_name, String lecture_number, LocalDate lecture_date, String exercise_number, LocalDate exercise_date, Student student) {
        this.id = id;
        this.course_name = course_name;
        this.lecture_number = lecture_number;
        this.lecture_date = lecture_date;
        this.exercise_number = exercise_number;
        this.exercise_date = exercise_date;
        this.student = student;
    }



    @Override
    public void setId(int id) {

    }

    @Override
    public int getId() {
        return 0;
    }
}
