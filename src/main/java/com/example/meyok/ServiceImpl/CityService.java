package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.City;
import com.example.meyok.Repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityService implements com.example.meyok.Service.CityService {
    private CityRepository cityRepository;
    public CityService(CityRepository cityRepository) {
        this.cityRepository=cityRepository;
    }

    @Override
    public void insert(City city) {
        cityRepository.save(city);
    }

    @Override
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    @Override
    public void deleteById(String cityId) {
        cityRepository.deleteById(cityId);
    }

    @Override
    public void update(City city) {
        cityRepository.save(city);
    }

    @Override
    public City getCityById(String cityId) {
        return cityRepository.getCityById(cityId).orElseThrow();
    }
}
