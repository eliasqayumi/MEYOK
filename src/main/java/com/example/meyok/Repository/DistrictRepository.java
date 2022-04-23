package com.example.meyok.Repository;

import com.example.meyok.Model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DistrictRepository extends JpaRepository<District,String> {
    Optional<District> findDistrictById(String districtId);
}
