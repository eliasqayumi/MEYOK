package com.example.meyok.Controller;

import com.example.meyok.Model.Expertise;
import com.example.meyok.ServiceImpl.ExpertiseServiceImpl;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("expertise")
public class ExpertiseController {
    private ExpertiseServiceImpl expertiseService;

    public ExpertiseController(ExpertiseServiceImpl expertiseService) {
        this.expertiseService = expertiseService;
    }

    @GetMapping
    public List<Expertise> getAllExpertise() {
        return this.expertiseService.getAllExpertises();
    }

    @GetMapping("/{id}")
    public Expertise getExpertiseById(@PathVariable("id") String expertiseId) {
        return this.expertiseService.getExpertiseById(expertiseId);
    }

    @PostMapping
    public void insert(@RequestBody Expertise expertise) {
        this.expertiseService.insert(expertise);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String expertiseId, @RequestBody Expertise expertise) {
        this.expertiseService.update(expertiseId, expertise);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String expertiseId) {
        this.expertiseService.deleteById(expertiseId);
    }
}