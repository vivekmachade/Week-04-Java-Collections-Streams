package com.generics.meal_plan_generator;

// taking class vegan meal class which implement mealplan interface
public class VeganMeal implements MealPlan{
    private boolean isGlutenFree;

    // constructor
    public VeganMeal(boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
    }

    // toString method for printing the result with printing the object
    @Override
    public String getMealDetails() {
        return "Vegan Meal - Gluten Free : " + isGlutenFree;
    }
}
