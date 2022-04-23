package com.example.meyok.Repository;

import com.example.meyok.Model.CollegeDepartmentSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CollegeDepartmentSubjectRepository extends JpaRepository<CollegeDepartmentSubject,String> {
    Optional<CollegeDepartmentSubject> findCollegeDepartmentSubjectById(String collegeDepartmentSubjectId);
}
