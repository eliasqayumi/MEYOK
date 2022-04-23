package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.Task;
import com.example.meyok.Repository.TaskRepository;
import com.example.meyok.Service.TaskService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void insert(Task task) {
        this.taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTask() {
        return this.taskRepository.findAll();
    }

    @Override
    public void deleteById(String taskId) {
        this.taskRepository.deleteById(taskId);
    }

    @Override
    public void update(String taskId, Task task) {
        Task updateTask = this.taskRepository.findTaskById(taskId)
                .orElseThrow(() -> new NotFoundException("Task by " + taskId + " has not found"));
        updateTask.setTask(task.getTask());
        this.taskRepository.save(updateTask);
    }

    @Override
    public Task getTaskById(String taskId) {
        return this.taskRepository.findTaskById(taskId)
                .orElseThrow(() -> new NotFoundException("Task by " + taskId + " has not found"));
    }
}
