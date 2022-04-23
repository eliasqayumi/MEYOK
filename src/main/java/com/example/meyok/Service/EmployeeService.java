package com.example.meyok.Service;

import com.example.meyok.Model.Employee;

import java.util.List;

public interface EmployeeService {
    void insert(Employee employee);
    List<Employee> getAllEmployee();
    void deleteById(String employeeId);
    void update(Employee employee);
    Employee getEmployeeById(String employeeId);
}
