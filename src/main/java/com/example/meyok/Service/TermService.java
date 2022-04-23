package com.example.meyok.Service;

import com.example.meyok.Model.Term;

import java.util.List;

public interface TermService {
    void insert(Term term);
    List<Term> getAllTerm();
    void deleteById(String termId);
    void update(String termId,Term term);
    Term getTermById(String termId);
}
