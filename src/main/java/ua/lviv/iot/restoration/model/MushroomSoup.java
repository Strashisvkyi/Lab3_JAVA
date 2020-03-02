package ua.lviv.iot.restoration.model;

import java.util.ArrayList;

public class MushroomSoup extends Soup {
	private String mushroomtype;
	String nameOfDish = "Mushroom soup";

	public MushroomSoup(double priceInUAH, int massInGrams, String nameOfDish, ArrayList<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes,
			String consistence, String mushroomtype) {
		super(priceInUAH, massInGrams, nameOfDish, ingredients, specifications, condition, timeForCookingInMinutes,
				consistence);
		this.mushroomtype = mushroomtype;
	}

	public MushroomSoup(double priceInUAH) {
		super(priceInUAH);
	}
}
