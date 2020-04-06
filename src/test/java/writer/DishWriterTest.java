package writer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.FileWriter;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.restoration.rest.manager.BaseRestorationManagerTest;
import ua.lviv.iot.restoration.rest.model.AbstractDish;

class DishWriterTest extends BaseRestorationManagerTest {

	@Test
	public void testProperTextFormatting() {
		try (Writer csvWriter = new StringWriter()) {
			DishWriter writer = new DishWriter();
			writer.setCsvWriter(csvWriter);
			writer.writeToFile(menu);
			String expectedLine = "";
			for (AbstractDish dish : menu) {
				expectedLine += dish.getHeaders() + "\r\n" + dish.toCSV() + "\r\n";
			}
			assertEquals(expectedLine, csvWriter.toString());
		} catch (Exception e) {
			fail("the test failed unexpectedly, try to write to the file...");
		}
	}

	@Test
	public void testFileWriter() {
		try (Writer csvWriter = new FileWriter("menu.csv")) {
			DishWriter writer = new DishWriter();
			writer.setCsvWriter(csvWriter);
			writer.writeToFile(menu);
		} catch (Exception e) {
			fail("test failed unexcpectedly");
		}
	}

}
