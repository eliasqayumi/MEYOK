package com.example.meyok.ServiceInterface;

import com.example.meyok.Model.City;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CityServiceInt {
    void insert(City city);
    List<City> getAllCities();
    void deleteById(String cityId);
    void update(City city);
    City getCityById(String cityId);
}
