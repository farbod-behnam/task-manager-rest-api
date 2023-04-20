package com.taskmanager.service;

import com.taskmanager.entity.Meal;
import com.taskmanager.repository.MealRepositoryH2Impl;
import com.taskmanager.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {

    private final Repository<Meal> mealRepository;

    @Autowired
    public MealService(Repository<Meal> mealRepository) {
        this.mealRepository = mealRepository;
    }

    public List<Meal> findAll() {
        return mealRepository.findAll();
    }

    public Meal create(Meal meal) {
        return mealRepository.create(meal);
    }
}
