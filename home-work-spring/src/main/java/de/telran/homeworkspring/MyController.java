package de.telran.homeworkspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class MyController {

    @GetMapping(value = "/message")
    public String getMessage() {
        String[] message = {"мы вам не рады", "добро пожаловать"};
        int randomIndex = new Random().nextInt(message.length);
        return message[randomIndex];
    }

}
