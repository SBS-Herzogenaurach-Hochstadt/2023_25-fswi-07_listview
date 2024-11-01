import models.Article;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import services.DataAccessObject;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DataAccessObjectTest {

	private static List<Article> articles;

	@BeforeAll
	public static void setUp() {
		DataAccessObject dao = new DataAccessObject();
		articles = dao.findAll();
	}

	@Test
	@DisplayName("FindAll should return a non-null list of articles")
	public void testFindAllReturnsNonNullList() {
		assertNotNull(articles, "The list of articles should not be null");
	}

	@Test
	@DisplayName("List of Articles should have 500 Elements")
	public void testListOfArticlesHasSize500() {
		assertEquals(500, articles.size(), "The count of items should be 500");
	}
}