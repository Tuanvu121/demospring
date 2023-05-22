package com.example.demo.service.manytomany;

import com.example.demo.entity.manytomany.Course;
import com.example.demo.entity.manytomany.Student;
import com.example.demo.dao.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    @Override
    public void addStudent() {
        Course courseA = new Course("Course A");
        Course courseB = new Course("Course B");
        Course courseC = new Course("Course B");
        Student studentA = new Student("Student A");
        Student studentB = new Student("Student B");
        List<Course> courses_1 = new ArrayList<>();
        courses_1.add(courseA);
        courses_1.add(courseB);
        List<Course> courses_2 = new ArrayList<>();
        courses_2.add(courseB);
        courses_2.add(courseC);
        studentA.setCourses(courses_1);
        studentB.setCourses(courses_2);
        studentRepository.save(studentA);
        studentRepository.save(studentB);
    }

    @Override
    public Student findStudentById(Long id) {
        Optional<Student> opt = studentRepository.findById(id);
        if (opt.isPresent())
            return opt.get();
        else
            return null;
    }
}
