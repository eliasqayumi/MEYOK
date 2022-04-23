package com.example.meyok.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "district")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class District {
    @Id
    @Column(name = "district_id", nullable = false, length = 10)
    private String id;

    @Column(name = "district_name", nullable = false, length = 30)
    private String districtName;



}