package com.generics.university_course_management_system;

import java.util.ArrayList;
import java.util.List;

// Taking class CourseCatalog
public class CourseCatalog {
    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    // Adding the course in list
    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    // display courses
    public void displayCourses(){
        System.out.println("List of Courses :-");
        for(Course<? extends CourseType> course : courses){
            System.out.println(course);
        }
    }
}