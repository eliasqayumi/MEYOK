package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.CollegeDepartmentSubject;
import com.example.meyok.Repository.CollegeDepartmentSubjectRepository;
import com.example.meyok.Service.CollegeDepartmentSubjectService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeDepartmentSubjectServiceImpl implements CollegeDepartmentSubjectService {
    private CollegeDepartmentSubjectRepository collegeDepartmentSubjectRepository;

    public CollegeDepartmentSubjectServiceImpl(CollegeDepartmentSubjectRepository collegeDepartmentSubjectRepository) {
        this.collegeDepartmentSubjectRepository = collegeDepartmentSubjectRepository;
    }

    @Override
    public void insert(CollegeDepartmentSubject collegeDepartmentSubject) {
        this.collegeDepartmentSubjectRepository.save(collegeDepartmentSubject);
    }

    @Override
    public List<CollegeDepartmentSubject> getAllCollegeDepartmentSubject() {
        return this.collegeDepartmentSubjectRepository.findAll();
    }

    @Override
    public void deleteById(String collegeDepartmentSubjectId) {
        this.collegeDepartmentSubjectRepository.deleteById(collegeDepartmentSubjectId);
    }

    @Override
    public void update(String collegeDepartmentSubjectId, CollegeDepartmentSubject collegeDepartmentSubject) {
        CollegeDepartmentSubject updateCollegeDepartmentSubject = this.collegeDepartmentSubjectRepository
                .findCollegeDepartmentSubjectById(collegeDepartmentSubjectId)
                .orElseThrow(() -> new NotFoundException("College department subject by " + collegeDepartmentSubjectId + " id not found"));
        updateCollegeDepartmentSubject.setSubject(collegeDepartmentSubject.getSubject());
        updateCollegeDepartmentSubject.setColDep(collegeDepartmentSubject.getColDep());
        this.collegeDepartmentSubjectRepository.save(updateCollegeDepartmentSubject);
    }

    @Override
    public CollegeDepartmentSubject getCollegeDepartmentSubjectById(String collegeDepartmentSubjectId) {
        return this.collegeDepartmentSubjectRepository.findCollegeDepartmentSubjectById(collegeDepartmentSubjectId)
                .orElseThrow(() -> new NotFoundException("College department subject by " + collegeDepartmentSubjectId + " id not found"));
    }
}
