package com.inspection.healthportal;

public class User {
    private Long id;
    private String name;
    private String email;

    // Constructor
    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters (used to read values)
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

