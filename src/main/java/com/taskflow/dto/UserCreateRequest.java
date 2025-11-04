package com.taskflow.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UserCreateRequest - DTO for creating a new user
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateRequest {
    
    private String username;
    private String email;
    private String password;
}