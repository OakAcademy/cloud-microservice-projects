package builder;

public class MainTest {

	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.show();
		System.out.println("Total Cost: " + vegMeal.GetCost());
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Non-Veg Meal");
		nonVegMeal.show();
		System.out.println("Total Cost: " + nonVegMeal.GetCost());

	}

}
