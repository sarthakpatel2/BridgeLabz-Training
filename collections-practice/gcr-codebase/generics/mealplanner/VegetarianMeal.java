package mealplanner;
public class VegetarianMeal implements MealPlan{
    public String getMealType(){
        return "Vegetarian";
    }
    public int getCalories(){
        return 500;
    }
    public void prepareMeal(){
        System.out.println("Preparing vegetarian meal");
    }
}
