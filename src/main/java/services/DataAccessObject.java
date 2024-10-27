package services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Articel;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DataAccessObject {

	public static List<Articel> findAll() {
		ObjectMapper objectMapper = new ObjectMapper();
		List<Articel> articels = null;
		try (InputStream inputStream = Files.newInputStream(Paths.get("src/main/resources/articels.txt"))) {
			articels = objectMapper.readValue(inputStream, new TypeReference<List<Articel>>() {});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return articels;
	}
}
