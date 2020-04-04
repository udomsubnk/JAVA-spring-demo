package com.example.demo.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Human human = context.getBean(Human.class);
        Human human2 = context.getBean(Human.class);
        System.out.println("Is singleton? (human == human2) : " + (human == human2));

        Animal animal = context.getBean(Animal.class);
        Animal animal2 = context.getBean(Animal.class);
        System.out.println("Is singleton? (animal == animal2) : " + (animal == animal2));
    }
}
