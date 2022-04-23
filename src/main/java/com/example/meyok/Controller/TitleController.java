package com.example.meyok.Controller;

import com.example.meyok.Model.Title;
import com.example.meyok.ServiceImpl.TitleServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("title")
public class TitleController {
    private TitleServiceImpl titleService;

    public TitleController(TitleServiceImpl titleService) {
        this.titleService = titleService;
    }

    @GetMapping
    public List<Title> getAllTitle() {
        return this.titleService.getAllTitle();
    }

    @GetMapping("/{id}")
    public Title getTitleById(@PathVariable("id") String titleId) {
        return this.titleService.getTitleById(titleId);
    }

    @PostMapping
    public void insert(@RequestBody Title title) {
        this.titleService.insert(title);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String titleId, @RequestBody Title title) {
        this.titleService.update(titleId, title);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String titleId) {
        this.titleService.deleteById(titleId);
    }
}