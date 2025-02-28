package com.example.ExceptionMultithreading.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Async
    public void executeTask() {
        System.out.println("Executing task in thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000); // Simulate a long-running task
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Task interrupted", e);
        }
        System.out.println("Task completed in thread: " + Thread.currentThread().getName());
    }
}
