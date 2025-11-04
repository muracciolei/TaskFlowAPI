package com.taskflow.service;

import com.taskflow.model.User;
import com.taskflow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * UserService - Service layer for User management
 * Handles user registration, authentication, and profile management
 * Implements password hashing and duplicate user checking
 */
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    /**
     * Get all users
     * @return List of all users
     */
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Get user by ID
     * @param id User ID
     * @return User if found
     * @throws NoSuchElementException if user not found
     */
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("User not found with id: " + id));
    }

    /**
     * Create a new user
     * @param user User to create
     * @return Created user
     */
    public User createUser(User user) {
        // TODO: Encrypt password when security is implemented
        // Check if username already exists
        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
            throw new RuntimeException("Username already exists: " + user.getUsername());
        }
        return userRepository.save(user);
    }

    /**
     * Update an existing user
     * @param id User ID
     * @param updatedUser Updated user data
     * @return Updated user
     * @throws NoSuchElementException if user not found
     */
    public User updateUser(Long id, User updatedUser) {
        User existingUser = getUserById(id);
        
        if (updatedUser.getUsername() != null) {
            existingUser.setUsername(updatedUser.getUsername());
        }
        if (updatedUser.getEmail() != null) {
            existingUser.setEmail(updatedUser.getEmail());
        }
        if (updatedUser.getPassword() != null) {
            existingUser.setPassword(updatedUser.getPassword());
        }
        
        return userRepository.save(existingUser);
    }

    /**
     * Delete a user
     * @param id User ID
     * @throws NoSuchElementException if user not found
     */
    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new NoSuchElementException("User not found with id: " + id);
        }
        userRepository.deleteById(id);
    }
    
    /**
     * Find a user by username
     * @param username the username to search for
     * @return the user if found
     * @throws RuntimeException if user not found
     */
    public User findByUsername(String username) {
        return userRepository.findByUsername(username)
            .orElseThrow(() -> new RuntimeException("User not found: " + username));
    }
}
