package com.example.meyok.Service;

import com.example.meyok.Model.CollegeDepartmentEmployeesTeachSubject;

import java.util.List;

public interface CollegeDepartmentEmployeesTeachSubjectService {
    void insert(CollegeDepartmentEmployeesTeachSubject collegeDepartmentEmployeesTeachSubject);
    List<CollegeDepartmentEmployeesTeachSubject> getAllCollegeDepartmentEmployeesTeachSubject();
    void deleteById(String collegeDepartmentEmployeesTeachSubjectId);
    void update(CollegeDepartmentEmployeesTeachSubject collegeDepartmentEmployeesTeachSubject);
    CollegeDepartmentEmployeesTeachSubject getCollegeDepartmentEmployeesTeachSubjectById(String collegeDepartmentEmployeesTeachSubjectId);
}
