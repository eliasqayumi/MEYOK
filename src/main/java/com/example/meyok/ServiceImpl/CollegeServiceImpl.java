package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.College;
import com.example.meyok.Repository.CollegeRepository;
import com.example.meyok.Service.CollegeService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CollegeServiceImpl implements CollegeService {
    private CollegeRepository collegeRepository;

    public CollegeServiceImpl(CollegeRepository collegeRepository) {
        this.collegeRepository = collegeRepository;
    }

    @Override
    public void insert(College college) {
        this.collegeRepository.save(college);
    }

    @Override
    public List<College> getAllColleges() {
        return this.collegeRepository.findAll();
    }

    @Override
    public void deleteById(String collegeId) {
        this.collegeRepository.deleteById(collegeId);
    }

    @Override
    public void update(String collegeId, College college) {
        College updateCollege = this.collegeRepository.findCollegeById(collegeId)
                .orElseThrow(() -> new NotFoundException("College by " + collegeId + " id has not found"));
        updateCollege.setCollegeName(college.getCollegeName());
        updateCollege.setCreateDate(college.getCreateDate());
        updateCollege.setDistrict(college.getDistrict());
        updateCollege.setKind(college.getKind());
        this.collegeRepository.save(updateCollege);
    }

    @Override
    public College getCollegeById(String collegeId) {
        return this.collegeRepository.findCollegeById(collegeId)
                .orElseThrow(() -> new NotFoundException("College by " + collegeId + " id has not found"));
    }
}
