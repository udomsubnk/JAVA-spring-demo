package com.example.demo;

public class Hello {

    private String message  = "Default Message";
    private Dependency dependency = new Dependency();

    public Hello() { }

    public Hello(String message, Dependency dependency) {
        this.message = message;
        this.dependency = dependency;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public Dependency getDependency() {
        return dependency;
    }

    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }
}
