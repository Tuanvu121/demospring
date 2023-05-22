package com.example.demo.service.onetoone;

import com.example.demo.entity.onetoone.Address;
import com.example.demo.entity.onetoone.People;
import com.example.demo.dao.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleServiceImpl implements PeopleService{
    @Autowired
    PeopleRepository peopleRepository;
    @Override
    public void addPeople() {
        People people_1 = new People("Vu A", "11111");
        People people_2 = new People("Vu B", "2222");
        Address address_1 = new Address("Duong 1", "Ha Noi");
        Address address_2 = new Address("Duong 2", "Nam Dinh");
        people_1.setAddress(address_1);
        people_2.setAddress(address_2);
        peopleRepository.save(people_1);
        peopleRepository.save(people_2);
    }

    @Override
    public People findPeopleById(Long id) {
        return null;
    }
}
