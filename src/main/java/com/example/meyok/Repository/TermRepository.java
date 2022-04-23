package com.example.meyok.Repository;

import com.example.meyok.Model.Term;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TermRepository extends JpaRepository<Term,String> {
    Optional<Term> findTermById(String termId);
}
