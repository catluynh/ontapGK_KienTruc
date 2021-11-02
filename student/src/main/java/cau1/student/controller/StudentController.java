package cau1.student.controller;

import cau1.student.entity.Student;
import cau1.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import cau1.student.vo.Student_Depaterment_VO;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("")
    public List<Student> findAll(){
        return studentService.findAllStudent();
    }

    @GetMapping("{id}")
    public Student_Depaterment_VO findAll(@PathVariable int id){
        return studentService.findVoById(id);
    }

    @PostMapping("")
    public void saveStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
    }

    @PutMapping("")
    public void updateStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        studentService.deleteById(id);
    }
}
