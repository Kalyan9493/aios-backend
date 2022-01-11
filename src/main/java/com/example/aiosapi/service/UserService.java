package com.example.aiosapi.service;

import com.example.aiosapi.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User save(User user);
}
