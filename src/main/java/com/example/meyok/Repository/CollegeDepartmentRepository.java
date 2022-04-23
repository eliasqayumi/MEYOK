package com.example.meyok.Repository;

import com.example.meyok.Model.CollegeDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeDepartmentRepository extends JpaRepository<CollegeDepartment,String> {

}
