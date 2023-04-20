package com.taskmanager.dao;

import com.taskmanager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskDaoH2 extends JpaRepository<Task, Long> {
}
