package com.example.demo.domain;
import jakarta.persistence.*;


@Entity
@Table(name ="course_types")
public class CourseType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (name ="name")
    private String name;

    @OneToOne(mappedBy = "courseType")
    private Course course;
  


    public CourseType(){

    }

    public CourseType( String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
