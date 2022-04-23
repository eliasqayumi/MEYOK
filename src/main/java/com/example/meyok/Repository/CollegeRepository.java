package com.example.meyok.Repository;

import com.example.meyok.Model.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CollegeRepository extends JpaRepository<College,String> {
    Optional<College> findCollegeById(String collegeId);
}
