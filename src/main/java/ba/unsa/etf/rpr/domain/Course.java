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

    public Course() {
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getLecture_number() {
        return lecture_number;
    }

    public void setLecture_number(String lecture_number) {
        this.lecture_number = lecture_number;
    }

    public LocalDate getLecture_date() {
        return lecture_date;
    }

    public void setLecture_date(LocalDate lecture_date) {
        this.lecture_date = lecture_date;
    }

    public String getExercise_number() {
        return exercise_number;
    }

    public void setExercise_number(String exercise_number) {
        this.exercise_number = exercise_number;
    }

    public LocalDate getExercise_date() {
        return exercise_date;
    }

    public void setExercise_date(LocalDate exercise_date) {
        this.exercise_date = exercise_date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public void setId(int id) {
     this.id=id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Course name: " + this.course_name + "\nLecture date: " + this.lecture_date + "\nLecture number: " + this.lecture_number + "\nExercise number: " + this.exercise_number+ "\nExercise date: " + this.exercise_date;
    }
}
