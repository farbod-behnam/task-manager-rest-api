package com.taskmanager.controller;

import com.taskmanager.entity.Meal;
import com.taskmanager.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MealController {

    private final MealService mealService;

    @Autowired
    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping("/api/meals")
    public ResponseEntity<List<Meal>> getMeals() {
        List<Meal> meals = mealService.findAll();
        return new ResponseEntity<>(meals, HttpStatus.OK);
    }
}
