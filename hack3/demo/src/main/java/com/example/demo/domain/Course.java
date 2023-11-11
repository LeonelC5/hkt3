package com.example.demo.domain;
import jakarta.persistence.*;
//import com.example.demo.domain.CourseType;

@Entity
@Table(name="courses")

public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name ="name ")
    private String name;

    @Column(name ="credits")
    private Integer credits;

    private String code;
    private String HRGroup;
    private Integer cycle;
    private String  VRGroup;

    @OneToOne(mappedBy = "course")
    private CourseAssessment courseAssessment;
  

    @OneToOne
    @JoinColumn(name ="course_type_id")
    private CourseType courseType;
    
    public Course (){

    }

    public Course( String name,Integer  credits, String code, String hRGroup, Integer cycle, String vRGroup) {
        this.name = name;
        this.credits = credits;
        this.code = code;
        HRGroup = hRGroup;
        this.cycle = cycle;
        VRGroup = vRGroup;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCredits() {
        return credits;
    }

    public String getCode() {
        return code;
    }

    public String getHRGroup() {
        return HRGroup;
    }

    public Integer getCycle() {
        return cycle;
    }

    public String getVRGroup() {
        return VRGroup;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setHRGroup(String hRGroup) {
        HRGroup = hRGroup;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    public void setVRGroup(String vRGroup) {
        VRGroup = vRGroup;
    }
    
    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }
    

}
