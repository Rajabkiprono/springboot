package org.example;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users") 
public class api {

    
    private List<user> userDatabase = new ArrayList<>();


    @GetMapping
    public List<user> getAllUsers() {
        return userDatabase;
    }

   
    @PostMapping
    public String createUser(@RequestBody user user) {
        userDatabase.add(user);
        return "User " + user.getName() + " added successfully! Total users: " + userDatabase.size();
    }
}
