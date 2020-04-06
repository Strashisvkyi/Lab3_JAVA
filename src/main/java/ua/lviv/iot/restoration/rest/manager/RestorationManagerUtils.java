package ua.lviv.iot.restoration.rest.manager;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.restoration.rest.model.AbstractDish;
import ua.lviv.iot.restoration.rest.model.SortType;

public class RestorationManagerUtils {
	private static final DishSorterByTimeForCooking SORTER_OF_DISHES_BY_TIME_FOR_COOKING = new DishSorterByTimeForCooking();

	public static void sortDishesByPrice(SortType sortType, List<AbstractDish> dishes) {
		class SorterOfDishesByPrice implements Comparator<AbstractDish> {
			@Override
			public int compare(AbstractDish firstDish, AbstractDish secondDish) {
				return (int) (firstDish.getPriceInUAH() - secondDish.getPriceInUAH());
			}
		}

		SorterOfDishesByPrice sorter = new SorterOfDishesByPrice();
		if (sortType == SortType.ASCENDING) {
			dishes.sort(sorter);
		} else {
			dishes.sort(sorter.reversed());
		}
	}

	public static void sortDishesByMass(SortType sortType, List<AbstractDish> dishes) {
		class SorterOfDishesByMass implements Comparator<AbstractDish> {
			@Override
			public int compare(AbstractDish firstDish, AbstractDish secondDish) {
				return (int) (firstDish.getMassInGrams() - secondDish.getMassInGrams());
			}
		}

		SorterOfDishesByMass sorter = new SorterOfDishesByMass();
		if (sortType == SortType.ASCENDING) {
			dishes.sort(sorter);
		} else {
			dishes.sort(sorter.reversed());
		}
	}

	public static void sortDishesByTimeForCooking(SortType sortType, List<AbstractDish> dishes) {
		dishes.sort(sortType == SortType.ASCENDING ? SORTER_OF_DISHES_BY_TIME_FOR_COOKING
				: SORTER_OF_DISHES_BY_TIME_FOR_COOKING.reversed());
	}

	public static class DishSorterByTimeForCooking implements Comparator<AbstractDish>, Serializable {
		private static final long serialVersionUID = 1L;

		@Override
		public int compare(AbstractDish firstDish, AbstractDish secondDish) {
			return firstDish.getTimeForCookingInMinutes() - secondDish.getTimeForCookingInMinutes();
		}
	}

	public static void sortDishesByNameOfDish(SortType sortType, List<AbstractDish> dishes) {
		DishSorterByNameOfDish sorterOfDishesByName = new RestorationManagerUtils().new DishSorterByNameOfDish();
		dishes.sort(sortType == SortType.ASCENDING ? sorterOfDishesByName : sorterOfDishesByName.reversed());
	}

	public class DishSorterByNameOfDish implements Comparator<AbstractDish> {
		@Override
		public int compare(AbstractDish firstDish, AbstractDish secondDish) {
			return firstDish.getTimeForCookingInMinutes() - secondDish.getTimeForCookingInMinutes();
		}
	}

	public static void sortDishesByNumberOfIngredients(SortType sortType, List<AbstractDish> dishes) {
		Comparator<AbstractDish> comparator = new Comparator<AbstractDish>() {
			@Override
			public int compare(AbstractDish firstDish, AbstractDish secondDish) {
				return firstDish.getIngredients().size() - secondDish.getIngredients().size();
			}

		};
		dishes.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());

	}

	public static void sortDishesByNumberOfSpecifications(SortType sortType, List<AbstractDish> dishes) {
		if (sortType == SortType.ASCENDING) {
			dishes.sort((firstDish, secondDish) -> firstDish.getSpecifications().size()
					- secondDish.getSpecifications().size());
		} else {
			dishes.sort((firstDish, secondDish) -> secondDish.getSpecifications().size()
					- firstDish.getSpecifications().size());
		}
	}
}
