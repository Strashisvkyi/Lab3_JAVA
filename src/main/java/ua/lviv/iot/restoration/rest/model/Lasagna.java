package ua.lviv.iot.restoration.rest.model;

import java.util.ArrayList;
import java.util.List;

public class Lasagna extends MainCourse {

	private String recipeUsed;

	public Lasagna(double priceInUAH, int massInGrams, String nameOfDish, List<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes, String sideDish,
			String meat, String sauce, int massOfSideDishInGrams, int massOfMeatInGrams, int massOfSauceInGrams,
			String recipeUsed) {
		super(priceInUAH, massInGrams, nameOfDish, ingredients, specifications, condition, timeForCookingInMinutes,
				sideDish, meat, sauce, massOfSideDishInGrams, massOfMeatInGrams, massOfSauceInGrams);
		this.recipeUsed = recipeUsed;
	}

	public String getRecipeUsed() {
		return recipeUsed;
	}

	public String getHeaders() {
		return super.getHeaders() + ", recipeUsed";
	}

	public String toCSV() {
		return super.toCSV() + ", " + recipeUsed;
	}

}
