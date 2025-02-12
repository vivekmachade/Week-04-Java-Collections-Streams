package com.generics.meal_plan_generator;

// Taking class Meal which Generic datatype extend Mealplan
public class Meal <T extends MealPlan>{
    private T mealType;

    // constructor
    public Meal(T mealType){
        this.mealType = mealType;
    }

    // getter for mealType
    public T getMealType() {
        return mealType;
    }

    // toString method for display result printing object
    @Override
    public String toString() {
        return mealType.getMealDetails();
    }
}
