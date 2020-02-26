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

	public MainCourse(double priceInUAH, int massInGrams, int optionID, List<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes, String sideDish,
			String meat, String sauce, int massOfSideDishInGrams, int massOfMeatInGrams, int massOfSauceInGrams) {
		super(priceInUAH, massInGrams, optionID, ingredients, specifications, condition, timeForCookingInMinutes);
		this.sideDish = sideDish;
		this.meat = meat;
		this.sauce = sauce;
		this.massOfSideDishInGrams = massOfSideDishInGrams;
		this.massOfMeatInGrams = massOfMeatInGrams;
		this.massOfSauceInGrams = massOfSauceInGrams;
	}

	public MainCourse(double priceInUAH) {
		super(priceInUAH);
	}
}
