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
}
