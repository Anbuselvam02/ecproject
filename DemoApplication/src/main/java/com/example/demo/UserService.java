package com.example.demo;

import com.example.demo.User;
import org.springframework.stereotype.Service;

@SuppressWarnings("unused")
@Service
public class UserService {
    private User user;

    // Constructor Injection
    public UserService(User user) {
        this.user = user;
    }

    public void printUserDetails() {
        System.out.println("User Details: " + user);
    }
}