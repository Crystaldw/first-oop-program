package de.telran.tinder;

import de.telran.tinder.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Создается контроллер и управляется спрингом
@RequiredArgsConstructor //это аннотация из библиотеки Lombok, которая автом
// авляет конструктор, использующий все финальные поля (или все поля, если используется
// аннотация
public class UserController {


    private final UserService userService;


    @GetMapping(value = "/show-new-user")
    //это аннотация из Spring Framework, которая используется в контроллерах для маппинга HTTP GET запросов на методы обработки. Она указывает, что метод обработки должен быть вызван, когда происходит HTTP GET запрос на указанный URL.
    public User showNewUser() {
        return userService.getNewUser();
    }

}
