package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.DepartmentStudents;
import com.example.meyok.Repository.DepartmentStudentsRepository;
import com.example.meyok.Service.DepartmentStudentsService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentStudentsServiceImpl implements DepartmentStudentsService {
    private DepartmentStudentsRepository departmentStudentsRepository;

    public DepartmentStudentsServiceImpl(DepartmentStudentsRepository departmentStudentsRepository) {
        this.departmentStudentsRepository = departmentStudentsRepository;
    }

    @Override
    public void insert(DepartmentStudents departmentStudents) {
        this.departmentStudentsRepository.save(departmentStudents);
    }

    @Override
    public List<DepartmentStudents> getAllDepartmentStudents() {
        return this.departmentStudentsRepository.findAll();
    }

    @Override
    public void deleteById(String departmentStudentsId) {
        this.departmentStudentsRepository.deleteById(departmentStudentsId);
    }

    @Override
    public void update(String departmentStudentsId, DepartmentStudents departmentStudents) {
        DepartmentStudents updateDepartmentStudents = this.departmentStudentsRepository
                .findDepartmentStudentsById(departmentStudentsId)
                .orElseThrow(() -> new NotFoundException("Department students by " + departmentStudentsId + " id has not found"));
        updateDepartmentStudents.setDepartment(departmentStudents.getDepartment());
        updateDepartmentStudents.setEntranceDate(departmentStudents.getEntranceDate());
        updateDepartmentStudents.setTcNo(departmentStudents.getTcNo());
        this.departmentStudentsRepository.save(updateDepartmentStudents);
    }

    @Override
    public DepartmentStudents getDepartmentStudentsById(String departmentStudentsId) {
        return this.departmentStudentsRepository
                .findDepartmentStudentsById(departmentStudentsId)
                .orElseThrow(() -> new NotFoundException("Department students by " + departmentStudentsId + " id has not found"));
    }
}
