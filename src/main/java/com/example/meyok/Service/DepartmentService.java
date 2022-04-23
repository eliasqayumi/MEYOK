package com.example.meyok.Service;

import com.example.meyok.Model.Department;

import java.util.List;

public interface DepartmentService {
    void insert(Department department);
    List<Department> getAllDepartment();
    void deleteById(String departmentId);
    void update(Department department);
    Department getDepartmentById(String departmentId);
}
