package com.taskmanager;

import com.taskmanager.entities.Task;
import com.taskmanager.services.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.util.stream.IntStream;


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
//@SpringBootApplication
public class TaskmanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskmanagerApplication.class, args);
    }

//    @Bean
//    @Profile("!test")
//    CommandLineRunner run(TaskService taskService) {
//        return (args) -> {
//            IntStream.rangeClosed(1,4)
//                    .mapToObj(i -> {
//                        Task task = new Task();
//                        task.setText("text with number: "+i);
//                        return task;
//                    })
//                    .forEach(taskService::create);
//
//        };
//    }

}
