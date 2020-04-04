package com.example.demo.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class Human {
    private String name = "Udomsub Naikorn";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
