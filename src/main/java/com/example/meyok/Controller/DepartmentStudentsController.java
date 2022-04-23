package com.example.meyok.Controller;

import com.example.meyok.Model.DepartmentStudents;
import com.example.meyok.ServiceImpl.DepartmentStudentsServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("department/students")
public class DepartmentStudentsController {
    private DepartmentStudentsServiceImpl departmentStudentsService;

    public DepartmentStudentsController(DepartmentStudentsServiceImpl departmentStudentsService) {
        this.departmentStudentsService = departmentStudentsService;
    }

    @GetMapping
    public List<DepartmentStudents> getAllDepartmentStudents() {
        return this.departmentStudentsService.getAllDepartmentStudents();
    }

    @GetMapping("/{id}")
    public DepartmentStudents getDepartmentStudentsById(@PathVariable("id") String departmentStudentsId) {
        return this.departmentStudentsService.getDepartmentStudentsById(departmentStudentsId);
    }

    @PostMapping
    public void insert(@RequestBody DepartmentStudents departmentStudents) {
        this.departmentStudentsService.insert(departmentStudents);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String departmentStudentsId, @RequestBody DepartmentStudents departmentStudents) {
        this.departmentStudentsService.update(departmentStudentsId, departmentStudents);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String departmentStudentsId) {
        this.departmentStudentsService.deleteById(departmentStudentsId);
    }
}
