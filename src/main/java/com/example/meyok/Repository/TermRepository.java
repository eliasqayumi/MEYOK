package com.example.meyok.Repository;

import com.example.meyok.Model.Term;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TermRepository extends JpaRepository<Term,String> {
}
