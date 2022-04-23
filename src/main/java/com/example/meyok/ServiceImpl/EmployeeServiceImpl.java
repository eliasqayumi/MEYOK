package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.Employee;
import com.example.meyok.Service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void insert(Employee employee) {

    }

    @Override
    public List<Employee> getAllEmployee() {
        return null;
    }

    @Override
    public void deleteById(String employeeId) {

    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public Employee getEmployeeById(String employeeId) {
        return null;
    }
}
