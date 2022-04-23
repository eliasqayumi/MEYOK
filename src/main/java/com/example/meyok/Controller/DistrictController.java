package com.example.meyok.Controller;

import com.example.meyok.Model.District;
import com.example.meyok.ServiceImpl.DistrictServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("district")
public class DistrictController {
    private DistrictServiceImpl districtService;

    public DistrictController(DistrictServiceImpl districtService) {
        this.districtService = districtService;
    }

    @GetMapping
    public List<District> getAllDistrict() {
        return this.districtService.getAllDistrict();
    }

    @GetMapping("/{id}")
    public District getDistrictById(@PathVariable("id") String districtId) {
        return this.districtService.getDistrictById(districtId);
    }

    @PostMapping
    public void insert(@RequestBody District district) {
        this.districtService.insert(district);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String districtId, @RequestBody District district) {
        this.districtService.update(districtId, district);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String districtId) {
        this.districtService.deleteById(districtId);
    }
}
