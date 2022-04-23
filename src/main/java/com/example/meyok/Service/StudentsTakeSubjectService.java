package com.example.meyok.Service;

import com.example.meyok.Model.StudentsTakeSubject;

import java.util.List;

public interface StudentsTakeSubjectService {
    void insert(StudentsTakeSubject studentsTakeSubject);
    List<StudentsTakeSubject> getAllStudentsTakeSubject();
    void deleteById(String studentsTakeSubjectId);
    void update(String studentsTakeSubjectId, StudentsTakeSubject studentsTakeSubject);
    StudentsTakeSubject getStudentsTakeSubjectById(String studentsTakeSubjectId);
}
