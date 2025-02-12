package com.generics.meal_plan_generator;

// Taking Class KetoMeal which implements interface MealPlan
public class KetoMeal implements MealPlan{
    private int fatPercentage;

    // constructor
    public KetoMeal(int fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    // toString method for display result by printing object
    @Override
    public String getMealDetails() {
        return "Keto Meal has Fat percentage : " + fatPercentage;
    }
}
