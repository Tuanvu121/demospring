package com.example.demo.dao;

import com.example.demo.entity.compositekey.Book;
import com.example.demo.entity.compositekey.BookId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, BookId> {
}
