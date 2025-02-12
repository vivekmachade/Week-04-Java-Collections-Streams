package com.generics.university_course_management_system;

// Taking class cousre and Generic datatype is Extend the CourseType class
public class Course <T extends CourseType>{
    private T courseType;

    // constructor
    public Course(T courseType) {
        this.courseType = courseType;
    }

    // Getter for courseType
    public T getCourseType() {
        return courseType;
    }

    // define the toString methode
    @Override
    public String toString() {
        return "CourseType : " + courseType;
    }
}
