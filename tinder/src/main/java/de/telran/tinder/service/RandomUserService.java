package de.telran.tinder.service;

import de.telran.tinder.User;
import de.telran.tinder.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Service //  это аннотация в Spring Framework, которая используется для пометки
// класса как сервиса. Сервисы в Spring обычно содержат бизнес-логику и предоставляют
// сервисные операции для других компонентов приложения.
public class RandomUserService implements UserService {

    @Override
    public User getNewUser(){
        List<User> users = new ArrayList<>();
        User firstUser = new User(1, "Petr", 100, "Просто Петр");
        User secondUser = new User(2, "Anna", 150, "Люблю щенков");
        User thirdUser = new User(3, "Pavel", 200, "Нееавижу щенков");

        users.add(firstUser);
        users.add(secondUser);
        users.add(thirdUser);

        Random random = new Random();
        int randomNumber = random.nextInt(3);
        return users.get(randomNumber);
    }
}
