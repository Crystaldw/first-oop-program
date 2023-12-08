package de.telran.tinder.service;

import de.telran.tinder.User;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Primary //это аннотация в Spring Framework, которая используется для указания,
// что если есть несколько кандидатов для внедрения зависимости, то должен быть
// выбран именно тот бин, помеченный как первичный.
@Service //  это аннотация в Spring Framework, которая используется для
// пометки класса как сервиса. Сервисы в Spring обычно содержат бизнес-логику и
// предоставляют сервисные операции для других компонентов приложения.
public class TopRatingUserService implements UserService{

    @Override
    public User getNewUser() {
        List<User> users = new ArrayList<>();
        User firstUser = new User(1, "Petr", 100, "Просто Петр");
        User secondUser = new User(2, "Anna", 150, "Люблю щенков");
        User thirdUser = new User(3, "Pavel", 200, "Нееавижу щенков");

        users.add(firstUser);
        users.add(secondUser);
        users.add(thirdUser);

        int maxRaiting = 0;
        User bestUser = null;

        for(User user: users){
            if (user.getRating()>maxRaiting){
                maxRaiting = user.getRating();
                bestUser = user;
            }
        }
        return  bestUser;
    }
}
