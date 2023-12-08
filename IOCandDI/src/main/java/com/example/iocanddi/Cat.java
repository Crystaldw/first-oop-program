package com.example.iocanddi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "supercat") //создает бин (Bean)
public class Cat {

    private String name;

    @Autowired
    @Qualifier(value = "human")
    private Brain brain;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brain getBrain() {
        return brain;
    }

    public void setBrain(Brain brain) {
        this.brain = brain;
    }

    public Cat() {
        System.out.println("Cat is created");
    }

    public void playWithBall() {
        brain.think();
        System.out.println("I am playing with ball");
    }

}