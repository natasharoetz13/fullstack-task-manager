package com.natasha.backend.controller;

import com.natasha.backend.dto.TaskDTO;
import com.natasha.backend.entity.Task;
import com.natasha.backend.service.TaskService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public Page<Task> getTasks(Pageable pageable) {
        return taskService.getAllTasks(pageable);
    }

    @PostMapping
    public Task
    createTask(@Valid @RequestBody TaskDTO taskDTO) {
        Task task = new Task();
        task.setTitle(taskDTO.getTitle());
        task.setCompleted(taskDTO.isCompleted());
        return taskService.createTask(task);
    }

    @PutMapping("/{id}")
    public Task
    updateTask(@PathVariable Long id, @RequestBody Task updatedTask) {
        return taskService.updateTask(id, updatedTask);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}
