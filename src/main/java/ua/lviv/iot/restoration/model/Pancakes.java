package ua.lviv.iot.restoration.model;

import java.util.ArrayList;

public class Pancakes extends Dessert {
	private int numberOfPancakes;
	private String syrup;

	public Pancakes(double priceInUAH, int massInGrams, String nameOfDish, ArrayList<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes,
			int persentageOfSugar, int numberOfPancakes, String syrup) {
		super(priceInUAH, massInGrams, nameOfDish, ingredients, specifications, condition, timeForCookingInMinutes,
				persentageOfSugar);
		this.numberOfPancakes = numberOfPancakes;
		this.syrup = syrup;
	}

	public Pancakes(double priceInUAH) {
		super(priceInUAH);
	}

	public Pancakes(int timeForCookingInMinutes) {
		super(timeForCookingInMinutes);

	}

	public Pancakes(int timeForCookingInMinutes, double priceInUAH) {
		super(timeForCookingInMinutes, priceInUAH);

	}

	public int getNumberOfPancakes() {
		return numberOfPancakes;
	}

	public String getSyrup() {
		return syrup;
	}

	public String getHeaders() {
		return super.getHeaders() + ", numberOfPancakes, syrup";
	}

	public String toCSV() {
		return super.toCSV() + ", " + numberOfPancakes + ", " + syrup;
	}
}
