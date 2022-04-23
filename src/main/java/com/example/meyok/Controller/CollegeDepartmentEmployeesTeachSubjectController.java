package com.example.meyok.Controller;

import com.example.meyok.Model.collegeDepartmentEmployeesTeachSubject;
import com.example.meyok.ServiceImpl.CollegeDepartmentEmployeesTeachSubjectServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("college/department/employees/teach/subject")
public class CollegeDepartmentEmployeesTeachSubjectController {
    private CollegeDepartmentEmployeesTeachSubjectServiceImpl collegeDepartmentEmployeesTeachSubjectService;

    public CollegeDepartmentEmployeesTeachSubjectController(CollegeDepartmentEmployeesTeachSubjectServiceImpl collegeDepartmentEmployeesTeachSubjectService) {
        this.collegeDepartmentEmployeesTeachSubjectService = collegeDepartmentEmployeesTeachSubjectService;
    }

    @GetMapping
    public List<collegeDepartmentEmployeesTeachSubject> getAllCollegeDepartmentEmployeesTeachSubject() {
        return this.collegeDepartmentEmployeesTeachSubjectService.getAllCollegeDepartmentEmployeesTeachSubject();
    }

    @GetMapping("/{id}")
    public collegeDepartmentEmployeesTeachSubject getCollegeDepartmentEmployeesTeachSubjectById(@PathVariable("id") String collegeDepartmentEmployeesTeachSubjectId) {
        return this.collegeDepartmentEmployeesTeachSubjectService.getCollegeDepartmentEmployeesTeachSubjectById(collegeDepartmentEmployeesTeachSubjectId);
    }

    @PostMapping
    public void insert(@RequestBody collegeDepartmentEmployeesTeachSubject collegeDepartmentEmployeesTeachSubject) {
        this.collegeDepartmentEmployeesTeachSubjectService.insert(collegeDepartmentEmployeesTeachSubject);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String collegeDepartmentEmployeesTeachSubjectId, @RequestBody collegeDepartmentEmployeesTeachSubject collegeDepartmentEmployeesTeachSubject) {
        this.collegeDepartmentEmployeesTeachSubjectService.update(collegeDepartmentEmployeesTeachSubjectId, collegeDepartmentEmployeesTeachSubject);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String collegeDepartmentEmployeesTeachSubjectId) {
        this.collegeDepartmentEmployeesTeachSubjectService.deleteById(collegeDepartmentEmployeesTeachSubjectId);
    }
}
