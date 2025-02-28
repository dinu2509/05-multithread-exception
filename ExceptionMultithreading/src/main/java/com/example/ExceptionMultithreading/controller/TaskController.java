package com.example.ExceptionMultithreading.controller;

import com.example.ExceptionMultithreading.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/start-task")
    public String startTask() {
        taskService.executeTask();
        return "Task has been started!";
    }
    @GetMapping("/exception")
    public String exceptionExample() {
        throw new RuntimeException("Something went wrong!");
    }
}
