package com.taskmanager.repository;

import com.taskmanager.dao.MealDaoH2;
import com.taskmanager.entity.Meal;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public class MealRepositoryH2Impl implements Repository<Meal> {

    private final MealDaoH2 mealDaoH2;

    @Autowired
    public MealRepositoryH2Impl(MealDaoH2 mealDaoH2) {
        this.mealDaoH2 = mealDaoH2;
    }

    @Override
    public List<Meal> findAll() {
        return mealDaoH2.findAll();
    }

    @Override
    public Meal findById(Long id) {

        Optional<Meal> result = mealDaoH2.findById(id);

        Meal meal;

        if (result.isPresent())
            meal = result.get();
        else
            throw new RuntimeException("Meal with id: [" + id + "] cannot be found");

        return meal;
    }

    @Override
    public Meal create(Meal meal) {
        return mealDaoH2.save(meal);
    }

    @Override
    public Meal update(Meal meal) {
        return null;
    }

    @Override
    public void delete(Meal meal) {

    }
}
