package com.example.iocanddi;

import org.springframework.stereotype.Component;

@Component (value = "supercat")
public class Cat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(){
        System.out.println("Кощечку создали");
    }
}
