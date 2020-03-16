package ua.lviv.iot.restoration.model;

import java.util.ArrayList;
import java.util.List;

public class MainCourse extends AbstractDish {
	protected String sideDish;
	protected String meat;
	protected String sauce;
	protected int massOfSideDishInGrams;
	protected int massOfMeatInGrams;
	protected int massOfSauceInGrams;

	public MainCourse(double priceInUAH, int massInGrams, String nameOfDish, List<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes, String sideDish,
			String meat, String sauce, int massOfSideDishInGrams, int massOfMeatInGrams, int massOfSauceInGrams) {
		super(priceInUAH, massInGrams, nameOfDish, ingredients, specifications, condition, timeForCookingInMinutes);
		this.sideDish = sideDish;
		this.meat = meat;
		this.sauce = sauce;
		this.massOfSideDishInGrams = massOfSideDishInGrams;
		this.massOfMeatInGrams = massOfMeatInGrams;
		this.massOfSauceInGrams = massOfSauceInGrams;
	}

	public String getSideDish() {
		return sideDish;
	}

	public String getMeat() {
		return meat;
	}

	public String getSauce() {
		return sauce;
	}

	public int getMassOfSideDishInGrams() {
		return massOfSideDishInGrams;
	}

	public int getMassOfMeatInGrams() {
		return massOfMeatInGrams;
	}

	public int getMassOfSauceInGrams() {
		return massOfSauceInGrams;
	}

	public String getHeaders() {
		return super.getHeaders() + ", sideDish, meat, sauce, massOfSideDishInGrams, massOfMeatInGrams, massOfSauce";
	}

	public String toCSV() {
		return super.toCSV() + ", " + sideDish + ", " + meat + ", " + sauce + ", " + massOfSideDishInGrams + ", "
				+ massOfMeatInGrams + ", " + massOfSauceInGrams;
	}

}
