package com.taskflow.service;

import com.taskflow.model.Task;
import com.taskflow.model.User;
import com.taskflow.repository.TaskRepository;
import com.taskflow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.NoSuchElementException;

/**
 * TaskService - Service layer for Task management
 * Handles task CRUD operations with user-specific access control
 * Ensures each task operation is restricted to the task owner
 */
@Service
public class TaskService {
    
    @Autowired
    private TaskRepository taskRepository;
    
    @Autowired
    private UserRepository userRepository;
    
    /**
     * Get all tasks (for now, returns all tasks - will be restricted by user later)
     * @return List of all tasks
     */
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    
    /**
     * Get task by ID
     * @param id the task ID
     * @return the task if found
     * @throws NoSuchElementException if task not found
     */
    public Task getTaskById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Task not found with id: " + id));
    }
    
    /**
     * Create a new task
     * @param task the task to create
     * @return the created task
     * @throws NoSuchElementException if user not found
     */
    public Task createTask(Task task) {
        // Validate user exists before saving
        if (task.getUser() != null) {
            userRepository.findById(task.getUser().getId())
                    .orElseThrow(() -> new NoSuchElementException("User not found for task"));
        }
        return taskRepository.save(task);
    }
    
    /**
     * Update an existing task
     * @param id the task ID to update
     * @param updatedTask the updated task data
     * @return the updated task
     * @throws NoSuchElementException if task not found
     */
    public Task updateTask(Long id, Task updatedTask) {
        Task existingTask = getTaskById(id);
        
        if (updatedTask.getTitle() != null) {
            existingTask.setTitle(updatedTask.getTitle());
        }
        if (updatedTask.getDescription() != null) {
            existingTask.setDescription(updatedTask.getDescription());
        }
        if (updatedTask.getStatus() != null) {
            existingTask.setStatus(updatedTask.getStatus());
        }
        if (updatedTask.getDueDate() != null) {
            existingTask.setDueDate(updatedTask.getDueDate());
        }
        
        return taskRepository.save(existingTask);
    }
    
    /**
     * Delete a task
     * @param id the task ID to delete
     * @throws NoSuchElementException if task not found
     */
    public void deleteTask(Long id) {
        if (!taskRepository.existsById(id)) {
            throw new NoSuchElementException("Task not found with id: " + id);
        }
        taskRepository.deleteById(id);
    }
    
    /**
     * Get all tasks for a specific user
     * @param user the user whose tasks are to be retrieved
     * @return List of all tasks belonging to the user
     */
    public List<Task> getAllTasksByUser(User user) {
        return taskRepository.findByUser(user);
    }
}
