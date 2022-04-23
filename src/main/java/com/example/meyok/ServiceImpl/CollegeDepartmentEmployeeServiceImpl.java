package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.CollegeDepartmentEmployee;
import com.example.meyok.Repository.CollegeDepartmentEmployeeRepository;
import com.example.meyok.Service.CollegeDepartmentEmployeeService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CollegeDepartmentEmployeeServiceImpl implements CollegeDepartmentEmployeeService {
    private CollegeDepartmentEmployeeRepository collegeDepartmentEmployeeRepository;

    @Override
    public void insert(CollegeDepartmentEmployee collegeDepartmentEmployee) {
        this.collegeDepartmentEmployeeRepository.save(collegeDepartmentEmployee);
    }

    @Override
    public List<CollegeDepartmentEmployee> getAllCollegeDepartmentEmployeeEmployee() {
        return this.collegeDepartmentEmployeeRepository.findAll();
    }

    @Override
    public void deleteById(String collegeDepartmentEmployeeId) {
        this.collegeDepartmentEmployeeRepository.deleteById(collegeDepartmentEmployeeId);
    }

    @Override
    public void update(String collegeDepartmentEmployeeId, CollegeDepartmentEmployee collegeDepartmentEmployee) {
        CollegeDepartmentEmployee updateCollegeDepartmentEmployee=this.collegeDepartmentEmployeeRepository
                .findCollegeDepartmentEmployeeById(collegeDepartmentEmployeeId)
                .orElseThrow(()->new NotFoundException("College department employee by "+collegeDepartmentEmployeeId+" id has not found."));
        updateCollegeDepartmentEmployee.setDepartment(collegeDepartmentEmployee.getDepartment());
        updateCollegeDepartmentEmployee.setEmployeeNo(collegeDepartmentEmployee.getEmployeeNo());
        updateCollegeDepartmentEmployee.setExpertise(collegeDepartmentEmployee.getExpertise());
        this.collegeDepartmentEmployeeRepository.save(updateCollegeDepartmentEmployee);
    }

    @Override
    public CollegeDepartmentEmployee getCollegeDepartmentEmployeeId(String collegeDepartmentEmployeeId) {
        return this.collegeDepartmentEmployeeRepository.findCollegeDepartmentEmployeeById(collegeDepartmentEmployeeId)
                .orElseThrow(()-> new NotFoundException("College department employee by "+collegeDepartmentEmployeeId+" id has not found."));
    }
}
