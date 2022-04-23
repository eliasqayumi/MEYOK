package com.example.meyok.Repository;

import com.example.meyok.Model.College;
import com.example.meyok.Model.CollegeEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CollegeEmployeeRepository extends JpaRepository<CollegeEmployee,String> {
    Optional<CollegeEmployee> findCollegeEmployeeById(String collegeEmployeeId);
}
