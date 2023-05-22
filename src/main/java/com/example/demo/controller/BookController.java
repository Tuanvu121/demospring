package com.example.demo.controller;

import com.example.demo.entity.compositekey.Book;
import com.example.demo.entity.compositekey.BookId;
import com.example.demo.service.compositekey.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookServiceImpl bookService;
    @GetMapping("/add")
    public List<Book> getBooks(){
        bookService.addBook();
        return bookService.findAllBook();
    }

    @GetMapping("/findbyid")
    public Book getEmployeeUsingId(@RequestParam(name = "title") Integer title, @RequestParam(name = "lan") Integer lan) {
        return bookService.findAllBookByID(new BookId(title, lan));
    }
}
