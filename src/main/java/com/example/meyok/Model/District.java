package com.example.meyok.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "district")
public class District {
    @Id
    @Column(name = "district_id", nullable = false, length = 10)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //TODO Reverse Engineering! Migrate other columns to the entity
}