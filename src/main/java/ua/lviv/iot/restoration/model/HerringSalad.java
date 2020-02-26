package ua.lviv.iot.restoration.model;

import java.util.ArrayList;

public class HerringSalad extends Salad {
	private int persentageOfSalt;
	String nameOfDish = "Herring Salad";

	public HerringSalad(double priceInUAH, int massInGrams, int optionID, ArrayList<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes,
			String saladDressing, int persentageOfSalt) {
		super(priceInUAH, massInGrams, optionID, ingredients, specifications, condition, timeForCookingInMinutes,
				saladDressing);
		this.persentageOfSalt = persentageOfSalt;
	}

	public HerringSalad(double priceInUAH) {
		super(priceInUAH);
	}
}
