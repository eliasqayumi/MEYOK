package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.Term;
import com.example.meyok.Repository.TermRepository;
import com.example.meyok.Service.TermService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TermServiceImpl implements TermService {
    private TermRepository termRepository;

    public TermServiceImpl(TermRepository termRepository) {
        this.termRepository = termRepository;
    }

    @Override
    public void insert(Term term) {
        this.termRepository.save(term);
    }

    @Override
    public List<Term> getAllTerm() {
        return this.termRepository.findAll();
    }

    @Override
    public void deleteById(String termId) {
        this.termRepository.deleteById(termId);
    }

    @Override
    public void update(String termId, Term term) {
        Term updateTerm=this.termRepository.findTermById(termId)
                .orElseThrow(()->new NotFoundException("Term by "+termId+" id has not found"));
        updateTerm.setTerm(term.getTerm());
        this.termRepository.save(updateTerm);
    }

    @Override
    public Term getTermById(String termId) {
        return this.termRepository.findTermById(termId)
                .orElseThrow(()->new NotFoundException("Term by "+termId+" id has not found"));
    }
}
