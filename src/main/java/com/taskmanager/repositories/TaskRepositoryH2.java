package com.taskmanager.repositories;

import com.taskmanager.entities.Task;
import org.bson.types.ObjectId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepositoryH2 extends JpaRepository<Task, Long> {
    public List<Task> findAll();
}
