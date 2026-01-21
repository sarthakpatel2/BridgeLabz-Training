package mealplanner;

public class HighProteinMeal implements MealPlan{
    public String getMealType(){
        return "High-Protein";
    }
    public int getCalories(){
        return 700;
    }
    public void prepareMeal() {
        System.out.println("Preparing high-protein meal");
    }
}
