package com.example.meyok.Repository;

import com.example.meyok.Model.StudentsTakeSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface StudentTakeSubjectRepository extends JpaRepository<StudentsTakeSubject,String> {
    Optional<StudentsTakeSubject> findStudentsTakeSubjectById(String studentTakeSubjectId);
}
