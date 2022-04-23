package com.example.meyok.Service;

import com.example.meyok.Model.District;

import java.util.List;

public interface DistrictService {
    void insert(District district);
    List<District> getAllDistrict();
    void deleteById(String districtId);
    void update(District district);
    District getDistrictById(String districtId);
}
