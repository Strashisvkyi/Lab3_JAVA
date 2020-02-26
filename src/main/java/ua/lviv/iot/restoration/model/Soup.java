package ua.lviv.iot.restoration.model;

import java.util.ArrayList;

public abstract class Soup extends AbstractDish {
	protected String consistence;

	public Soup(double priceInUAH, int massInGrams, int optionID, ArrayList<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes,
			String consistence) {
		super(priceInUAH, massInGrams, optionID, ingredients, specifications, condition, timeForCookingInMinutes);
		this.consistence = consistence;
	}

	public Soup(double priceInUAH) {
		super(priceInUAH);
	}

}
