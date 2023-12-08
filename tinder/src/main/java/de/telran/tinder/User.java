package de.telran.tinder;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //аннотация из Lombok, которая автоматически создает методы toString(), hashCode(), equals() и геттеры/сеттеры для всех полей класса.
@AllArgsConstructor //это аннотация из библиотеки Lombok, которая автоматически создает конструктор, принимающий все поля класса в качестве параметров. Это особенно полезно при работе с классами, у которых есть много полей, и требуется создание конструктора, инициализирующего все эти поля.
public class User {

    private long id;

    private String name;

    private int rating;

    private String description;


}
