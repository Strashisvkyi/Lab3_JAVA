package ua.lviv.iot.restoration.model;

import java.util.ArrayList;

public class Goulash extends MainCourse {
	private String pungencyLevel;
	private DegreeOfMeatDoneness degreeOfMeatDoneness;
	String nameOfDish = "Goulash";

	public Goulash(double priceInUAH, int massInGrams, int optionID, ArrayList<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes, String sideDish,
			String meat, String sauce, int massOfSideDishInGrams, int massOfMeatInGrams, int massOfSauceInGrams,
			String pungencyLevel, DegreeOfMeatDoneness degreeOfMeatDoneness) {
		super(priceInUAH, massInGrams, optionID, ingredients, specifications, condition, timeForCookingInMinutes,
				sideDish, meat, sauce, massOfSideDishInGrams, massOfMeatInGrams, massOfSauceInGrams);
		this.pungencyLevel = pungencyLevel;
		this.degreeOfMeatDoneness = degreeOfMeatDoneness;
	}

	public Goulash(double priceInUAH) {
		super(priceInUAH);
	}

	public String toString() {
		String info = "Goulash which costs " + priceInUAH;
		return info;
	}

}