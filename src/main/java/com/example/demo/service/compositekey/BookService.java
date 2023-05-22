package com.example.demo.service.compositekey;

import com.example.demo.entity.compositekey.Book;
import com.example.demo.entity.compositekey.BookId;

import java.util.ArrayList;

public interface BookService {
    void addBook();
    ArrayList<Book> findAllBook();
    Book findAllBookByID(BookId id);
}
