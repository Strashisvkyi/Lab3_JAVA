package ua.lviv.iot.restoration.rest.model;

import java.util.ArrayList;

public class Muffin extends Dessert {
	private String filling;

	public Muffin(double priceInUAH, int massInGrams, String nameOfDish, ArrayList<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes,
			int persentageOfSugar, String filling) {
		super(priceInUAH, massInGrams, nameOfDish, ingredients, specifications, condition, timeForCookingInMinutes,
				persentageOfSugar);
		this.filling = filling;
	}

	public Muffin(double priceInUAH) {
		super(priceInUAH);
	}

	public Muffin(int timeForCookingInMinutes, double priceInUAH) {
		super(timeForCookingInMinutes, priceInUAH);

	}

	public String getFilling() {
		return filling;
	}

	public String getHeaders() {
		return super.getHeaders() + ", filling";
	}

	public String toCSV() {
		return super.toCSV() + ", " + filling;
	}
}
