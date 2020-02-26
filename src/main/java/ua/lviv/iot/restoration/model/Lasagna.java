package ua.lviv.iot.restoration.model;

import java.util.ArrayList;
import java.util.List;

public class Lasagna extends MainCourse {

	private String recipeUsed;

	public Lasagna(double priceInUAH, int massInGrams, int optionID, List<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes, String sideDish,
			String meat, String sauce, int massOfSideDishInGrams, int massOfMeatInGrams, int massOfSauceInGrams,
			String recipeUsed) {
		super(priceInUAH, massInGrams, optionID, ingredients, specifications, condition, timeForCookingInMinutes,
				sideDish, meat, sauce, massOfSideDishInGrams, massOfMeatInGrams, massOfSauceInGrams);
		this.recipeUsed = recipeUsed;
	}

	public Lasagna(double priceInUAH) {
		super(priceInUAH);
	}

	public String toString() {
		String lasagnaInfo = "Lasagna prepared using " + recipeUsed.toUpperCase() + " recipe";
		return lasagnaInfo;
	}

}
