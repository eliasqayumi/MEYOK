package com.example.meyok.Controller;

import com.example.meyok.Model.College;
import com.example.meyok.ServiceImpl.CollegeServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("college")
public class CollegeController {
    private CollegeServiceImpl collegeServiceImpl;

    public CollegeController(CollegeServiceImpl collegeServiceImpl) {
    }

    @GetMapping
    public List<College> getAllCities() {
        return this.collegeServiceImpl.getAllColleges();
    }

    @GetMapping("/{id}")
    public College getCollegeById(@PathVariable("id") String collegeId) {
        return this.collegeServiceImpl.getCollegeById(collegeId);
    }

    @PostMapping
    public void insert(@RequestBody College college) {
        this.collegeServiceImpl.insert(college);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable String collegeId, @RequestBody College college) {
        this.collegeServiceImpl.update(collegeId, college);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String collegeId) {
        collegeServiceImpl.deleteById(collegeId);
    }


}
