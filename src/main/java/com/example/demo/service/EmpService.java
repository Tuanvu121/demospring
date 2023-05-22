package com.example.demo.service;

import com.example.demo.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public interface EmpService {
    List<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
    void addEmployee();
    void deleteAllData();
    List<Employee> findByFirstName();
    Employee findByLastName();
}
