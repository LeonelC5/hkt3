package com.example.demo.controllers;
import com.example.demo.domain.CourseAssessment;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.CourseAssessmentRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/course_assessment")
public class CourseAssessmentController {

    @Autowired
    private CourseAssessmentRepository courseAssessmentRepository;

    @GetMapping
    public ResponseEntity<List<CourseAssessment>> getCourseAssessmentDetails() {
        List<CourseAssessment> courseAssessment= courseAssessmentRepository.findAll();
        return new ResponseEntity<>(courseAssessment, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CourseAssessment> addCourseAssessmentDetails(@RequestBody CourseAssessment courseAssessment) {
        CourseAssessment newCourseAssessment = courseAssessmentRepository.save(courseAssessment);
        return new ResponseEntity<>(newCourseAssessment, HttpStatus.CREATED);

    }
     
}
