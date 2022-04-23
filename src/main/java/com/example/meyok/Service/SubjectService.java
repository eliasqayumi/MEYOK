package com.example.meyok.Service;

import com.example.meyok.Model.Subject;

import java.util.List;

public interface SubjectService {
    void insert(Subject subject);
    List<Subject> getAllSubjects();
    void deleteById(String subjectId);
    void update(String subjectId,Subject subject);
    Subject getSubjectById(String subjectId);
}
