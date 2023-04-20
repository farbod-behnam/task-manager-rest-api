package com.taskmanager.repository;

import com.taskmanager.dao.TaskDaoH2;
import com.taskmanager.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public class TaskRepositoryH2Impl implements Repository<Task> {

    private final TaskDaoH2 taskDaoH2;

    @Autowired
    public TaskRepositoryH2Impl(TaskDaoH2 taskDaoH2) {
        this.taskDaoH2 = taskDaoH2;
    }

    @Override
    public List<Task> findAll() {
        return taskDaoH2.findAll();
    }

    @Override
    public Task findById(Long id) {
        return null;
    }

    @Override
    public Task create(Task task) {
        return taskDaoH2.save(task);
    }

    @Override
    public Task update(Task task) {
        return null;
    }

    @Override
    public void delete(Task task) {

    }
}
