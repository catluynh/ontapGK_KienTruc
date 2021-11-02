package cau1.student.vo;

import cau1.student.entity.Student;

public class Student_Depaterment_VO {
    private Student student;
    private Depaterment depaterment;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Depaterment getDepaterment() {
        return depaterment;
    }

    public void setDepaterment(Depaterment depaterment) {
        this.depaterment = depaterment;
    }
}
