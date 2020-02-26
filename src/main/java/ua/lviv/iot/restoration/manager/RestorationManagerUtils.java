package ua.lviv.iot.restoration.manager;

import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.restoration.model.AbstractDish;
import ua.lviv.iot.restoration.model.SortType;

public class RestorationManagerUtils {
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
		} else
			dishes.sort(sorter.reversed());
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
		} else
			dishes.sort(sorter.reversed());
	}
}
