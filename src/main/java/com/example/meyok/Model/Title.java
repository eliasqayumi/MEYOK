package com.example.meyok.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "title")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Title {
    @Id
    @Column(name = "title_id", nullable = false, length = 10)
    private String id;

    @Column(name = "title", nullable = false, length = 30)
    private String title;


}