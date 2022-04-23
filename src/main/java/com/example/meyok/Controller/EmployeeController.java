package com.example.meyok.Controller;

import com.example.meyok.Model.Employee;
import com.example.meyok.ServiceImpl.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    private EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAllEmployee() {
        return this.employeeService.getAllEmployee();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") String employeeId) {
        return this.employeeService.getEmployeeById(employeeId);
    }

    @PostMapping
    public void insert(@RequestBody Employee employee) {
        this.employeeService.insert(employee);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String employeeId, @RequestBody Employee employee) {
        this.employeeService.update(employeeId, employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String employeeId) {
        this.employeeService.deleteById(employeeId);
    }
}
