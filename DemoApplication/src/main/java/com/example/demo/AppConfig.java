package com.example.demo;
import com.example.demo.User;

import com.example.demo.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Address address() {
        return new Address("New York", "USA");
    }

    @Bean
    public User user(Address address) { // Inject the Address bean
        return new User("John Doe", address);
    }
}