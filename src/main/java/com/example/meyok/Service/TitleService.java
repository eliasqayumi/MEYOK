package com.example.meyok.Service;

import com.example.meyok.Model.Title;

import java.util.List;

public interface TitleService {
    void insert(Title title);
    List<Title> getAllTitle();
    void deleteById(String titleId);
    void update(String titleId,Title title);
    Title getTitleById(String titleId);
}
