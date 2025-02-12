package com.generics.university_course_management_system;

// Taking Researchcourse Class which Extends CourseType
public class ResearchCourse extends CourseType{
    private String researchField;

    // Constructor
    public ResearchCourse(String courseName, String instructor, String researchField) {
        super(courseName, instructor);
        this.researchField = researchField;
    }

    // Taking toString method in Generic
    @Override
    public <T> T getCourseDetail() {
        return (T)("Research Field : " + researchField);
    }
}
