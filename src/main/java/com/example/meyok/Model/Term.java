package com.example.meyok.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "term")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Term {
    @Id
    @Column(name = "term_id", nullable = false, length = 10)
    private String id;

    @Column(name = "term", nullable = false, length = 20)
    private String term;


}