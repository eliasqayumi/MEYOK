package com.example.meyok.Controller;

import com.example.meyok.Model.Task;
import com.example.meyok.ServiceImpl.TaskServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("task")
public class TaskController {
    private TaskServiceImpl taskService;

    public TaskController(TaskServiceImpl taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTask() {
        return this.taskService.getAllTask();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable("id") String taskId) {
        return this.taskService.getTaskById(taskId);
    }

    @PostMapping
    public void insert(@RequestBody Task task) {
        this.taskService.insert(task);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String taskId, @RequestBody Task task) {
        this.taskService.update(taskId, task);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String taskId) {
        this.taskService.deleteById(taskId);
    }
}