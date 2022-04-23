package com.example.meyok.Repository;

import com.example.meyok.Model.DepartmentStudents;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentStudentsRepository extends JpaRepository<DepartmentStudents,String> {
    Optional<DepartmentStudents> findDepartmentStudentsById(String departmentStudentsId);

}
