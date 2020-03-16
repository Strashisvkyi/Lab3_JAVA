package ua.lviv.iot.restoration.manager;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.restoration.model.AbstractDish;
import ua.lviv.iot.restoration.model.Condition;
import ua.lviv.iot.restoration.model.Lasagna;
import ua.lviv.iot.restoration.model.Specification;

public class BaseRestorationManagerTest {
	protected ArrayList<AbstractDish> menu;

	@BeforeEach
	public void createMenu() {
		menu = new ArrayList<AbstractDish>();
		ArrayList<String> firstIngredients = new ArrayList<String>();
		firstIngredients.add("cucumber");
		firstIngredients.add("tomato");
		firstIngredients.add("onion");
		ArrayList<Specification> firstSpecifications = new ArrayList<Specification>();
		firstSpecifications.add(Specification.VEGETARIAN);
		firstSpecifications.add(Specification.BABY);

		ArrayList<String> secondIngredients = new ArrayList<String>();
		secondIngredients.add("lettuce");
		secondIngredients.add("aubergine");
		ArrayList<Specification> secondSpecifications = new ArrayList<Specification>();
		secondSpecifications.add(Specification.NON_ALLERGIC);
		ArrayList<String> thirdIngredients = new ArrayList<String>();
		thirdIngredients.add("carrot");
		thirdIngredients.add("pork");
		thirdIngredients.add("cheese");
		thirdIngredients.add("eggs");

		menu.add(new Lasagna(100.25, 150, "Vegetarian lasagna", firstIngredients, firstSpecifications, Condition.HOT,
				50, "potato", "beef", "balognesa", 100, 50, 20, "new"));
		menu.add(new Lasagna(60.50, 100, "Cold lasagna", secondIngredients, secondSpecifications, Condition.COLD, 20,
				"potato", "beef", "balognesa", 100, 50, 20, "standart"));
		menu.add(new Lasagna(49.99, 250, "Hot lasagna", thirdIngredients, secondSpecifications, Condition.HOT, 35,
				"potato", "beef", "balognesa", 100, 50, 20, "Italian"));

	}
}
