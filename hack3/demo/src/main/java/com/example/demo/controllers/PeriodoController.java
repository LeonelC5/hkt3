package com.example.demo.controllers;
import com.example.demo.domain.Periodo;
import com.example.demo.repository.PeriodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/periodos")
public class PeriodoController {


    @Autowired
    private PeriodoRepository periodoRepository;
    
    @GetMapping
    public ResponseEntity<List<Periodo>>getPeriodos(){
        List<Periodo> periodos = periodoRepository.findAll();
        return new ResponseEntity<>(periodos, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Periodo> addPeriodo(@RequestBody Periodo periodo ){
        Periodo newPeriodo = periodoRepository.save(periodo);
        return new ResponseEntity<>(newPeriodo, HttpStatus.CREATED);

    }
}