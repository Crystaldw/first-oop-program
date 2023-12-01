package de.telran.firstspringproject;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class BookController {
    private List<Book> books = new ArrayList<>();

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


    @PostMapping(value = "/book/add")
    public void addNewBook(@RequestBody Book book) {
        books.add(book);
    }

    @DeleteMapping(value = "/book/{id}")
    public void deleteBook(@PathVariable(value = "id") Integer id) {
        int number = id;
        books.remove(number);
    }

    @PutMapping(value = "/book/{id}")
    public void updateBook(@PathVariable(value = "id") Integer id, @RequestBody Book book) {
        books.set(id, book);
    }
}