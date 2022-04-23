package com.example.meyok.Repository;

import com.example.meyok.Model.Kind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KindRepository extends JpaRepository<Kind,String> {
}
