package com.taskmanager.controllers;

import com.taskmanager.entities.Task;
import com.taskmanager.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/api/tasks")
    public ResponseEntity<List<Task>> getTasks() {
        List<Task> tasks = taskService.findAll();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @PostMapping("/api/tasks")
    public ResponseEntity<Task> postTask(@RequestBody Task task) {
        Task createdTask = taskService.create(task);
        return new ResponseEntity<>(createdTask, HttpStatus.OK);
    }
}
