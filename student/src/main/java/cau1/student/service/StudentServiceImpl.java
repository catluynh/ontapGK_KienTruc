package cau1.student.service;

import cau1.student.entity.Student;
import cau1.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import cau1.student.vo.Depaterment;
import cau1.student.vo.Student_Depaterment_VO;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private RestTemplate restTemplate;

    private String crmRestUrl = "http://localhost:8083/depaterment";

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student_Depaterment_VO findVoById(int id) {
        Student_Depaterment_VO vo = new Student_Depaterment_VO();
        Student student = findById(id);
        vo.setStudent(student);
        Depaterment depaterment = restTemplate.getForObject(crmRestUrl + "/" + student.getIdDepaterment(), Depaterment.class);
        vo.setDepaterment(depaterment);
        return vo;
    }

    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> findAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int id) {
        Optional<Student> rs = studentRepository.findById(id);
        Student student = null;
        if (rs.isPresent()) {
            student = rs.get();
        }
        return student;
    }
}
