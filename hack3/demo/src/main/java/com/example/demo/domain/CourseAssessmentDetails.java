package com.example.demo.domain;
import jakarta.persistence.*;

@Entity
@Table(name ="courseassessmentdetails")
public class CourseAssessmentDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String score;

    private String section;

    @OneToOne
    @JoinColumn(name ="student_id")
    private Student student;

    @OneToOne
    @JoinColumn(name="professor_id")
    private Professor professor;

    @OneToOne
    @JoinColumn(name ="course_assessment_id")
    private CourseAssessment courseAssessment;


    private String sectionGroup;

    public CourseAssessmentDetails(){

    }

    public CourseAssessmentDetails( String score, String section, Student student, Professor professor,
            CourseAssessment courseAssessment, String sectionGroup) {
      
        this.score = score;
        this.section = section;
        this.student = student;
        this.professor = professor;
        this.courseAssessment = courseAssessment;
        this.sectionGroup = sectionGroup;
    }

    public Long getId() {
        return id;
    }

    public String getScore() {
        return score;
    }

    public String getSection() {
        return section;
    }

    public Student getStudent() {
        return student;
    }

    public Professor getProfessor() {
        return professor;
    }

    public CourseAssessment getCourseAssessment() {
        return courseAssessment;
    }

    public String getSectionGroup() {
        return sectionGroup;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setCourseAssessment(CourseAssessment courseAssessment) {
        this.courseAssessment = courseAssessment;
    }

    public void setSectionGroup(String sectionGroup) {
        this.sectionGroup = sectionGroup;
    }

}
