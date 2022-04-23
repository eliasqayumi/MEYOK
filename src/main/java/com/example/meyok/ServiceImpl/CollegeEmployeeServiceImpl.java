package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.CollegeEmployee;
import com.example.meyok.Repository.CollegeEmployeeRepository;
import com.example.meyok.Service.CollegeEmployeeService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeEmployeeServiceImpl implements CollegeEmployeeService {
    private CollegeEmployeeRepository collegeEmployeeRepository;

    public CollegeEmployeeServiceImpl(CollegeEmployeeRepository collegeEmployeeRepository) {
        this.collegeEmployeeRepository = collegeEmployeeRepository;
    }

    @Override
    public void insert(CollegeEmployee collegeEmployee) {
        this.collegeEmployeeRepository.save(collegeEmployee);
    }

    @Override
    public List<CollegeEmployee> getAllCollegeEmployee() {
        return this.collegeEmployeeRepository.findAll();
    }

    @Override
    public void deleteById(String collegeEmployeeId) {
        this.collegeEmployeeRepository.deleteById(collegeEmployeeId);
    }

    @Override
    public void update(String collegeEmployeeId, CollegeEmployee collegeEmployee) {
        CollegeEmployee updateCollegeEmployee = this.collegeEmployeeRepository
                .findCollegeEmployeeById(collegeEmployeeId)
                .orElseThrow(() -> new NotFoundException("College employee by" + collegeEmployeeId + " id has not found"));
        updateCollegeEmployee.setCollege(collegeEmployee.getCollege());
        updateCollegeEmployee.setEntranceDate(collegeEmployee.getEntranceDate());
        updateCollegeEmployee.setTask(collegeEmployee.getTask());
        updateCollegeEmployee.setTitle(collegeEmployee.getTitle());
        updateCollegeEmployee.setTcNo(collegeEmployee.getTcNo());
        this.collegeEmployeeRepository.save(updateCollegeEmployee);
    }

    @Override
    public CollegeEmployee getCollegeEmployeeById(String collegeEmployeeId) {
        return this.collegeEmployeeRepository.findCollegeEmployeeById(collegeEmployeeId)
                .orElseThrow(() -> new NotFoundException("College employee by" + collegeEmployeeId + " id has not found"));
    }
}
