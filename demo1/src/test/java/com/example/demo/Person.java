package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //применяется для определения области видимости
// (scope) бина в контейнере Spring. Область видимости определяет, как
// долго будет существовать экземпляр бина и когда он будет создаваться в
// контексте приложения.
public class Person {

    public Person(){
        System.out.println("Бин создан");
    }
}
