package com.taskflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Main entry point for TaskFlowAPI application.
 * This Spring Boot application provides a complete REST API for task management,
 * including user authentication, task CRUD operations, and team management.
 *
 * @author TaskFlow Team
 * @version 1.0.0
 * @since 2024
 */
@SpringBootApplication
@EnableScheduling
public class TaskFlowAPIApplication {

    /**
     * Main method to start the Spring Boot application.
     * Loads application properties from application.yml and initializes all Spring beans.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(TaskFlowAPIApplication.class, args);
    }

}