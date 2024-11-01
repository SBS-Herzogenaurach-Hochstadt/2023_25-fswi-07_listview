import models.Article;
import org.junit.jupiter.api.Test;
import services.DataAccessObject;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DataAccessObjectTest {

	@Test
	public void testFindAll() {
		List<Article> articles = DataAccessObject.findAll();
		assertNotNull(articles, "The list of articles should not be null");
		assertEquals(500, articles.size(), "The count of items should be 500");
	}
}