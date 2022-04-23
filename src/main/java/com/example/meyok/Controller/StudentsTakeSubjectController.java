package com.example.meyok.Controller;

import com.example.meyok.Model.StudentsTakeSubject;
import com.example.meyok.ServiceImpl.StudentsTakeSubjectServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students/take/subject")
public class StudentsTakeSubjectController {
    private StudentsTakeSubjectServiceImpl studentsTakeSubjectService;

    public StudentsTakeSubjectController(StudentsTakeSubjectServiceImpl studentsTakeSubjectService) {
        this.studentsTakeSubjectService = studentsTakeSubjectService;
    }

    @GetMapping
    public List<StudentsTakeSubject> getAllStudentsTakeSubject() {
        return this.studentsTakeSubjectService.getAllStudentsTakeSubject();
    }

    @GetMapping("/{id}")
    public StudentsTakeSubject getStudentsTakeSubjectById(@PathVariable("id") String studentsTakeSubjectId) {
        return this.studentsTakeSubjectService.getStudentsTakeSubjectById(studentsTakeSubjectId);
    }

    @PostMapping
    public void insert(@RequestBody StudentsTakeSubject studentsTakeSubject) {
        this.studentsTakeSubjectService.insert(studentsTakeSubject);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String studentsTakeSubjectId, @RequestBody StudentsTakeSubject studentsTakeSubject) {
        this.studentsTakeSubjectService.update(studentsTakeSubjectId, studentsTakeSubject);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String studentsTakeSubjectId) {
        this.studentsTakeSubjectService.deleteById(studentsTakeSubjectId);
    }
}