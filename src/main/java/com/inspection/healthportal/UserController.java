package com.inspection.healthportal;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private final List<User> users = new ArrayList<>();

    public UserController() {
        users.add(new User(1L, "Alice", "alice@example.com"));
        users.add(new User(2L, "Bob", "bob@example.com"));
    }

    @GetMapping("/api/users")
    public List<User> getAllUsers() {
        return users;
    }
    @PostMapping("/api/users")
    public void addUser(@RequestBody User user) {
    users.add(user);
   }    // ✅ Step 2: We will add POST /api/users here in the next step
}
    