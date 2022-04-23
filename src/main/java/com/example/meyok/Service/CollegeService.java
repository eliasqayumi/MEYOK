package com.example.meyok.Service;

import com.example.meyok.Model.College;

import java.util.List;

public interface CollegeService {
    void insert(College college);
    List<College> getAllColleges();
    void deleteById(String collegeId);
    void update(String collegeId,College college);
    College getCollegeById(String collegeId);
}
