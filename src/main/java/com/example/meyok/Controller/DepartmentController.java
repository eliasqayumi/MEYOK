package com.example.meyok.Controller;

import com.example.meyok.Model.Department;
import com.example.meyok.ServiceImpl.DepartmentServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("department")
public class DepartmentController {
    private DepartmentServiceImpl departmentService;

    public DepartmentController(DepartmentServiceImpl departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public List<Department> getAllDepartment() {
        return this.departmentService.getAllDepartment();
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") String departmentId) {
        return this.departmentService.getDepartmentById(departmentId);
    }

    @PostMapping
    public void insert(@RequestBody Department department) {
        this.departmentService.insert(department);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String departmentId, @RequestBody Department department) {
        this.departmentService.update(departmentId, department);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String departmentId) {
        this.departmentService.deleteById(departmentId);
    }
}
