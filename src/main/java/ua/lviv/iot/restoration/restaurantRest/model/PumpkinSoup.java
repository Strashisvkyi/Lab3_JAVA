package ua.lviv.iot.restoration.restaurantRest.model;

import java.util.ArrayList;

public class PumpkinSoup extends Soup {
	private String countryOfOrigin;

	public PumpkinSoup(double priceInUAH, int massInGrams, String nameOfDish, ArrayList<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes,
			String consistence, String countryOfOrigin) {
		super(priceInUAH, massInGrams, nameOfDish, ingredients, specifications, condition, timeForCookingInMinutes,
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

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public String getHeaders() {
		return super.getHeaders() + ", countryOfOrigin";
	}

	public String toCSV() {
		return super.toCSV() + ", " + countryOfOrigin;
	}
}
