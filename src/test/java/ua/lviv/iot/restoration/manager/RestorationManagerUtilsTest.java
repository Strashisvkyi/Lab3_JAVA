package ua.lviv.iot.restoration.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.restoration.model.SortType;

public class RestorationManagerUtilsTest extends BaseRestorationManagerTest {
	@Test
	public void testSortDishesByPrice() {

		RestorationManagerUtils.sortDishesByPrice(SortType.ASCENDING, menu);
		assertEquals(49.99, menu.get(0).getPriceInUAH());
		assertEquals(60.50, menu.get(1).getPriceInUAH());
		assertEquals(100.25, menu.get(2).getPriceInUAH());
	}

	@Test
	public void testSortDishesByMass() {

		RestorationManagerUtils.sortDishesByMass(SortType.DESCENDING, menu);
		assertEquals(250, menu.get(0).getMassInGrams());
		assertEquals(150, menu.get(1).getMassInGrams());
		assertEquals(100, menu.get(2).getMassInGrams());
	}
	@Test
	public void testSortDishesByTimeForCooking() {
		RestorationManagerUtils.sortDishesByTimeForCooking(SortType.DESCENDING, menu);
		assertEquals(50, menu.get(0).getTimeForCookingInMinutes());
		assertEquals(35, menu.get(1).getTimeForCookingInMinutes());
		assertEquals(20, menu.get(2).getTimeForCookingInMinutes());
		
	}
	@Test
	public void testSortDishesNameOfDish() {
		RestorationManagerUtils.sortDishesByNameOfDish(SortType.ASCENDING, menu);
		assertEquals("Cold lasagna", menu.get(0).getNameOfDish());
		assertEquals("Hot lasagna", menu.get(1).getNameOfDish());
		assertEquals("Vegetarian lasagna", menu.get(2).getNameOfDish());
		
	}
	@Test
	public void testSortDishesByNumberOfIngredients() {
		RestorationManagerUtils.sortDishesByNumberOfIngredients(SortType.ASCENDING, menu);
		assertEquals(2, menu.get(0).getIngredients().size());
		assertEquals(3, menu.get(1).getIngredients().size());
		assertEquals(4, menu.get(2).getIngredients().size());
		
	}
	@Test
	public void testSortDishesByNumberOfSpecifications() {
		RestorationManagerUtils.sortDishesByNumberOfSpecifications(SortType.ASCENDING, menu);
		assertEquals(1, menu.get(0).getSpecifications().size());
		assertEquals(1, menu.get(1).getSpecifications().size());
		assertEquals(2, menu.get(2).getSpecifications().size());
		
	}
}
