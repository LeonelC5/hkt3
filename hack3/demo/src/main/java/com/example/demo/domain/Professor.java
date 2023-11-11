package com.example.demo.domain;
import jakarta.persistence.*;
@Entity
@Table (name="professors")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    @Column
    private String name;
    
    @Column
    private String lastName;
    
    @Column
    private String email;

    @Column(name ="fullname ")
    private String fullName;
  
    @OneToOne(mappedBy = "professor")
    private CourseAssessmentDetails courseAssessmentDetails;
  
    public Professor(){

    }

    public Professor(String name, String lastName, String email, String fullName) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
 


}
