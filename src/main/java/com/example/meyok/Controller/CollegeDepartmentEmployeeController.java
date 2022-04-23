package com.example.meyok.Controller;

import com.example.meyok.Model.CollegeDepartmentEmployee;
import com.example.meyok.ServiceImpl.CollegeDepartmentEmployeeServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("college/department/employee")
public class CollegeDepartmentEmployeeController {
    private CollegeDepartmentEmployeeServiceImpl collegeDepartmentEmployeeServiceImpl;

    public CollegeDepartmentEmployeeController(CollegeDepartmentEmployeeServiceImpl collegeDepartmentEmployeeServiceImpl) {
        this.collegeDepartmentEmployeeServiceImpl = collegeDepartmentEmployeeServiceImpl;
    }

    @GetMapping
    public List<CollegeDepartmentEmployee> getAllCollegeDepartmentEmployee() {
        return this.collegeDepartmentEmployeeServiceImpl.getAllCollegeDepartmentEmployeeEmployee();
    }

    @GetMapping("/{id}")
    public CollegeDepartmentEmployee getCollegeDepartmentEmployeeById(@PathVariable("id") String collegeDepartmentEmployeeId) {
        return this.collegeDepartmentEmployeeServiceImpl.getCollegeDepartmentEmployeeId(collegeDepartmentEmployeeId);
    }

    @PostMapping
    public void insert(@RequestBody CollegeDepartmentEmployee collegeDepartmentEmployee) {
        this.collegeDepartmentEmployeeServiceImpl.insert(collegeDepartmentEmployee);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String collegeDepartmentEmployeeId, @RequestBody CollegeDepartmentEmployee collegeDepartmentEmployee) {
        this.collegeDepartmentEmployeeServiceImpl.update(collegeDepartmentEmployeeId, collegeDepartmentEmployee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String collegeDepartmentEmployeeId) {
        this.collegeDepartmentEmployeeServiceImpl.deleteById(collegeDepartmentEmployeeId);
    }
}
