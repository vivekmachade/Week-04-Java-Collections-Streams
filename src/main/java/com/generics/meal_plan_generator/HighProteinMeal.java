package com.generics.meal_plan_generator;

// Taking HighProteinMeal which implements interface mealplan
public class HighProteinMeal implements MealPlan{
    private int proteinGrams;

    // constructor
    public HighProteinMeal(int proteinGrams) {
        this.proteinGrams = proteinGrams;
    }

    // define the toString methode
    @Override
    public String getMealDetails() {
        return "High-Protein meal with " + proteinGrams + "g of protein";
    }
}
