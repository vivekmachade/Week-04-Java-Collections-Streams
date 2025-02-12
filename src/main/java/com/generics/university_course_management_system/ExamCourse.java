package com.generics.university_course_management_system;

// Taking class ExamCourse Which Extend Class CouseType
public class ExamCourse extends CourseType{
    private int examWeightage;

    // Constructor
    public ExamCourse(String courseName, String instructor, int examWeightage) {
        super(courseName, instructor);
        this.examWeightage = examWeightage;
    }

    //  Taking toString method in Generics
    @Override
    public <T> T getCourseDetail(){
        return (T) ("Exam Weightage : " + examWeightage);
    }
}
