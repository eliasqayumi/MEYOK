package com.example.meyok.Service;

import com.example.meyok.Model.CollegeDepartment;

import java.util.List;

public interface CollegeDepartmentService {
    void insert(CollegeDepartment CollegeDepartment);
    List<CollegeDepartment> getAllCollegeDepartment();
    void deleteById(String collegeDepartmentId);
    void update(String collegeDepartmentId,CollegeDepartment collegeDepartment);
    CollegeDepartment getCollegeDepartmentById(String collegeDepartmentId);
}
