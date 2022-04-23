package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.Kind;
import com.example.meyok.Repository.KindRepository;
import com.example.meyok.Service.KindService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KindServiceImpl implements KindService {
    private KindRepository kindRepository;

    public KindServiceImpl(KindRepository kindRepository) {
        this.kindRepository = kindRepository;
    }

    @Override
    public void insert(Kind kind) {
        this.kindRepository.save(kind);
    }

    @Override
    public List<Kind> getAllKind() {
        return this.kindRepository.findAll();
    }

    @Override
    public void deleteById(String kindId) {
        this.kindRepository.deleteById(kindId);
    }

    @Override
    public void update(String kindId, Kind kind) {
        Kind updateKind=this.kindRepository.findKindById(kindId).orElseThrow(()->new NotFoundException("Kind by "+kindId+" id has not found."));
        updateKind.setKind(kind.getKind());
        this.kindRepository.save(updateKind);
    }

    @Override
    public Kind getKindById(String kindId) {
        return this.kindRepository.findKindById(kindId).orElseThrow(()->new NotFoundException("Kind by "+kindId+" id has not found."));
    }
}
