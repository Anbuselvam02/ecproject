package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {
    public static void main(String[] args) {
        // Load the Spring context using Java configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the UserService bean
        UserService userService = context.getBean(UserService.class);

        // Use the service
        userService.printUserDetails();
    }
}