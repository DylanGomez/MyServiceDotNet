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
    private JComboBox ProductsList;
    private String gebruiker;
    ProductController p = new ProductController();
    CustomerController c = new CustomerController();

    List stockProducts = p.GetAllProducts();
    List myProducts = p.GetMyInventory(gebruiker);

    public StoreService storeService = new StoreService();
    public IStoreService service =  storeService.getBasicHttpBindingIStoreService();


    public void init(){
        JPanel panel = new JPanel();
        MoneyLeftField.setText("Saldo is: " + c.getMyMoney(gebruiker));

        this.add(panel);

    }

    private void LoadProducts(){
        ProductsList.removeAllItems();
        ArrayOfProductDTO aoP = service.getAllProducts();

        for(int i = 0; i < aoP.getProductDTO().size(); i ++ ) {
            ProductsList.addItem(aoP.getProductDTO().get(i).getName().toString() + ": "
                    + aoP.getProductDTO().get(i).getPrice() + " "+  aoP.getProductDTO().get(i).getStock()+ "left");
        }
    }

    private void LoadMyInventory(){
        InventoryList.removeAllItems();
        ArrayOfProductDTO aoP = service.getMyInventory(gebruiker);

        for(int i = 0; i < aoP.getProductDTO().size(); i++ ) {
            ProductsList.addItem(aoP.getProductDTO().get(i).getName().toString() + ": "
                    + aoP.getProductDTO().get(i).getPrice() + " "+  aoP.getProductDTO().get(i).getStock()+ "You got: ");
        }
    }
    public ProductForm(String username) {


        gebruiker = username;
        this.setVisible(true);


        RefreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoadProducts();
                LoadMyInventory();
            }
        });
        BuyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String productnaam = InventoryList.getSelectedItem().toString().split(":")[0];

                p.BuyProduct(1, productnaam, gebruiker);
                MoneyLeftField.setText("Money left: "+ c.getMyMoney(gebruiker));
                LoadProducts();
                LoadMyInventory();
            }
        });
    }
}
