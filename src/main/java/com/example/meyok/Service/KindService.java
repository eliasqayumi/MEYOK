package com.example.meyok.Service;

import com.example.meyok.Model.Kind;

import java.util.List;

public interface KindService {
    void insert(Kind kind);
    List<Kind> getAllKind();
    void deleteById(String kindId);
    void update(Kind kind);
    Kind getKindById(String kindId);
}
