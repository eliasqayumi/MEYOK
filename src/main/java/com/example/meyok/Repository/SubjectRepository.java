package com.example.meyok.Repository;

import com.example.meyok.Model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface SubjectRepository extends JpaRepository<Subject,String> {
    Optional<Subject> findSubjectById(String subjectId);
}
