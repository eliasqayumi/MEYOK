package com.example.meyok.Controller;

import com.example.meyok.Model.Kind;
import com.example.meyok.ServiceImpl.KindServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("kind")
public class KindController {
    private KindServiceImpl kindService;

    public KindController(KindServiceImpl KindService) {
        this.kindService = KindService;
    }

    @GetMapping
    public List<Kind> getAllKind() {
        return this.kindService.getAllKind();
    }

    @GetMapping("/{id}")
    public Kind getKindById(@PathVariable("id") String kindId) {
        return this.kindService.getKindById(kindId);
    }

    @PostMapping
    public void insert(@RequestBody Kind kind) {
        this.kindService.insert(kind);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String kindId, @RequestBody Kind kind) {
        this.kindService.update(kindId, kind);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String kindId) {
        this.kindService.deleteById(kindId);
    }
}