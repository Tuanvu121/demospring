package com.example.demo.dao.CustomRepos;

import com.example.demo.entity.Employee;

import java.util.List;

public interface CustomRepository {
    List<Employee> findByFirstName(String firstName);
}
