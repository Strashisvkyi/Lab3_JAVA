package ua.lviv.iot.restoration.model;

import java.util.ArrayList;

public class Muffin extends Dessert {
	private String filling;
	String nameOfDish = "Muffin";

	public Muffin(double priceInUAH, int massInGrams, int optionID, ArrayList<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes,
			int persentageOfSugar, String filling) {
		super(priceInUAH, massInGrams, optionID, ingredients, specifications, condition, timeForCookingInMinutes,
				persentageOfSugar);
		this.filling = filling;
	}

	public Muffin(double priceInUAH) {
		super(priceInUAH);
	}

	public Muffin(int timeForCookingInMinutes, double priceInUAH) {
		super(timeForCookingInMinutes, priceInUAH);
		// TODO Auto-generated constructor stub
	}

}
