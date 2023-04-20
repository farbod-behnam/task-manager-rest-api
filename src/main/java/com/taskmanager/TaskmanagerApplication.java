package com.taskmanager;

import com.taskmanager.entity.Meal;
import com.taskmanager.service.MealService;
import com.taskmanager.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.math.BigDecimal;
import java.util.stream.IntStream;


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
//@SpringBootApplication
public class TaskmanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskmanagerApplication.class, args);
    }

    @Bean
    @Profile("!test")
    CommandLineRunner run(MealService mealService) {
        return (args) -> {
//            IntStream.rangeClosed(1,4)
//                    .mapToObj(i -> {
//                        Task task = new Task();
//                        task.setText("text with number: "+i);
//                        return task;
//                    })
//                    .forEach(taskService::create);

            Meal meal = createMeal("Sushi", "Finest fish and veggies", new BigDecimal("22.99"));
            mealService.create(meal);
            meal = createMeal("Schnitzel", "A german specialty!", new BigDecimal("16.5"));
            mealService.create(meal);
            meal = createMeal("Barbecue Burger", "American, raw, meat", new BigDecimal("12.99"));
            mealService.create(meal);
            meal = createMeal("Green Bowl", "Healthy...and green...", new BigDecimal("18.99"));
            mealService.create(meal);
        };
    }

    private Meal createMeal(String name, String description, BigDecimal price) {
        Meal meal = new Meal();
        meal.setName(name);
        meal.setDescription(description);
        meal.setPrice(price);
        return meal;
    }

}
