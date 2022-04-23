package com.example.meyok.Repository;

import com.example.meyok.Model.Task;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task,String> {
    Optional<Task> findTaskById(String taskId);
}
