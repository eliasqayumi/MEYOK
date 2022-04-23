package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.District;
import com.example.meyok.Repository.DistrictRepository;
import com.example.meyok.Service.DistrictService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {
    private DistrictRepository districtRepository;

    public DistrictServiceImpl(DistrictRepository districtRepository) {
        this.districtRepository = districtRepository;
    }

    @Override
    public void insert(District district) {
        this.districtRepository.save(district);
    }

    @Override
    public List<District> getAllDistrict() {
        return this.districtRepository.findAll();
    }

    @Override
    public void deleteById(String districtId) {
        this.districtRepository.deleteById(districtId);
    }

    @Override
    public void update(String districtId, District district) {
        District updateDistrict = this.districtRepository.findDistrictById(districtId)
                .orElseThrow(() -> new NotFoundException("District by " + districtId + " id has not found."));
        updateDistrict.setDistrictName(district.getDistrictName());
        this.districtRepository.save(updateDistrict);
    }

    @Override
    public District getDistrictById(String districtId) {
        return this.districtRepository.findDistrictById(districtId)
                .orElseThrow(() -> new NotFoundException("District by " + districtId + " id has not found."));
    }
}
