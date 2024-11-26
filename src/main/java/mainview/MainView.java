package mainview;

import customs.MyButton;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MainView extends JFrame {

	DefaultTableModel model;
	String[] columnNames;
	MyButton btn;
	JComboBox<String> filter;

	public MainView() {
		setTitle("TableView");
		setIconImage(new ImageIcon(getClass().getResource("/images/fswi32x32.png")).getImage());

		Box searcher = Box.createHorizontalBox();
		searcher.add(Box.createHorizontalGlue());

		searcher.add(new JLabel(new ImageIcon(getClass().getResource("/images/lupe32x32.png"))));

		String[] filters = {"", "Category A", "Category B", "Category C"};
		filter = new JComboBox(filters);
		searcher.add(filter);

		getContentPane().add(searcher, BorderLayout.PAGE_START);

		getContentPane().setBackground(new Color(46, 204, 250));

		columnNames = new String[]{
				"Product Number",
				"Name",
				"Description",
				"Category",
				"Manufacturer",
				"Stock Level",
				"Minimum Stock",
				"Purchase Price",
				"Selling Price",
				"Storage Location",
				"Order Status",
				"Delivery Time",
				"EAN",
				"Weight",
				"Height",
				"Width",
				"Depth",
				"Expiration Date"
		};

		// Tabelle mit Spaltenüberschriften und Daten erstellen
		model = new DefaultTableModel(null, columnNames);
		JTable table = new JTable(model);

		// Tabelle in ScrollPane einfügen
		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		btn = new MyButton("Load Table");
		getContentPane().add(btn, BorderLayout.PAGE_END);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
