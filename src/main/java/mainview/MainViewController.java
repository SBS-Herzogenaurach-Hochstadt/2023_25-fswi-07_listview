package mainview;

import models.Product;
import services.DataAccessObject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MainViewController {

	private final MainView mainView;
	private final DataAccessObject dao;

	public MainViewController(MainView mainView, DataAccessObject dao) {
		this.mainView = mainView;
		this.dao = dao;
		mainView.filter.addActionListener(new FilterChangeEventHandler());
		mainView.btn.addActionListener(new LoadEventHandler());
	}

	private class FilterChangeEventHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String bufFilterCategorie = (String) mainView.filter.getSelectedItem();
			List<Product> productFromCategorie = dao.findAll();
			if (!"".equals(bufFilterCategorie)) {
				productFromCategorie = productFromCategorie
						.stream()
						.filter(p -> p.getCategory().equals(bufFilterCategorie))
						.toList();
			}
			Object[][] data = productFromCategorie
					.stream().parallel()
					.map(product -> new Object[]{
							product.getProductNumber(),
							product.getName(),
							product.getDescription(),
							product.getCategory(),
							product.getManufacturer(),
							product.getStockLevel(),
							product.getMinimumStock(),
							product.getPurchasePrice(),
							product.getSellingPrice(),
							product.getStorageLocation(),
							product.getOrderStatus(),
							product.getDeliveryTime(),
							product.getEan(),
							product.getWeight(),
							product.getHeight(),
							product.getWidth(),
							product.getDepth(),
							product.getExpirationDate()
					}).toArray(Object[][]::new);
			mainView.model.setDataVector(data, mainView.columnNames);
		}
	}

	private class LoadEventHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			List<Product> products = dao.findAll();
			Object[][] data = products.stream().parallel()
					.map(product -> new Object[]{
							product.getProductNumber(),
							product.getName(),
							product.getDescription(),
							product.getCategory(),
							product.getManufacturer(),
							product.getStockLevel(),
							product.getMinimumStock(),
							product.getPurchasePrice(),
							product.getSellingPrice(),
							product.getStorageLocation(),
							product.getOrderStatus(),
							product.getDeliveryTime(),
							product.getEan(),
							product.getWeight(),
							product.getHeight(),
							product.getWidth(),
							product.getDepth(),
							product.getExpirationDate()
					}).toArray(Object[][]::new);
			mainView.model.setDataVector(data, mainView.columnNames);
			mainView.btn.setEnabled(false);
		}
	}

}