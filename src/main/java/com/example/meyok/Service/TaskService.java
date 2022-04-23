package com.example.meyok.Service;

import com.example.meyok.Model.Task;

import java.util.List;

public interface TaskService {
    void insert(Task task);
    List<Task> getAllTask();
    void deleteById(String taskId);
    void update(Task task);
    Task getTaskById(String taskId);
}
