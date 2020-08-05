package com.example.demo;

public class UsersResponse {
    private int id;
    private String name;

    public UsersResponse(int i, String s) {
        this.id = i;
        this.name = s;
    }

    // POJO (Plain Old Java Object)
    // Getter/Setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
