package com.example.meyok.Repository;

import com.example.meyok.Model.collegeDepartmentEmployeesTeachSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CollegeDepartmentEmployeesTeachSubjectRepository extends JpaRepository<collegeDepartmentEmployeesTeachSubject,String> {
    Optional<collegeDepartmentEmployeesTeachSubject> findCollegeDepartmentEmployeesTeachSubjectById(String collegeDepartmentEmployeesTeachSubjectRepositoryId);
}
