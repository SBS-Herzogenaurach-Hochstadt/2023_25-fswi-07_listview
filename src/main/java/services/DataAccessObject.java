package services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Product;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DataAccessObject {

	public List<Product> findAll() {
		ObjectMapper objectMapper = new ObjectMapper();
		List<Product> products = null;
		try (InputStream inputStream = Files.newInputStream(Paths.get("src/main/resources/products.txt"))) {
			products = objectMapper.readValue(inputStream, new TypeReference<>() {
			});
		} catch (Exception ignored) {

		}
		return products;
	}
}
