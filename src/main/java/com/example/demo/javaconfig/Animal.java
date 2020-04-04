package com.example.demo.javaconfig;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Animal {
    private String name = "dog";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
