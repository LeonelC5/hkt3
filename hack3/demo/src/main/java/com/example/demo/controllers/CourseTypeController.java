package com.example.demo.controllers;
import com.example.demo.domain.CourseType;
import com.example.demo.repository.CourseTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coursetypes")
public class CourseTypeController {


    @Autowired
    private CourseTypeRepository courseTypeRepository;
    
    @GetMapping
    public ResponseEntity<List<CourseType>>getCourseTypes(){
        List<CourseType> courseTypes = courseTypeRepository.findAll();
        return new ResponseEntity<>(courseTypes, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<CourseType> addCourseType(@RequestBody CourseType courseType ){
        CourseType newCourseType = courseTypeRepository.save(courseType);
        return new ResponseEntity<>(newCourseType, HttpStatus.CREATED);

    }
}