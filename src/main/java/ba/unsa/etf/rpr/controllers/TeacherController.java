package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.domain.Teacher;

public class TeacherController {
    private Teacher teacher=new Teacher();
    public TeacherController() {
        teacher = new Teacher();
    }

    public TeacherController(Teacher teacher) {
        this.teacher = teacher;
    }
}
