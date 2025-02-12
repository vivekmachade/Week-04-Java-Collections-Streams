package com.generics.meal_plan_generator;

// taking Class vegetarianMeal which implement mealplan interface
public class VegetarianMeal implements MealPlan{
    private String mainIngredient;

    // constructor
    public VegetarianMeal(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    // Tostring methode
    @Override
    public String getMealDetails() {
        return "Vegetarian Meal with main ingredient : " + mainIngredient;
    }
}
