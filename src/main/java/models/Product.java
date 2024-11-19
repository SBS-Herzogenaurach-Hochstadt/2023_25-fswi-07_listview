package models;

import lombok.Data;

@Data
public class Product {
	private String productNumber;
	private String name;
	private String description;
	private String category;
	private String manufacturer;
	private int stockLevel;
	private int minimumStock;
	private double purchasePrice;
	private double sellingPrice;
	private String storageLocation;
	private String orderStatus;
	private int deliveryTime;
	private String ean;
	private double weight;
	private double height;
	private double width;
	private double depth;
	private String expirationDate;
}
