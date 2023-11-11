package com.example.demo.domain;
import jakarta.persistence.*;

@Entity
@Table (name="periodos")
public class Periodo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name ="name ")
    private String name;

    private String code;

    @OneToOne(mappedBy = "periodo")
    private CourseAssessment courseAssessment;
  

    public Periodo(){

    }

    public Periodo(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    

    
}
