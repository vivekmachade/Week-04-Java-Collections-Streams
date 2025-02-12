package com.generics.resume_screening_system;

import java.util.ArrayList;
import java.util.List;

public class ResumeProcessor {
    // Taking list resumelist
    private List<Resume<? extends JobRole>> resumeList = new ArrayList<>();

    // Adding the element into list
    public void addResume(Resume<? extends JobRole> resume) {
        if (validateResume(resume)) {
            resumeList.add(resume);
        } else {
            System.out.println("Invalid resume: " + resume);
        }
    }

    // Generic method for validation
    public <T extends JobRole> boolean validateResume(Resume<T> resume) {
        // Ensure at least 1 year experience
        return resume.getJobRole().getExperienceYears() >= 1;
    }
   // Display result
    public void displayResumes() {
        System.out.println("Processed Resumes:");
        for (Resume<? extends JobRole> resume : resumeList) {
            System.out.println(resume);
        }
    }
}