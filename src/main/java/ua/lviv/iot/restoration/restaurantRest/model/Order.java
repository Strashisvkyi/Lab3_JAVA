package ua.lviv.iot.restoration.restaurantRest.model;

import java.util.ArrayList;

import ua.lviv.iot.restoration.restaurantRest.manager.GroupOfClients;

public class Order {
	ArrayList<AbstractDish> dishes;
	GroupOfClients groupName;
	double totalPriceInUAH;
	int totalTimeForCookingInMinutes;

	public Order(ArrayList<AbstractDish> orderedDishes) {
		this.dishes = orderedDishes;

	}

	public Order(ArrayList<AbstractDish> dishes, GroupOfClients groupName) {
		super();
		this.dishes = dishes;
		this.groupName = groupName;
	}

	public GroupOfClients getGroupName() {
		return groupName;
	}

	public ArrayList<AbstractDish> getDishes() {
		return dishes;
	}

	public double getTotalPriceInUAH() {
		return totalPriceInUAH;
	}

	public void setTotalPriceInUAH(double totalPrice) {
		this.totalPriceInUAH = totalPrice;
	}

	public int getTotalTimeForCookingInMinutes() {
		return totalTimeForCookingInMinutes;
	}

	public void setTotalTimeForCookingInMinutes(int totalTimeForCookingInMinutes) {
		this.totalTimeForCookingInMinutes = totalTimeForCookingInMinutes;
	}

}
