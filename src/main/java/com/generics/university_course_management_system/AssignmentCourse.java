package com.generics.university_course_management_system;

// Taking AssignmentCouse Which extends the CouseType Class
public class AssignmentCourse extends CourseType{
    public int totalAssignments;

    // Constructor to intializing the variable in a class
    public AssignmentCourse(String courseName, String instructor, int totalAssignments) {
        super(courseName, instructor);
        this.totalAssignments = totalAssignments;
    }


    //define the toString methode
    @Override
    public <T> T getCourseDetail() {
        return (T)("Total Assignments : " + totalAssignments);
    }
}
