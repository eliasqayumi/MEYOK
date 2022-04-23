package com.example.meyok.Service;

import com.example.meyok.Model.CollegeDepartmentSubject;

import java.util.List;

public interface CollegeDepartmentSubjectService {
    void insert(CollegeDepartmentSubject collegeDepartmentSubject);
    List<CollegeDepartmentSubject> getAllCollegeDepartmentSubject();
    void deleteById(String collegeDepartmentSubjectId);
    void update(String collegeDepartmentSubjectId,CollegeDepartmentSubject collegeDepartmentSubject);
    CollegeDepartmentSubject getCollegeDepartmentSubjectById(String collegeDepartmentSubjectId);
}
