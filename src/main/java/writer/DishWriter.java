package writer;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import ua.lviv.iot.restoration.model.AbstractDish;

public class DishWriter {
	private Writer csvWriter;

	public void setCsvWriter(Writer csvWriter) {
		this.csvWriter = csvWriter;
	}

	public void writeToFile(List<AbstractDish> dishes) throws IOException {

		for (AbstractDish dish : dishes) {
			csvWriter.write(dish.getHeaders());
			csvWriter.write("\r\n");
			csvWriter.write(dish.toCSV());
			csvWriter.write("\r\n");
		}
	}
}
