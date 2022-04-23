package com.example.meyok.Controller;

import com.example.meyok.Model.Student;
import com.example.meyok.ServiceImpl.StudentServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    private StudentServiceImpl studentService;

    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudent() {
        return this.studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") String studentId) {
        return this.studentService.getStudentById(studentId);
    }

    @PostMapping
    public void insert(@RequestBody Student student) {
        this.studentService.insert(student);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String studentId, @RequestBody Student student) {
        this.studentService.update(studentId, student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String studentId) {
        this.studentService.deleteById(studentId);
    }
}