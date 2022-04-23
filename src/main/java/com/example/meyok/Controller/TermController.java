package com.example.meyok.Controller;

import com.example.meyok.Model.Term;
import com.example.meyok.ServiceImpl.TermServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("term")
public class TermController {
    private TermServiceImpl termService;

    public TermController(TermServiceImpl termService) {
        this.termService = termService;
    }

    @GetMapping
    public List<Term> getAllTerm() {
        return this.termService.getAllTerm();
    }

    @GetMapping("/{id}")
    public Term getTermById(@PathVariable("id") String termId) {
        return this.termService.getTermById(termId);
    }

    @PostMapping
    public void insert(@RequestBody Term term) {
        this.termService.insert(term);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String termId, @RequestBody Term term) {
        this.termService.update(termId, term);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String termId) {
        this.termService.deleteById(termId);
    }
}
