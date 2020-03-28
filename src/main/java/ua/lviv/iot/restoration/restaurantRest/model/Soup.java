package ua.lviv.iot.restoration.restaurantRest.model;

import java.util.ArrayList;

public abstract class Soup extends AbstractDish {
	protected String consistence;

	public Soup(double priceInUAH, int massInGrams, String nameOfDish, ArrayList<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes,
			String consistence) {
		super(priceInUAH, massInGrams, nameOfDish, ingredients, specifications, condition, timeForCookingInMinutes);
		this.consistence = consistence;
	}

	public Soup(double priceInUAH) {
		super(priceInUAH);
	}

	public String getConsistence() {
		return consistence;
	}

	public String getHeaders() {
		return super.getHeaders() + ", consistence";
	}

	public String toCSV() {
		return super.toCSV() + ", " + consistence;
	}
}
