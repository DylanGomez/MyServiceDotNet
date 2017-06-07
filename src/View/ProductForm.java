package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dylan on 30-5-2017.
 */
public class ProductForm extends JFrame {
    private JTextArea InventoryField;
    private JList InventoryList;
    private JTextArea MoneyLeftField;
    private JTextArea PrductsField;
    private JList ProductList;
    private JButton BuyButton;
    private JButton RefreshButton;
    private String gebruiker;

    public ProductForm(String username) {
        gebruiker = username;
        this.setVisible(true);

        BuyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        RefreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
