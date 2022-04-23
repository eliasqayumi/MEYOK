package com.example.meyok;

import com.example.meyok.Model.City;
import com.example.meyok.Model.College;
import com.example.meyok.Model.CollegeDepartment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeyokApplication {
    public static void main(String[] args) {
        SpringApplication.run(MeyokApplication.class,args);City city=new City("1","1");
        College college=new College();
        CollegeDepartment collegeDepartment=new CollegeDepartment();
    }
}
