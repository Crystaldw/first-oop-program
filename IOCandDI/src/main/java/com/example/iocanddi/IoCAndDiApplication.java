package com.example.iocanddi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IoCAndDiApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(IoCAndDiApplication.class, args);

        Cat cat = (Cat) applicationContext.getBean("supercat");

        System.out.println(cat);

        cat.playWithBall();
    }

}