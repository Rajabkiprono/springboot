package org.example;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users") // All URLs will start with /api/users
public class api {

    // This acts as our "Fake Database"
    private List<user> userDatabase = new ArrayList<>();

    // 1. GET all users: http://localhost:8080/api/users
    @GetMapping
    public List<user> getAllUsers() {
        return userDatabase;
    }

    // 2. POST a new user: http://localhost:8080/api/users
    // Use JSON Body: {"name": "Alex", "email": "alex@gmail.com"}
    @PostMapping
    public String createUser(@RequestBody user user) {
        userDatabase.add(user);
        return "User " + user.getName() + " added successfully! Total users: " + userDatabase.size();
    }
}