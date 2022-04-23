package com.example.meyok.Controller;

import com.example.meyok.Model.CollegeDepartmentSubject;
import com.example.meyok.ServiceImpl.CollegeDepartmentSubjectServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("college/department/subject")
public class CollegeDepartmentSubjectController {
    private CollegeDepartmentSubjectServiceImpl collegeDepartmentSubjectService;

    public CollegeDepartmentSubjectController(CollegeDepartmentSubjectServiceImpl collegeDepartmentSubjectService) {
        this.collegeDepartmentSubjectService = collegeDepartmentSubjectService;
    }

    @GetMapping
    public List<CollegeDepartmentSubject> getAllCollegeDepartmentSubject() {
        return this.collegeDepartmentSubjectService.getAllCollegeDepartmentSubject();
    }

    @GetMapping("/{id}")
    public CollegeDepartmentSubject getCollegeDepartmentSubjectById(@PathVariable("id") String collegeDepartmentSubjectId) {
        return this.collegeDepartmentSubjectService.getCollegeDepartmentSubjectById(collegeDepartmentSubjectId);
    }

    @PostMapping
    public void insert(@RequestBody CollegeDepartmentSubject collegeDepartmentSubject) {
        this.collegeDepartmentSubjectService.insert(collegeDepartmentSubject);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String collegeDepartmentSubjectId, @RequestBody CollegeDepartmentSubject collegeDepartmentSubject) {
        this.collegeDepartmentSubjectService.update(collegeDepartmentSubjectId, collegeDepartmentSubject);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String collegeDepartmentSubjectId) {
        this.collegeDepartmentSubjectService.deleteById(collegeDepartmentSubjectId);
    }
}
