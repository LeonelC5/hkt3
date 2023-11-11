package com.example.demo.controllers;
import com.example.demo.domain.Professor;
import com.example.demo.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professors")
public class ProfessorController {


    @Autowired
    private ProfessorRepository professorRepository;
    
    @GetMapping
    public ResponseEntity<List<Professor>>getProfessors(){
        List<Professor> professors = professorRepository.findAll();
        return new ResponseEntity<>(professors, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Professor> addProfessor(@RequestBody Professor professor ){
        Professor newProfessor = professorRepository.save(professor);
        return new ResponseEntity<>(newProfessor, HttpStatus.CREATED);

    }
}