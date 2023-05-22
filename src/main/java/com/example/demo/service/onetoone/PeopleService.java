package com.example.demo.service.onetoone;

import com.example.demo.entity.onetomany.Cart;
import com.example.demo.entity.onetoone.People;

public interface PeopleService {
    void addPeople();
    People findPeopleById(Long id);
}
