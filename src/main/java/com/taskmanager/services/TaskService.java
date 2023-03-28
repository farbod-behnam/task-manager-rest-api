package com.taskmanager.services;

import com.taskmanager.entities.Task;
import com.taskmanager.repositories.TaskRepositoryH2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepositoryH2 taskRepository;

    @Autowired
    public TaskService(TaskRepositoryH2 taskRepository) {
        this.taskRepository = taskRepository;
    }


    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task create(Task task) {
        return taskRepository.save(task);
    }
}
