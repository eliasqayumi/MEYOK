package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.Task;
import com.example.meyok.Service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public void insert(Task task) {

    }

    @Override
    public List<Task> getAllTask() {
        return null;
    }

    @Override
    public void deleteById(String taskId) {

    }

    @Override
    public void update(Task task) {

    }

    @Override
    public Task getTaskById(String taskId) {
        return null;
    }
}
