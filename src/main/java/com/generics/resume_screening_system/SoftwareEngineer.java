package com.generics.resume_screening_system;

// Taking class SoftwareEngineer Which extends Jobrole superclass
public class SoftwareEngineer extends JobRole {
    // constructor
    public SoftwareEngineer(String candidateName, int experienceYears) {
        // super calling superclass constructor
        super(candidateName, experienceYears);
    }
   // toString method for display result
    @Override
    public String requiredSkills() {
        return "Required Skills: Java, Python, Data Structures, Algorithms";
    }
}