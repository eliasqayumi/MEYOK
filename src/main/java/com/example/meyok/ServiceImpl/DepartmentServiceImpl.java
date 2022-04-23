package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.Department;
import com.example.meyok.Repository.DepartmentRepository;
import com.example.meyok.Service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void insert(Department department) {
        this.departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public void deleteById(String departmentId) {
        this.departmentRepository.deleteById(departmentId);
    }

    @Override
    public void update(String departmentId, Department department) {
        Department lastDepartment=this.departmentRepository.findDepartmentById(departmentId).orElseThrow();
        lastDepartment.setDepartmentName(department.getDepartmentName());
        lastDepartment.setDepartmentDetails(department.getDepartmentDetails());
        this.departmentRepository.save(lastDepartment);

    }

    @Override
    public Department getDepartmentById(String departmentId) {
        return this.departmentRepository.findDepartmentById(departmentId).orElseThrow();
    }
}
