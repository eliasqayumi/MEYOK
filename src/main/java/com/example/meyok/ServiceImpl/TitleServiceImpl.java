package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.Title;
import com.example.meyok.Repository.TitleRepository;
import com.example.meyok.Service.TitleService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TitleServiceImpl implements TitleService {
    private TitleRepository titleRepository;

    public TitleServiceImpl(TitleRepository titleRepository) {
        this.titleRepository = titleRepository;
    }

    @Override
    public void insert(Title title) {
        this.titleRepository.save(title);
    }

    @Override
    public List<Title> getAllTitle() {
        return this.titleRepository.findAll();
    }

    @Override
    public void deleteById(String titleId) {
        this.titleRepository.deleteById(titleId);
    }

    @Override
    public void update(String titleId,Title title) {
        Title updateTitle=this.titleRepository.findTitleById(titleId)
                .orElseThrow(()->new NotFoundException("Title by "+titleId+" id has not found."));
        updateTitle.setTitle(title.getTitle());
        this.titleRepository.save(updateTitle);

    }

    @Override
    public Title getTitleById(String titleId) {
        return this.titleRepository.findTitleById(titleId)
                .orElseThrow(()->new NotFoundException("Title by "+titleId+" id has not found."));
    }
}
