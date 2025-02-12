package com.generics.resume_screening_system;

// Class DataScientist which Extends JobRole Class
public class DataScientist extends JobRole {
    // Constructor
    public DataScientist(String candidateName, int experienceYears) {
        // super calling the superclass constructor
        super(candidateName, experienceYears);
    }
    // toString methode for Display the Result printing object
    @Override
    public String requiredSkills() {
        return "Required Skills: Python, SQL, Machine Learning, Statistics";
    }
}