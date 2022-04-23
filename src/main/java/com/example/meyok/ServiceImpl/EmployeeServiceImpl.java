package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.Employee;
import com.example.meyok.Repository.EmployeeRepository;
import com.example.meyok.Service.EmployeeService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

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
    public void update(String employeeId, Employee employee) {
        Employee updateEmployee=this.employeeRepository.findEmployeeById(employeeId)
                .orElseThrow(()->new NotFoundException("Employee by "+employeeId+" id has not found."));
        updateEmployee.setName(employee.getName());
        updateEmployee.setSurname(employee.getSurname());
        updateEmployee.setContactNo(employee.getContactNo());
        updateEmployee.setEmail(employee.getEmail());
        updateEmployee.setAddress(employee.getAddress());
        this.employeeRepository.save(updateEmployee);
    }

    @Override
    public Employee getEmployeeById(String employeeId) {
        return this.employeeRepository.findEmployeeById(employeeId)
                .orElseThrow(()->new NotFoundException("Employee by "+employeeId+" id has not found."));
    }
}
