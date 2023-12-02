package de.telran.hwspring1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
Создать spring-приложение с контроллером
Создать для него 5 endpoint (входных точек):
 */
@RestController
public class MyController {
    private int counter = 0;
    private List<Integer> counterList = new ArrayList<>();

    //    get /message - случайным образом выбирается фраза из двух "мы вам не рады" и "добро пожаловать"
    @GetMapping(value = "/message")
    public String getMessage() {
        Random random = new Random();
        String[] message = {"Мы вам не рады", "добро пожаловать"};
        int randomMessage = random.nextInt(message.length);
        return message[randomMessage];
    }

//    get /count - увеличить счетчик на один (можно завести поле в классе и изменять его)

    @GetMapping(value = "/count")
    public String getCounter() {
        counter++;
        return "Counter +1";
    }

//    get /info - показать актуальное значение счетчика (в браузере)

    @GetMapping(value = "/info")
    public String getCountInfo() {
        return "Counter = " + counter;
    }

//    get /save-and-reset - записать актуальное значение счетчика в список, обнулить счетчик

    @GetMapping(value = "/save-and-reset")
    public String saveAndResetCounter(){
        counterList.add(counter);
        int counterValue = counter;
        counter = 0;
        return "Counter value " + counterValue + " saved, and the counter is reset";
    }
//    get /list - показать список, в который записывали значения счетчика

    @GetMapping(value = "/list")
    public List<Integer>getCounterList(){
        return counterList;
    }
}
