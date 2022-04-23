package com.example.meyok.Controller;

import com.example.meyok.Model.College;
import com.example.meyok.Model.CollegeDepartment;
import com.example.meyok.ServiceImpl.CollegeDepartmentServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("college/department/")
public class CollegeDepartmentController {
    private CollegeDepartmentServiceImpl collegeDepartmentService;

    public CollegeDepartmentController(CollegeDepartmentServiceImpl collegeDepartmentService) {
        this.collegeDepartmentService = collegeDepartmentService;
    }

    @GetMapping
    public List<CollegeDepartment> getAllCollegeDepartment() {
        return this.collegeDepartmentService.getAllCollegeDepartment();
    }

    @GetMapping("/{id}")
    public CollegeDepartment getCollegeDepartmentByID(@PathVariable("id") String collegeDepartmentID) {
        return this.collegeDepartmentService.getCollegeDepartmentById(collegeDepartmentID);
    }

    @PostMapping
    public void insert(@RequestBody CollegeDepartment collegeDepartment) {
        this.collegeDepartmentService.insert(collegeDepartment);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String collegeDepartmentId, @RequestBody CollegeDepartment collegeDepartment) {
        this.collegeDepartmentService.update(collegeDepartmentId, collegeDepartment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String collegeDepartmentId) {
        this.collegeDepartmentService.deleteById(collegeDepartmentId);
    }
}
