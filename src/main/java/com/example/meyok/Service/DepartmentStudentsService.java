package com.example.meyok.Service;

import com.example.meyok.Model.DepartmentStudents;

import java.util.List;

public interface DepartmentStudentsService {
    void insert(DepartmentStudents departmentStudents);
    List<DepartmentStudents> getAllDepartmentStudents();
    void deleteById(String departmentStudentsId);
    void update(String departmentStudentsId,DepartmentStudents departmentStudents);
    DepartmentStudents getDepartmentStudentsById(String departmentStudentsId);
}
