package ua.lviv.iot.restoration.model;

import java.util.ArrayList;

public abstract class Dessert extends AbstractDish {
	protected int persentageOfSugar;

	public Dessert(double priceInUAH, int massInGrams, int optionID, ArrayList<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes,
			int persentageOfSugar) {
		super(priceInUAH, massInGrams, optionID, ingredients, specifications, condition, timeForCookingInMinutes);
		this.persentageOfSugar = persentageOfSugar;
	}

	public Dessert(double priceInUAH) {
		super(priceInUAH);
	}

	public Dessert(int timeForCookingInMinutes, double priceInUAH) {
		super(timeForCookingInMinutes, priceInUAH);

	}

}
