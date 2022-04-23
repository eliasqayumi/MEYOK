package com.example.meyok.Repository;

import com.example.meyok.Model.CollegeEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeEmployeeRepository extends JpaRepository<CollegeEmployee,String> {
}
