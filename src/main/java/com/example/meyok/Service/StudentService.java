package com.example.meyok.Service;

import com.example.meyok.Model.Student;

import java.util.List;

public interface StudentService {
    void insert(Student student);
    List<Student> getAllStudents();
    void deleteById(String studentId);
    void update(String studentId,Student student);
    Student getStudentById(String studentId);
}
