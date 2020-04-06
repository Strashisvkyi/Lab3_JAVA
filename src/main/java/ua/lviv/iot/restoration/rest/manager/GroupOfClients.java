package ua.lviv.iot.restoration.rest.manager;

import java.util.ArrayList;
import java.util.List;

import ua.lviv.iot.restoration.rest.model.AbstractDish;
import ua.lviv.iot.restoration.rest.model.Order;
import ua.lviv.iot.restoration.rest.model.Table;

public class GroupOfClients {
	private int numberOfClients;
	private List<String> preferences;
	private Table table;
	private Order order;
	private RestorationManager personalManager;
	private double budgetInUAH;

	public GroupOfClients(int numberOfClients, double budgetInUAH) {
		super();
		this.numberOfClients = numberOfClients;
		this.budgetInUAH = budgetInUAH;
	}

	public List<String> getPreferences() {
		return preferences;
	}

	public void setPreferences(List<String> preferences) {
		this.preferences = preferences;
	}

	public int getNumberOfClients() {
		return numberOfClients;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public double getBudgetInUAH() {
		return budgetInUAH;
	}

	public void setBudgetInUAH(double budgetInUAH) {
		this.budgetInUAH = budgetInUAH;
	}

	public boolean callWaiter() {
		System.out.println("Clients: Hello! We need a waiter");
		RestorationManager manager = new RestorationManager();
		this.personalManager = manager;
		return true;
	}

	public boolean getMenu() {
		if (callWaiter() == false) {
			System.out.println("Call a waiter at first");
			return false;
		} else {
			System.out.println("Thanks. Give us a menu, please");
			return true;
		}
	}

	public boolean makeOrder(ArrayList<AbstractDish> chosenDishes) {
		if (callWaiter() == false) {
			System.out.println("Call a waiter at first");
			return false;
		} else {
			System.out.println("So we want");
			double totalPrice = 0;
			for (AbstractDish dish : chosenDishes) {
				System.out.println(dish.getNameOfDish());
				totalPrice = totalPrice + dish.getPriceInUAH();
			}

			Order specialOrder = new Order(chosenDishes);
			setOrder(specialOrder);
			return true;
		}
	}

	public void getDetailsAboutDish(AbstractDish abstractDish) {
		System.out.println("All the information about the dish:" + abstractDish);
	}

	public boolean enjoyMeal() {
		if (personalManager.fulfillOrder(order) == false) {
			System.out.println("Manager: Your order is not ready yet");
			return false;
		} else {
			System.out.println("Clients: **chewing**That is so delicious!");
			return true;
		}
	}

	public boolean payTheReceipt() {
		if (enjoyMeal() == false) {
			System.out.println("Manager: Eat your meal at first");
			return false;
		} else {
			System.out.println("Clients: **paying**");
			setBudgetInUAH(budgetInUAH - order.getTotalPriceInUAH());
			if (budgetInUAH < order.getTotalPriceInUAH()) {
				System.out.println("Manager: It is not enough. I am calling the police **calling police**");
			}

			return true;
		}
	}

	public boolean leave() {
		System.out.println("Clients: Bye!");
		table.setClean(false);
		table.setFree(true);
		return true;
	}

	public RestorationManager getManager() {

		return personalManager;
	}

}
