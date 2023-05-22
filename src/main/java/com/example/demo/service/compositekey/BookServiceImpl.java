package com.example.demo.service.compositekey;

import com.example.demo.entity.compositekey.Book;
import com.example.demo.entity.compositekey.BookId;
import com.example.demo.dao.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    BookRepository bookRepository;

    @Override
    public void addBook() {
        bookRepository.save(new Book(new BookId(1, 1), "a"));
        bookRepository.save(new Book(new BookId(1, 2), "b"));
        bookRepository.save(new Book(new BookId(3, 3), "c"));
        bookRepository.save(new Book(new BookId(4, 4), "d"));
    }

    @Override
    public ArrayList<Book> findAllBook() {
        return (ArrayList<Book>) bookRepository.findAll();
    }

    @Override
    public Book findAllBookByID(BookId id) {
        Optional<Book> opt = bookRepository.findById(id);
        if (opt.isPresent())
            return opt.get();
        else
            return null;

    }
}
