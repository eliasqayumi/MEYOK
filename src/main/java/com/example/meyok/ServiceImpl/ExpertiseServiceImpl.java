package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.Expertise;
import com.example.meyok.Repository.ExpertiseRepository;
import com.example.meyok.Service.ExpertiseService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExpertiseServiceImpl implements ExpertiseService {
    private ExpertiseRepository expertiseRepository;

    public ExpertiseServiceImpl(ExpertiseRepository expertiseRepository) {
        this.expertiseRepository = expertiseRepository;
    }

    @Override
    public void insert(Expertise expertise) {
        this.expertiseRepository.save(expertise);
    }

    @Override
    public List<Expertise> getAllExpertises() {
        return this.expertiseRepository.findAll();
    }

    @Override
    public void deleteById(String expertiseId) {
        this.expertiseRepository.deleteById(expertiseId);
    }

    @Override
    public void update(String expertiseId,Expertise expertise) {
        Expertise updateExpertise=this.expertiseRepository.findExpertiseById(expertiseId)
                .orElseThrow(()-> new NotFoundException("Expertise by "+expertiseId+" id has not found."));
        updateExpertise.setExpertisePart(expertise.getExpertisePart());
        this.expertiseRepository.save(updateExpertise);
    }

    @Override
    public Expertise getExpertiseById(String expertiseId) {
        return this.expertiseRepository.findExpertiseById(expertiseId)
                .orElseThrow(()-> new NotFoundException("Expertise by "+expertiseId+" id has not found."));
    }
}
