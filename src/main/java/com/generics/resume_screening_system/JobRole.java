package com.generics.resume_screening_system;

// JobRole class is superclass
public abstract class JobRole {
    private String candidateName;
    private int experienceYears;

    // Constructor
    public JobRole(String candidateName, int experienceYears) {
        this.candidateName = candidateName;
        this.experienceYears = experienceYears;
    }
   // Getter for CandidateName and experienceYears
    public String getCandidateName() {
        return candidateName;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    // Abstract method related to generics
    public abstract String requiredSkills();

    @Override
    public String toString() {
        return candidateName + " - " + experienceYears + " years of experience";
    }
}