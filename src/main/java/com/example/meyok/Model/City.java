package com.example.meyok.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class City {
    @Id
    @Column(name = "city_id", nullable = false, length = 10)
    private String id;

    @Column(name = "city_name", nullable = false, length = 20)
    private String cityName;

}