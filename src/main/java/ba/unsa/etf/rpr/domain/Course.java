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


    @Override
    public void setId(int id) {

    }

    @Override
    public int getId() {
        return 0;
    }
}
