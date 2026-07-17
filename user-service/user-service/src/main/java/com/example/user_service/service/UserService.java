package com.example.user_service.service;

import com.example.user_service.dto.UserDto;
import com.example.user_service.model.User;

public interface UserService {
    UserDto saveUser(UserDto userDto);
    UserDto getUserById(Long id);
}
