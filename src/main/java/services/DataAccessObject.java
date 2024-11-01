package services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Article;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DataAccessObject {

	public List<Article> findAll() {
		ObjectMapper objectMapper = new ObjectMapper();
		List<Article> articles = null;
		try (InputStream inputStream = Files.newInputStream(Paths.get("src/main/resources/articles.txt"))) {
			articles = objectMapper.readValue(inputStream, new TypeReference<>() {
			});
		} catch (Exception ignored) {

		}
		return articles;
	}
}
