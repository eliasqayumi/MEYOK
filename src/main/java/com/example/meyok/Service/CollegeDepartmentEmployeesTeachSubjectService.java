package com.example.meyok.Service;

import com.example.meyok.Model.collegeDepartmentEmployeesTeachSubject;

import java.util.List;

public interface CollegeDepartmentEmployeesTeachSubjectService {
    void insert(collegeDepartmentEmployeesTeachSubject collegeDepartmentEmployeesTeachSubject);
    List<collegeDepartmentEmployeesTeachSubject> getAllCollegeDepartmentEmployeesTeachSubject();
    void deleteById(String collegeDepartmentEmployeesTeachSubjectId);
    void update(String collegeDepartmentEmployeesTeachSubjectId, collegeDepartmentEmployeesTeachSubject collegeDepartmentEmployeesTeachSubject);
    collegeDepartmentEmployeesTeachSubject getCollegeDepartmentEmployeesTeachSubjectById(String collegeDepartmentEmployeesTeachSubjectId);
}
