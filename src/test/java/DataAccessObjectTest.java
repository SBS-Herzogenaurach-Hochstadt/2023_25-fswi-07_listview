import models.Articel;
import org.junit.jupiter.api.Test;
import services.DataAccessObject;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DataAccessObjectTest {

	@Test
	public void testFindAll() {
		List<Articel> articels = DataAccessObject.findAll();
		assertNotNull(articels, "The list of articels should not be null");
		assertEquals(500, articels.size(), "The count of items should be 500");
	}
}