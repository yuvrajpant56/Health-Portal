package com.inspection.healthportal; // ✅ This line is missing or incorrect

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloController {

    @GetMapping("/api/hello")
    public String sayHello() {
        return "Hello from backend!";
    }
}


