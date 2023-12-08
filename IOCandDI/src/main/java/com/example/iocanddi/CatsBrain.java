package com.example.iocanddi;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "cat")
@Primary
public class CatsBrain implements Brain {

    @Override
    public void think() {
        System.out.println("Cat's Brain");
    }

}