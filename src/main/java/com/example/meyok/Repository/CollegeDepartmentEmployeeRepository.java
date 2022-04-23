package com.example.meyok.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeDepartmentEmployeeRepository extends JpaRepository<CollegeDepartmentEmployeeRepository,String> {

}
