package mealplanner;
public class KetoMeal implements MealPlan{

    public String getMealType(){
        return "Keto";
    }
    public int getCalories(){
        return 600;
    }
    public void prepareMeal(){
        System.out.println("Preparing keto meal");
    }
}
