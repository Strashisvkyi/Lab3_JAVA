package ua.lviv.iot.restoration.model;

import java.util.ArrayList;

public abstract class Dessert extends AbstractDish {
	protected int persentageOfSugar;

	public Dessert(double priceInUAH, int massInGrams, String nameOfDish, ArrayList<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes,
			int persentageOfSugar) {
		super(priceInUAH, massInGrams, nameOfDish, ingredients, specifications, condition, timeForCookingInMinutes);
		this.persentageOfSugar = persentageOfSugar;
	}

	public Dessert(double priceInUAH) {
		super(priceInUAH);
	}

	public Dessert(int timeForCookingInMinutes, double priceInUAH) {
		super(timeForCookingInMinutes, priceInUAH);

	}

	public int getPersentageOfSugar() {
		return persentageOfSugar;
	}

	public String getHeaders() {
		return super.getHeaders() + ", persentageOfSugar";
	}

	public String toCSV() {
		return super.toCSV() + ", " + persentageOfSugar;
	}
}
