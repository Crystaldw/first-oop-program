package de.telran.firstspringproject;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class HelloController {

    private List<Book> books = new ArrayList<>();

    @GetMapping(value = "/book/{id}")
    public Book getBook(@PathVariable(value = "id")Integer id){
        return books.get(id);
    }

    @GetMapping(value = "/hello")
    public String hello() {
        return "Привет, как дела, как жизнь";
    }

    @GetMapping(value = "/add")
    public void add() {
        Random random = new Random();
        int id = random.nextInt();
        Book book = new Book(id, "Чистый код");
        books.add(book);
    }

    @GetMapping(value = "/show")
    public List<Book> show() {
        return books;
    }

    @GetMapping(value = "/calculator")
    public int calculate(@RequestParam(name = "first") Integer a, @RequestParam(name = "second") Integer b) {
        return a + b;
    }

    @GetMapping(value = "/what-is-your-name")
    public String sayYourName(@RequestParam(name = "name") String name, @RequestParam(name = "land")String lang) {
        if(lang.equals("eng")){
            return "Hello, " + name;
        }
        if (lang.equals("rus")){
            return "Привет " + name;
        }
        return "Привет. " + name;
    }

    @PostMapping(value = "/book/add")
    public void addNewBook(@RequestBody Book book){
        books.add(book);
    }

    @DeleteMapping(value = "/book/{id}")
    public void deleteBook(@PathVariable(value = "id")Integer id){
        int number = id;
        books.remove(number);
    }

    @PutMapping(value = "/book/{id}")
    public void updateBook(@PathVariable(value = "id") Integer id, @RequestBody Book book){
    books.set(id, book);
    }
}
