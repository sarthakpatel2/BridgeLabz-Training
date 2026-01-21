package mealplanner;
// generic meal class
public class Meal<T extends MealPlan>{
    private T mealPlan;
    public Meal(T mealPlan){
        this.mealPlan =mealPlan;
    }
    public void generateMeal() {
        System.out.println("\nMeal Type : "+mealPlan.getMealType());
        System.out.println("Calories  : "+mealPlan.getCalories());
        mealPlan.prepareMeal();
    }
    public T getMealPlan(){
        return mealPlan;
    }
}
