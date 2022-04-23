package com.example.meyok.Repository;

import com.example.meyok.Model.StudentsTakeSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentTakeSubjectRepository extends JpaRepository<StudentsTakeSubject,String> {
}
