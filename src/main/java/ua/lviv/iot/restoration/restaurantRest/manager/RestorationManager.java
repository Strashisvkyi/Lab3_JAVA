package ua.lviv.iot.restoration.restaurantRest.manager;

import java.util.ArrayList;
import ua.lviv.iot.restoration.restaurantRest.model.AbstractDish;
import ua.lviv.iot.restoration.restaurantRest.model.Condition;
import ua.lviv.iot.restoration.restaurantRest.model.Order;
import ua.lviv.iot.restoration.restaurantRest.model.Specification;
import ua.lviv.iot.restoration.restaurantRest.model.Table;

public class RestorationManager {
	private ArrayList<AbstractDish> menu = new ArrayList<AbstractDish>();

	public void addDish(AbstractDish dish) {
		menu.add(dish);
	}

	public void addDishes(ArrayList<AbstractDish> dishes) {
		menu.addAll(dishes);
	}

	public ArrayList<AbstractDish> findDishesByCondition(Condition condition, ArrayList<AbstractDish> chosenDishes) {
		ArrayList<AbstractDish> foundDishes = new ArrayList<AbstractDish>();
		for (AbstractDish dish : chosenDishes) {
			if (dish.getCondition() == condition) {
				foundDishes.add(dish);
			}
		}
		return foundDishes;
	}

	public ArrayList<AbstractDish> findDishesBySpecification(ArrayList<AbstractDish> chosenDishes,
			Specification specification) {
		ArrayList<AbstractDish> foundDishes = new ArrayList<AbstractDish>();
		for (AbstractDish dish : chosenDishes) {
			if (dish.getSpecifications().contains(specification)) {
				foundDishes.add(dish);
			}
		}
		return foundDishes;
	}

	public boolean findTable(GroupOfClients group) {
		Table table = new Table(group.getNumberOfClients());
		group.setTable(table);
		table.setFree(false);
		System.out.println("Manager: Here I am. Let’s find you a table...... Take this one, please");
		return true;
	}

	public void giveMenu(GroupOfClients group) {
		if (group.getMenu() == false) {
			System.out.println("Clients must ask for a menu at first");
		} else {
			System.out.println("Manager: Okey. This is our menu:");
			for (AbstractDish dish : menu) {
				System.out.println(dish.getNameOfDish() + ";");
			}

		}
	}

	public boolean takeOrder(GroupOfClients group) {
		if (group.getOrder() == null) {
			System.out.println("Clients should make order at first");
			return false;
		} else {
			ArrayList<AbstractDish> dishes = group.getOrder().getDishes();
			int totalTimeForCookingInMinutes = 0;
			for (AbstractDish dish : dishes) {
				totalTimeForCookingInMinutes = totalTimeForCookingInMinutes + dish.getTimeForCookingInMinutes();

			}
			System.out.println("Manager: OK. Cooking will take " + totalTimeForCookingInMinutes);
			return true;

		}
	}

	public boolean fulfillOrder(Order order) {
		if (order == null) {
			System.out.println("Manager should take order at first");
			return false;
		} else {

			for (AbstractDish dish : order.getDishes()) {
				System.out.println("Manager: Cooking" + dish.getNameOfDish() + " now. Your order will be ready in "
						+ (order.getTotalTimeForCookingInMinutes() - dish.getTimeForCookingInMinutes()));
				System.out.println("Your order is ready! Enjoy");
			}

			return true;
		}
	}

	public void cleanTable(Table table) {
		if (table.isClean() == true) {
			System.out.println("No need to clean a clean table!");
		} else {
			System.out.println("Manager: **Cleaning table**");
			table.setClean(true);
		}
	}

}