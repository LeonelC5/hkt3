package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.CourseAssessment;

public  interface  CourseAssessmentRepository extends JpaRepository<CourseAssessment,Long>{
    
}
