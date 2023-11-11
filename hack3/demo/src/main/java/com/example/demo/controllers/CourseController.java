package com.example.demo.controllers;
import com.example.demo.domain.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {


    @Autowired
    private CourseRepository courseRepository;
    
    @GetMapping
    public ResponseEntity<List<Course>>getCourses(){
        List<Course> courses = courseRepository.findAll();
        return new ResponseEntity<>(courses, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Course> addCourse(@RequestBody Course course ){
        Course newCourse = courseRepository.save(course);
        return new ResponseEntity<>(newCourse, HttpStatus.CREATED);

    }
}