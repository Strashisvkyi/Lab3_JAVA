package ua.lviv.iot.restoration.restaurantRest.model;

import java.util.ArrayList;

public class HerringSalad extends Salad {
	private int persentageOfSalt;

	public HerringSalad(double priceInUAH, int massInGrams, String nameOfDish, ArrayList<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes,
			String saladDressing, int persentageOfSalt) {
		super(priceInUAH, massInGrams, nameOfDish, ingredients, specifications, condition, timeForCookingInMinutes,
				saladDressing);
		this.persentageOfSalt = persentageOfSalt;
	}

	public int getPersentageOfSalt() {
		return persentageOfSalt;
	}

	public String getHeaders() {
		return super.getHeaders() + ", persentageOfSalt";
	}

	public String toCSV() {
		return super.toCSV() + ", " + persentageOfSalt;
	}
}
