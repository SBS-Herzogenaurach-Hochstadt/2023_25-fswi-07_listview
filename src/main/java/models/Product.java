package models;

@SuppressWarnings("unused")
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
	private String expirationDate; // if applicable

	public Product() {

	}

	public Product(String productNumber, String name) {
		this(productNumber, name, null, null, null, 0, 0, 0.0, 0.0, null, null, 0, null, 0.0, 0.0, 0.0, 0.0, null);
	}

	public Product(String productNumber, String name, String description, String category,
	               String manufacturer, int stockLevel, int minimumStock, double purchasePrice,
	               double sellingPrice, String storageLocation, String orderStatus, int deliveryTime,
	               String ean, double weight, double height, double width, double depth, String expirationDate) {
		this.productNumber = productNumber;
		this.name = name;
		this.description = description;
		this.category = category;
		this.manufacturer = manufacturer;
		this.stockLevel = stockLevel;
		this.minimumStock = minimumStock;
		this.purchasePrice = purchasePrice;
		this.sellingPrice = sellingPrice;
		this.storageLocation = storageLocation;
		this.orderStatus = orderStatus;
		this.deliveryTime = deliveryTime;
		this.ean = ean;
		this.weight = weight;
		this.height = height;
		this.width = width;
		this.depth = depth;
		this.expirationDate = expirationDate;
	}

	public String getProductNumber() { return productNumber; }
	public void setProductNumber(String productNumber) { this.productNumber = productNumber; }

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }

	public String getCategory() { return category; }
	public void setCategory(String category) { this.category = category; }

	public String getManufacturer() { return manufacturer; }
	public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

	public int getStockLevel() { return stockLevel; }
	public void setStockLevel(int stockLevel) { this.stockLevel = stockLevel; }

	public int getMinimumStock() { return minimumStock; }
	public void setMinimumStock(int minimumStock) { this.minimumStock = minimumStock; }

	public double getPurchasePrice() { return purchasePrice; }
	public void setPurchasePrice(double purchasePrice) { this.purchasePrice = purchasePrice; }

	public double getSellingPrice() { return sellingPrice; }
	public void setSellingPrice(double sellingPrice) { this.sellingPrice = sellingPrice; }

	public String getStorageLocation() { return storageLocation; }
	public void setStorageLocation(String storageLocation) { this.storageLocation = storageLocation; }

	public String getOrderStatus() { return orderStatus; }
	public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }

	public int getDeliveryTime() { return deliveryTime; }
	public void setDeliveryTime(int deliveryTime) { this.deliveryTime = deliveryTime; }

	public String getEan() { return ean; }
	public void setEan(String ean) { this.ean = ean; }

	public double getWeight() { return weight; }
	public void setWeight(double weight) { this.weight = weight; }

	public double getHeight() { return height; }
	public void setHeight(double height) { this.height = height; }

	public double getWidth() { return width; }
	public void setWidth(double width) { this.width = width; }

	public double getDepth() { return depth; }
	public void setDepth(double depth) { this.depth = depth; }

	public String getExpirationDate() { return expirationDate; }
	public void setExpirationDate(String expirationDate) { this.expirationDate = expirationDate; }

	// toString method to display the item
	@Override
	public String toString() {
		return "Item{" +
				"itemNumber='" + productNumber + '\'' +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", category='" + category + '\'' +
				", manufacturer='" + manufacturer + '\'' +
				", stockLevel=" + stockLevel +
				", minimumStock=" + minimumStock +
				", purchasePrice=" + purchasePrice +
				", sellingPrice=" + sellingPrice +
				", storageLocation='" + storageLocation + '\'' +
				", orderStatus='" + orderStatus + '\'' +
				", deliveryTime=" + deliveryTime +
				", ean='" + ean + '\'' +
				", weight=" + weight +
				", height=" + height +
				", width=" + width +
				", depth=" + depth +
				", expirationDate='" + expirationDate + '\'' +
				'}';
	}
}
