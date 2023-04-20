package com.taskmanager.service;

import com.taskmanager.entity.Task;
import com.taskmanager.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final Repository<Task> taskRepository;

    @Autowired
    public TaskService(Repository<Task> taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task create(Task task) {
        return taskRepository.create(task);
    }
}
