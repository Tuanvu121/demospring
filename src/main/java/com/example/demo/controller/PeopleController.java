package com.example.demo.controller;

import com.example.demo.entity.manytomany.Student;
import com.example.demo.entity.onetoone.People;
import com.example.demo.service.manytomany.StudentServiceImpl;
import com.example.demo.service.onetoone.PeopleService;
import com.example.demo.service.onetoone.PeopleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class PeopleController {
    @Autowired
    PeopleServiceImpl peopleService;
    @GetMapping("/addPeople")
    public void addPeople(){
        peopleService.addPeople();
    }

    @GetMapping("/getPeople/{id}")
    public People getPeopleById(@PathVariable long id){
        return  peopleService.findPeopleById(id);
    }
}
