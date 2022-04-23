package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.collegeDepartmentEmployeesTeachSubject;
import com.example.meyok.Repository.CollegeDepartmentEmployeesTeachSubjectRepository;
import com.example.meyok.Service.CollegeDepartmentEmployeesTeachSubjectService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeDepartmentEmployeesTeachSubjectServiceImpl implements CollegeDepartmentEmployeesTeachSubjectService {
    private CollegeDepartmentEmployeesTeachSubjectRepository collegeDepartmentEmployeesTeachSubjectRepository;

    public CollegeDepartmentEmployeesTeachSubjectServiceImpl(CollegeDepartmentEmployeesTeachSubjectRepository collegeDepartmentEmployeesTeachSubjectRepository) {
        this.collegeDepartmentEmployeesTeachSubjectRepository = collegeDepartmentEmployeesTeachSubjectRepository;
    }

    @Override
    public void insert(collegeDepartmentEmployeesTeachSubject collegeDepartmentEmployeesTeachSubject) {
        this.collegeDepartmentEmployeesTeachSubjectRepository.save(collegeDepartmentEmployeesTeachSubject);
    }

    @Override
    public List<collegeDepartmentEmployeesTeachSubject> getAllCollegeDepartmentEmployeesTeachSubject() {
        return this.collegeDepartmentEmployeesTeachSubjectRepository.findAll();
    }

    @Override
    public void deleteById(String collegeDepartmentEmployeesTeachSubjectId) {
        this.collegeDepartmentEmployeesTeachSubjectRepository.deleteById(collegeDepartmentEmployeesTeachSubjectId);
    }

    @Override
    public void update(String collegeDepartmentEmployeesTeachSubjectId, collegeDepartmentEmployeesTeachSubject collegeDepartmentEmployeesTeachSubject) {
        com.example.meyok.Model.collegeDepartmentEmployeesTeachSubject updateCollegeDepartmentEmployeesTeachSubject = this
                .collegeDepartmentEmployeesTeachSubjectRepository.findCollegeDepartmentEmployeesTeachSubjectById(collegeDepartmentEmployeesTeachSubjectId)
                .orElseThrow(() -> new NotFoundException("College department employees teach subject by "
                        + collegeDepartmentEmployeesTeachSubjectId + " id not found."));
        updateCollegeDepartmentEmployeesTeachSubject.setSubject(collegeDepartmentEmployeesTeachSubject.getSubject());
        updateCollegeDepartmentEmployeesTeachSubject.setTerm(collegeDepartmentEmployeesTeachSubject.getTerm());
        updateCollegeDepartmentEmployeesTeachSubject.setCde(collegeDepartmentEmployeesTeachSubject.getCde());
        this.collegeDepartmentEmployeesTeachSubjectRepository.save(updateCollegeDepartmentEmployeesTeachSubject);
    }

    @Override
    public collegeDepartmentEmployeesTeachSubject getCollegeDepartmentEmployeesTeachSubjectById(String collegeDepartmentEmployeesTeachSubjectId) {
        return this.collegeDepartmentEmployeesTeachSubjectRepository.findCollegeDepartmentEmployeesTeachSubjectById(collegeDepartmentEmployeesTeachSubjectId)
                .orElseThrow(() -> new NotFoundException("College department employees teach subject by "
                        + collegeDepartmentEmployeesTeachSubjectId + " id not found."));
    }
}
