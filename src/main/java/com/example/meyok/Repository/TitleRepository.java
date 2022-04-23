package com.example.meyok.Repository;

import com.example.meyok.Model.Title;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TitleRepository extends JpaRepository<Title,String> {
    Optional<Title> findTitleById(String titleId);

}
