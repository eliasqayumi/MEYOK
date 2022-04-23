package com.example.meyok.Service;

import com.example.meyok.Model.Expertise;

import java.util.List;

public interface ExpertiseService {
    void insert(Expertise expertise);
    List<Expertise> getAllExpertises();
    void deleteById(String expertiseId);
    void update(Expertise expertise);
    Expertise getExpertiseById(String expertiseId);
}
