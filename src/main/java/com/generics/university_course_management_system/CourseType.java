package com.generics.university_course_management_system;

// Taking Abstract class CourseName
public abstract class CourseType {
    private String courseName;
    private String instructor;

    // Constructor
    public CourseType(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }

    // Getter for courseName and instructor
    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public abstract <T> T getCourseDetail();


    // define the tostring methode to print result
    @Override
    public String toString(){
        return "Course : " + courseName + "\nInstructor : " + instructor + "\nDetails : " + getCourseDetail();
    }
}
