package com.taskflow.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * TaskCreateRequest - DTO for creating a new task
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskCreateRequest {
    
    private String title;
    private String description;
    private String status;
    private LocalDate dueDate;
    private Long userId;
}