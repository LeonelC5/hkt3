package com.example.demo.domain;
import jakarta.persistence.*;

@Entity
@Table (name="students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    @Column
    private String name;
    
    @Column
    private String email;

    @Column(name ="code")
    private String code;

    @OneToOne(mappedBy = "student")
    private CourseAssessmentDetails courseAssessmentDetails;
  
  
    public Student(){

    }

    public Student(String name, String email, String code) {
        this.name = name;

        this.email = email;
        this.code= code;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setCode(String code) {
        this.code = code;
    }
 


}


