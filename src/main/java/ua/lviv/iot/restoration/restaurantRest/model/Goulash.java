package ua.lviv.iot.restoration.restaurantRest.model;

import java.util.ArrayList;

public class Goulash extends MainCourse {
	private String pungencyLevel;
	private DegreeOfMeatDoneness degreeOfMeatDoneness;

	public Goulash(double priceInUAH, int massInGrams, String nameOfDish, ArrayList<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes, String sideDish,
			String meat, String sauce, int massOfSideDishInGrams, int massOfMeatInGrams, int massOfSauceInGrams,
			String pungencyLevel, DegreeOfMeatDoneness degreeOfMeatDoneness) {
		super(priceInUAH, massInGrams, nameOfDish, ingredients, specifications, condition, timeForCookingInMinutes,
				sideDish, meat, sauce, massOfSideDishInGrams, massOfMeatInGrams, massOfSauceInGrams);
		this.pungencyLevel = pungencyLevel;
		this.degreeOfMeatDoneness = degreeOfMeatDoneness;
	}

	public String getPungencyLevel() {
		return pungencyLevel;
	}

	public DegreeOfMeatDoneness getDegreeOfMeatDoneness() {
		return degreeOfMeatDoneness;
	}

	public String getHeaders() {
		return super.getHeaders() + ", pungencyLevel, degreeOfMeatDoneness";
	}

	public String toCSV() {
		return super.toCSV() + ", " + pungencyLevel + ", " + degreeOfMeatDoneness;
	}

}