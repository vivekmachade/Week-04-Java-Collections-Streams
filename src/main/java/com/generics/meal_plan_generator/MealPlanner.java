package com.generics.meal_plan_generator;

import java.util.ArrayList;
import java.util.List;
// Taking MealPlanner class
public class MealPlanner {
    private List<Meal <? extends MealPlan>> mealPlans = new ArrayList<>();

    // Addint the element into the list
    public void addMeal(Meal<? extends MealPlan> meal){
        if(validateMeal(meal)){
            mealPlans.add(meal);
        }
        else{
            System.out.println("Invalid meal plan : " + meal);
        }
    }

    // Checking the meal is valid date meal or not
    public <T extends MealPlan> boolean validateMeal(Meal<T> meal) {
        return meal.getMealType() != null;
    }

    // Display the result
    public void displayMeals(){
        System.out.println("Meal Plan :-");
        for(Meal<? extends MealPlan> meal : mealPlans){
            System.out.println(meal);
            System.out.println();
        }
    }
}
