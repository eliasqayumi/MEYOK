package com.example.meyok.Controller;

import com.example.meyok.Model.City;
import com.example.meyok.Service.CityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityController {
    private CityService cityService;
    public CityController(CityService cityService) {
        this.cityService=cityService;
        City city1= new City("1","Adana");
        cityService.insert(city1);
    }

    @GetMapping("/")
    public List<City> getAllCities(){
        return this.cityService.getAllCities();
    }

    @GetMapping("/{id}")
    public City getCityById(@PathVariable("id") String cityId){
        return this.cityService.getCityById(cityId);
    }

    @PostMapping("/")
    public void insert(@RequestBody City city){
        this.cityService.insert(city);
    }

    @PutMapping("/")
    public void update(@RequestBody City city){
        this.cityService.update(city);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String cityId){
        cityService.deleteById(cityId);
    }




}
