package com.example.demo.controller;

import com.example.demo.entity.manytomany.Student;
import com.example.demo.entity.onetomany.Cart;
import com.example.demo.service.manytomany.StudentService;
import com.example.demo.service.manytomany.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;
    @GetMapping("/addStudent")
    public void home(){
        studentService.addStudent();
    }

    @GetMapping("/getStudent/{id}")
    public Student getCartById(@PathVariable long id){
        return  studentService.findStudentById(id);
    }
}
