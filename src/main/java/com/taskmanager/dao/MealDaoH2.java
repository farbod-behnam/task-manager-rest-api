package com.taskmanager.dao;

import com.taskmanager.entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MealDaoH2 extends JpaRepository<Meal, Long> {
}
