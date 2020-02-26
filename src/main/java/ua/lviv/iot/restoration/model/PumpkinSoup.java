package ua.lviv.iot.restoration.model;

import java.util.ArrayList;

public class PumpkinSoup extends Soup {
	private String countryOfOrigin;
	String nameOfDish = "Pumpkin soup";

	public PumpkinSoup(double priceInUAH, int massInGrams, int optionID, ArrayList<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes,
			String consistence, String countryOfOrigin) {
		super(priceInUAH, massInGrams, optionID, ingredients, specifications, condition, timeForCookingInMinutes,
				consistence);
		this.countryOfOrigin = countryOfOrigin;
	}

	public PumpkinSoup(double priceInUAH) {
		super(priceInUAH);
	}

	public String toString() {
		String info = "Soup which costs " + priceInUAH;
		return info;
	}
}
