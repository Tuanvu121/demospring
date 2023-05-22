package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    EmpServiceImpl empServiceImpl;

    @PostMapping("/add")
    public ResponseEntity<?> add() {
        System.out.println("start add data");
        empServiceImpl.addEmployee();
        return ResponseEntity.ok("Done");
    }

    @GetMapping("/findall")
    public ResponseEntity<?> getAllEmployee() {
        List<Employee> employees = empServiceImpl.findAllEmployee();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/customFirst")
    public ResponseEntity<?> getCustomFirstName() {
        List<Employee> employees = empServiceImpl.findByFirstName();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/customLast")
    public ResponseEntity<?> getCustomLastName() {
        Employee employee = empServiceImpl.findByLastName();
        return ResponseEntity.ok(employee);
    }

    @GetMapping("/findbyid/{id}")
    public Employee getEmployeeUsingId(@PathVariable long id) {
        return empServiceImpl.findAllEmployeeByID(id);
    }

    @DeleteMapping("/delete")
    public void delete() {
        empServiceImpl.deleteAllData();
    }
}
