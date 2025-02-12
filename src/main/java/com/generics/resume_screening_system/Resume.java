package com.generics.resume_screening_system;

// Taking Resume class which Generic dataType extend JobRole
public class Resume<T extends JobRole> {
    private T jobRole;

    // Constructor
    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    // Getter for jobRole
    public T getJobRole() {
        return jobRole;
    }

    // toString method for printing result only printing object
    @Override
    public String toString() {
        return "Resume of " + jobRole.getCandidateName() + " for " + jobRole.getClass().getSimpleName() + "\n" + jobRole.requiredSkills();
    }
}