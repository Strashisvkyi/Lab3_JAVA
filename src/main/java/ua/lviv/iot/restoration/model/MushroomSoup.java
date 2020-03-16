package ua.lviv.iot.restoration.model;

import java.util.ArrayList;

public class MushroomSoup extends Soup {
	private String mushroomType;

	public MushroomSoup(double priceInUAH, int massInGrams, String nameOfDish, ArrayList<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes,
			String consistence, String mushroomtype) {
		super(priceInUAH, massInGrams, nameOfDish, ingredients, specifications, condition, timeForCookingInMinutes,
				consistence);
		this.mushroomType = mushroomtype;
	}

	public MushroomSoup(double priceInUAH) {
		super(priceInUAH);
	}

	public String getMushroomtype() {
		return mushroomType;
	}

	public String getHeaders() {
		return super.getHeaders() + ", mushroomType";
	}

	public String toCSV() {
		return super.toCSV() + ", " + mushroomType;
	}
}
