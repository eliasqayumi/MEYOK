package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.Department;
import com.example.meyok.Service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Override
    public void insert(Department department) {

    }

    @Override
    public List<Department> getAllDepartment() {
        return null;
    }

    @Override
    public void deleteById(String departmentId) {

    }

    @Override
    public void update(Department department) {

    }

    @Override
    public Department getDepartmentById(String departmentId) {
        return null;
    }
}
