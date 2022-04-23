package com.example.meyok.Controller;

import com.example.meyok.Model.CollegeEmployee;
import com.example.meyok.ServiceImpl.CollegeEmployeeServiceImpl;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("college/employee")
public class CollegeEmployeeController {
    private CollegeEmployeeServiceImpl collegeEmployeeService;

    public CollegeEmployeeController(CollegeEmployeeServiceImpl collegeEmployeeService) {
        this.collegeEmployeeService = collegeEmployeeService;
    }

    @GetMapping
    public List<CollegeEmployee> getAllCollegeEmployee() {
        return this.collegeEmployeeService.getAllCollegeEmployee();
    }

    @GetMapping("/{id}")
    public CollegeEmployee getCollegeEmployeeById(@PathVariable("id") String collegeEmployeeId) {
        return this.collegeEmployeeService.getCollegeEmployeeById(collegeEmployeeId);
    }

    @PostMapping
    public void insert(@RequestBody CollegeEmployee collegeEmployee) {
        this.collegeEmployeeService.insert(collegeEmployee);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String collegeEmployeeId, @RequestBody CollegeEmployee collegeEmployee) {
        this.collegeEmployeeService.update(collegeEmployeeId, collegeEmployee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String collegeEmployeeId) {
        this.collegeEmployeeService.deleteById(collegeEmployeeId);
    }
}
