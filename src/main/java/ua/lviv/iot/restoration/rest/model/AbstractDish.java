package ua.lviv.iot.restoration.rest.model;

import java.util.ArrayList;
import java.util.List;

public class AbstractDish {
	protected double priceInUAH;
	protected int massInGrams;
	protected String nameOfDish;
	protected List<String> ingredients;
	protected ArrayList<Specification> specifications;
	protected Condition condition;
	protected int timeForCookingInMinutes;

	public void setNameOfDish(String nameOfDish) {
		this.nameOfDish = nameOfDish;
	}

	public int getTimeForCookingInMinutes() {
		return timeForCookingInMinutes;
	}

	public double getPriceInUAH() {
		return priceInUAH;
	}

	public int getMassInGrams() {
		return massInGrams;
	}

	public AbstractDish(double priceInUAH) {
		this.priceInUAH = priceInUAH;
	}

	public AbstractDish(int timeForCookingInMinutes, double priceInUAH) {

		this.timeForCookingInMinutes = timeForCookingInMinutes;
		this.priceInUAH = priceInUAH;
	}

	public AbstractDish(double priceInUAH, int massInGrams, String nameOfDish, List<String> ingredients,
			ArrayList<Specification> specifications, Condition condition, int timeForCookingInMinutes) {
		this.priceInUAH = priceInUAH;
		this.massInGrams = massInGrams;
		this.nameOfDish = nameOfDish;
		this.ingredients = ingredients;
		this.specifications = specifications;
		this.condition = condition;
		this.timeForCookingInMinutes = timeForCookingInMinutes;
	}

	public Condition getCondition() {
		return condition;
	}

	public ArrayList<Specification> getSpecifications() {
		return specifications;
	}

	public String getNameOfDish() {

		return nameOfDish;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public String getHeaders() {
		return "priceInUAH, massInGrams, nameOfDish, ingredients, specifications, condition, timeForCookingInMinutes";
	}

	public String toCSV() {
		return priceInUAH + ", " + massInGrams + ", " + nameOfDish + "," + ingredients + ", " + specifications + ", "
				+ condition + ", " + timeForCookingInMinutes;
	}
}
