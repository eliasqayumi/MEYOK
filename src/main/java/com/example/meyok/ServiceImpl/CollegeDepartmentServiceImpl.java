package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.CollegeDepartment;
import com.example.meyok.Repository.CollegeDepartmentRepository;
import com.example.meyok.Service.CollegeDepartmentService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeDepartmentServiceImpl implements CollegeDepartmentService {
    private CollegeDepartmentRepository collegeDepartmentRepository;

    public CollegeDepartmentServiceImpl(CollegeDepartmentRepository collegeDepartmentRepository) {
        this.collegeDepartmentRepository = collegeDepartmentRepository;
    }

    @Override
    public void insert(CollegeDepartment collegeDepartment) {
        this.collegeDepartmentRepository.save(collegeDepartment);
    }

    @Override
    public List<CollegeDepartment> getAllCollegeDepartment() {
        return this.collegeDepartmentRepository.findAll();
    }

    @Override
    public void deleteById(String collegeDepartmentId) {
        this.collegeDepartmentRepository.deleteById(collegeDepartmentId);
    }

    @Override
    public void update(String collegeDepartmentId, CollegeDepartment collegeDepartment) {
        CollegeDepartment updateCollegeDepartment = this.collegeDepartmentRepository
                .findCollegeDepartmentById(collegeDepartmentId)
                .orElseThrow(() -> new NotFoundException("College department by " + collegeDepartmentId + " id not found"));
        updateCollegeDepartment.setCollege(collegeDepartment.getCollege());
        updateCollegeDepartment.setDepartment(collegeDepartment.getDepartment());
        updateCollegeDepartment.setStatus(collegeDepartment.getStatus());
        updateCollegeDepartment.setOpeningDate(collegeDepartment.getOpeningDate());
        this.collegeDepartmentRepository.save(updateCollegeDepartment);
    }

    @Override
    public CollegeDepartment getCollegeDepartmentById(String collegeDepartmentId) {
        return this.collegeDepartmentRepository.findCollegeDepartmentById(collegeDepartmentId)
                .orElseThrow(() -> new NotFoundException("College department by " + collegeDepartmentId + " id not found"));
    }
}
