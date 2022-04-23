package com.example.meyok.Repository;

import com.example.meyok.Model.CollegeDepartmentEmployeesTeachSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeDepartmentEmployeeTeachSubjectRepository extends JpaRepository<CollegeDepartmentEmployeesTeachSubject,String> {
}
