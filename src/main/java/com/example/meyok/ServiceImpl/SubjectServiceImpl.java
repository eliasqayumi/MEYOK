package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.Subject;
import com.example.meyok.Repository.SubjectRepository;
import com.example.meyok.Service.SubjectService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {
    private SubjectRepository subjectRepository;

    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public void insert(Subject subject) {
        this.subjectRepository.save(subject);
    }

    @Override
    public List<Subject> getAllSubjects() {
        return this.subjectRepository.findAll();
    }

    @Override
    public void deleteById(String subjectId) {
        this.subjectRepository.deleteById(subjectId);
    }

    @Override
    public void update(String subjectId, Subject subject) {
        Subject updateSubject = this.subjectRepository.findSubjectById(subjectId)
                .orElseThrow(() -> new NotFoundException("Subject by " + subjectId + " id has not found."));
        updateSubject.setSubjectName(subject.getSubjectName());
        updateSubject.setSubjectCredit(subject.getSubjectCredit());
        updateSubject.setSubjectAkts(subject.getSubjectAkts());
        this.subjectRepository.save(updateSubject);
    }

    @Override
    public Subject getSubjectById(String subjectId) {
        return this.subjectRepository.findSubjectById(subjectId)
                .orElseThrow(() -> new NotFoundException("Subject by " + subjectId + " id has not found."));
    }
}
