package ua.lviv.iot.restoration.model;

import java.util.ArrayList;

public class GreekSalad extends Salad {
	private String freshnessOfVegs;

	public GreekSalad(double priceInUAH, int massInGrams, String nameOfDish, ArrayList<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes,
			String saladDressing, String freshnessOfVegs) {
		super(priceInUAH, massInGrams, nameOfDish, ingredients, specifications, condition, timeForCookingInMinutes,
				saladDressing);
		this.freshnessOfVegs = freshnessOfVegs;
	}

	public GreekSalad(double priceInUAH) {
		super(priceInUAH);
	}

	public String getFreshnessOfVegs() {
		return freshnessOfVegs;
	}

	public String getHeaders() {
		return super.getHeaders() + ", freshnessOfVegs";
	}

	public String toCSV() {
		return super.toCSV() + ", " + freshnessOfVegs;
	}
}
