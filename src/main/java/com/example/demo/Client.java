package com.example.demo;

public class Client {

    public static void main(String[] args) {

        Dependency dependency = new Dependency();
        dependency.setName("Hi new Dependency");
        Hello hello = new Hello("eiei", dependency);

        System.out.println("======================================");
        System.out.println(hello.getMessage());

        hello.setMessage("Hello, This is Kao");

        System.out.println(hello.getDependency().getName());
        System.out.println("======================================");
    }

}
