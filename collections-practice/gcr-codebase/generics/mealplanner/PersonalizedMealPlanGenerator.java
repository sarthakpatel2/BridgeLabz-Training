package mealplanner;
public class PersonalizedMealPlanGenerator{
    public static void main(String[] args){
        Meal<VegetarianMeal> vegMeal=MealGenerator.createMealPlan(new VegetarianMeal());
        Meal<VeganMeal> veganMeal=MealGenerator.createMealPlan(new VeganMeal());
        Meal<KetoMeal> ketoMeal=MealGenerator.createMealPlan(new KetoMeal());
        Meal<HighProteinMeal> proteinMeal =MealGenerator.createMealPlan(new HighProteinMeal());
        vegMeal.generateMeal();
        veganMeal.generateMeal();
        ketoMeal.generateMeal();
        proteinMeal.generateMeal();
    }
}
