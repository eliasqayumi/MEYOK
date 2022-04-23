package com.example.meyok.Controller;

import com.example.meyok.Model.City;
import com.example.meyok.ServiceImpl.CityServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("city")
public class CityController {
    private CityServiceImpl cityServiceImpl;

    public CityController(CityServiceImpl cityServiceImpl) {
        this.cityServiceImpl = cityServiceImpl;
        City city1 = new City("1", "Adana");
        cityServiceImpl.insert(city1);
    }

    @GetMapping
    public List<City> getAllCities() {
        return this.cityServiceImpl.getAllCities();
    }

    @GetMapping("/{id}")
    public City getCityById(@PathVariable("id") String cityId) {
        return this.cityServiceImpl.getCityById(cityId);
    }

    @PostMapping
    public void insert(@RequestBody City city) {
        this.cityServiceImpl.insert(city);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable String cityId, @RequestBody City city) {
        this.cityServiceImpl.update(cityId, city);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String cityId) {
        cityServiceImpl.deleteById(cityId);
    }


}
