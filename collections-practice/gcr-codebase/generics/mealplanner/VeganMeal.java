package mealplanner;
public class VeganMeal implements MealPlan{
    public String getMealType() {
        return "Vegan";
    }
    public int getCalories() {
        return 450;
    }
    public void prepareMeal() {
        System.out.println("Preparing vegan meal");
    }
}
