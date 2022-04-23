package com.example.meyok.Controller;

import com.example.meyok.Model.Subject;
import com.example.meyok.ServiceImpl.SubjectServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("subject")
public class SubjectController {
    private SubjectServiceImpl subjectService;

    public SubjectController(SubjectServiceImpl subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping
    public List<Subject> getAllSubject() {
        return this.subjectService.getAllSubjects();
    }

    @GetMapping("/{id}")
    public Subject getSubjectById(@PathVariable("id") String subjectId) {
        return this.subjectService.getSubjectById(subjectId);
    }

    @PostMapping
    public void insert(@RequestBody Subject subject) {
        this.subjectService.insert(subject);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String subjectId, @RequestBody Subject subject) {
        this.subjectService.update(subjectId, subject);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String subjectId) {
        this.subjectService.deleteById(subjectId);
    }
}