package com.taskflow.repository;

import com.taskflow.model.Task;
import com.taskflow.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TaskRepository - Data access object for Task entity
 * Provides CRUD operations and custom query methods for Task management
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    
    /**
     * Find all tasks associated with a specific user
     * @param user the user whose tasks are to be retrieved
     * @return List of tasks belonging to the user
     */
    List<Task> findByUser(User user);
}
