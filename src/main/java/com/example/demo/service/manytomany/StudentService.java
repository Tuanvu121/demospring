package com.example.demo.service.manytomany;

import com.example.demo.entity.manytomany.Student;
import com.example.demo.entity.onetomany.Cart;

public interface StudentService {
    void addStudent();
    Student findStudentById(Long id);
}
