package com.example.meyok.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "title")
public class Title {
    @Id
    @Column(name = "title_id", nullable = false, length = 10)
    private String id;

    @Column(name = "title", nullable = false, length = 30)
    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}