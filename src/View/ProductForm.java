package View;

import Controller.CustomerController;
import Controller.ProductController;
import javax.swing.text.StyledDocument;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import Model.Product;
import org.datacontract.schemas._2004._07.myservice.ArrayOfProductDTO;
import org.datacontract.schemas._2004._07.myservice.ProductDTO;
import org.tempuri.IStoreService;
import org.tempuri.StoreService;

/**
 * Created by dylan on 30-5-2017.
 */
public class ProductForm extends JFrame {
    private JTextArea InventoryField;
    private JTextArea MoneyLeftField;
    private JTextArea PrductsField;
    private JButton BuyButton;
    private JButton RefreshButton;
    private JTextPane buyersList;
    private JComboBox InventoryList;
    private JLabel UserLabel;
    private JComboBox ProductsList;
    private JTabbedPane ProductFrame;
    private String gebruiker;

    ProductController p = new ProductController();
    CustomerController c = new CustomerController();

    List stockProducts;
    List myProducts;

    public StoreService storeService = new StoreService();
    public IStoreService service =  storeService.getBasicHttpBindingIStoreService();


    public void init(){
        JPanel panel = new JPanel();
        LoadProducts();
        LoadMyInventory();
//        panel.add(ProductsList);
//        panel.add(InventoryList);
//        panel.add(RefreshButton);
        panel.add(ProductFrame);
        MoneyLeftField.setText("Saldo is: " + c.getMyMoney(UserLabel.getText()));
        panel.add(MoneyLeftField);
        this.add(panel);
    }

    private void LoadProducts(){
        //stockProducts = p.GetAllProducts();
        ProductsList.removeAllItems();
        List<Product> aoP = p.GetAllProducts();

        for(int i = 0; i < aoP.size(); i ++ ) {
            ProductsList.addItem("" + aoP.get(i).getProductName() + ": "
                    + aoP.get(i).getProductPrice() + " "+  aoP.get(i).getAantal()+ "left");
        }
    }

    private void LoadMyInventory(){
        //myProducts = p.GetMyInventory(UserLabel.getText());
        InventoryList.removeAllItems();
        List<Product> aoP = p.GetMyInventory(UserLabel.getText());

        for(int i = 0; i < aoP.size(); i++ ) {
            InventoryList.addItem(aoP.get(i).getProductName() + ": "
                    + aoP.get(i).getProductPrice() + " " + "You got: " + aoP.get(i).getAantal());
        }
    }
    public ProductForm(String username) {
        UserLabel.setText(username);
        init();
        this.setSize(600, 400);


        RefreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoadProducts();
                LoadMyInventory();
                MoneyLeftField.setText("Saldo is: " + c.getMyMoney(UserLabel.getText()));
            }
        });
        BuyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String productnaam = InventoryList.getSelectedItem().toString().split(":")[0];

                p.BuyProduct(1, productnaam, UserLabel.getText());
                MoneyLeftField.setText("Money left: "+ c.getMyMoney(UserLabel.getText()));
                LoadProducts();
                LoadMyInventory();
            }
        });

        this.setVisible(true);
    }
}
