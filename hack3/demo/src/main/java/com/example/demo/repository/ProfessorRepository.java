package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Professor;

public  interface  ProfessorRepository extends JpaRepository<Professor,Long>{
    
}
