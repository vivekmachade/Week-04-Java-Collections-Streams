package com.generics.resume_screening_system;

// Class ProductManager Which extends superclass Jobrole
public class ProductManager extends JobRole {
    // constructor
    public ProductManager(String candidateName, int experienceYears) {
        // super calling superclass constructor
        super(candidateName, experienceYears);
    }

    // toString methode for result display if object printing in code
    @Override
    public String requiredSkills() {
        return "Required Skills: Market Research, Agile, UX, Business Strategy";
    }
}