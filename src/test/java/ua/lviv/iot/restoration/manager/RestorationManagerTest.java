package ua.lviv.iot.restoration.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.restoration.model.AbstractDish;
import ua.lviv.iot.restoration.model.Condition;
import ua.lviv.iot.restoration.model.Specification;

public class RestorationManagerTest extends BaseRestorationManagerTest {
	private RestorationManager restorationManager;

	@BeforeEach
	public void setUp() {
		restorationManager = new RestorationManager();

	}

	@Test
	public void testFindDishesByCondition() {
		ArrayList<AbstractDish> dishes = new ArrayList<AbstractDish>();
		dishes = restorationManager.findDishesByCondition(Condition.HOT, menu);
		assertEquals(2, dishes.size());
		assertEquals(dishes.get(0).getSpecifications().size(), 2);
	}

	@Test
	public void testFindDishesBySpecification() {
		ArrayList<AbstractDish> dishes = new ArrayList<AbstractDish>();
		dishes = restorationManager.findDishesBySpecification(menu, Specification.VEGETARIAN);
		assertEquals(1, dishes.size());
		assertEquals(dishes.get(0).getSpecifications().size(), 2);

	}

	@Test
	public void testFindTable() {
		GroupOfClients group = new GroupOfClients(6, 500);
		restorationManager.findTable(group);
		assertEquals(group.getTable().getNumberOfSeats(), group.getNumberOfClients());
	}

}
