package ua.lviv.iot.restoration.model;

import java.util.ArrayList;

public class GreekSalad extends Salad {
	private String freshnessOfVegs;
	String nameOfDish = "Greek salad";

	public GreekSalad(double priceInUAH, int massInGrams, int optionID, ArrayList<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes,
			String saladDressing, String freshnessOfVegs) {
		super(priceInUAH, massInGrams, optionID, ingredients, specifications, condition, timeForCookingInMinutes,
				saladDressing);
		this.freshnessOfVegs = freshnessOfVegs;
	}

	public GreekSalad(double priceInUAH) {
		super(priceInUAH);
	}

}
