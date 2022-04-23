package com.example.meyok.Service;

import com.example.meyok.Model.CollegeEmployee;

import java.util.List;

public interface CollegeEmployeeService {
    void insert(CollegeEmployee collegeEmployee);
    List<CollegeEmployee> getAllCollegeEmployee();
    void deleteById(String collegeEmployeeId);
    void update(String collegeEmployeeId,CollegeEmployee collegeEmployee);
    CollegeEmployee getCollegeEmployeeById(String collegeEmployeeId);
}
