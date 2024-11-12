import models.Product;
import services.DataAccessObject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.List;

public class MainView extends JFrame {

    public MainView() {
        setTitle("TableView");
        setIconImage(new ImageIcon(getClass().getResource("/images/fswi32x32.png")).getImage());

        getContentPane().setBackground(new Color(46, 204, 250));

        String[] columnNames = {
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
        DefaultTableModel model = new DefaultTableModel(null, columnNames);
        JTable table = new JTable(model);

        // Tabelle in ScrollPane einfügen
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        MyButton btn = new MyButton("Load Table");
        btn.addActionListener(new LoadEventHandler());
        getContentPane().add(btn, BorderLayout.PAGE_END);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class LoadEventHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            DataAccessObject dao = new DataAccessObject();
            List<Product> products = dao.findAll();
            products.stream().forEach(System.out::println);
        }
    }
}
