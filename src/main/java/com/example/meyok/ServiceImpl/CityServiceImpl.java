package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.City;
import com.example.meyok.Repository.CityRepository;
import com.example.meyok.Service.CityService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    private CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
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
    public void update(String cityId, City city) {
        City updateCity=cityRepository.findCityById(cityId).orElseThrow(()->new NotFoundException("City by "+cityId+" id not found."));
        updateCity.setCityName(city.getCityName());
        cityRepository.save(updateCity);
    }

    @Override
    public City getCityById(String cityId) {
        return cityRepository.findCityById(cityId).orElseThrow();
    }
}
