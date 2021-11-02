package cau1.student.service;

import cau1.student.entity.Student;
import cau1.student.vo.Student_Depaterment_VO;

import java.util.List;

public interface StudentService {
    public void saveStudent(Student student);
    public Student_Depaterment_VO findVoById(int id);
    public void deleteById(int id);
    public List<Student> findAllStudent();
    public Student findById(int id);
}
