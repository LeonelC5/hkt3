package com.example.demo.controllers;
import com.example.demo.domain.CourseAssessmentDetails;
import com.example.demo.repository.CourseAssessmentDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.Optional;

import java.util.List;

@RestController
@RequestMapping("/course_assessment_details")
public class CourseAssessmentDetailsController {

    @Autowired
    private CourseAssessmentDetailsRepository courseAssessmentDetailsRepository;

    @GetMapping
    public ResponseEntity<List<CourseAssessmentDetails>> getACourseAssessmentDetails() {
        List<CourseAssessmentDetails> courseAssessmentDetails = courseAssessmentDetailsRepository.findAll();
        return new ResponseEntity<>(courseAssessmentDetails, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CourseAssessmentDetails> addCourseAssessmentDetails
    (@RequestBody CourseAssessmentDetails courseAssessmentDetails) {
        CourseAssessmentDetails newCourseAssessmentDetails = courseAssessmentDetailsRepository.save(courseAssessmentDetails);
        return new ResponseEntity<>(newCourseAssessmentDetails, HttpStatus.CREATED);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<String> deleteAD(@PathVariable Long id ){
        courseAssessmentDetailsRepository.deleteById(id);
        return new ResponseEntity <>("Deleted",HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseAssessmentDetails>getbyidca(@PathVariable Long id){
        Optional <CourseAssessmentDetails> courseAssessmentDetails = courseAssessmentDetailsRepository.findById(id);
        if (courseAssessmentDetails.isPresent()) {
        CourseAssessmentDetails courseAssessmentDetails_ = courseAssessmentDetails.get();
        return new ResponseEntity<>(courseAssessmentDetails_, HttpStatus.OK);
    } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    }
}
