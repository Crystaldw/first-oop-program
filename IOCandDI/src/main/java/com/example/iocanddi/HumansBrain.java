package com.example.iocanddi;

import org.springframework.stereotype.Component;

@Component(value = "human")
public class HumansBrain implements Brain {

    @Override
    public void think() {
        System.out.println("Humans Brain");
    }
}