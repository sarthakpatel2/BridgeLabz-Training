package mealplanner;
// meal generator
public class MealGenerator{
    // generic method with bounded type parameter
    public static <T extends MealPlan> Meal<T> createMealPlan(T mealPlan) {
        if (mealPlan ==null){
            throw new IllegalArgumentException("Invalid Meal Plan");
        }
        return new Meal<>(mealPlan);
    }
}
