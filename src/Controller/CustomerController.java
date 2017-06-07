package Controller;

import Model.Customer;
import org.datacontract.schemas._2004._07.myservice.ArrayOfProductDTO;
import org.tempuri.IStoreService;
import org.tempuri.StoreService;

import java.io.IOException;

/**
 * Created by dylan on 2-6-2017.
 */
public class CustomerController {
    public StoreService storeService = new StoreService();
    public IStoreService service =  storeService.getBasicHttpBindingIStoreService();

    public boolean loginUser(String username, String password){
        boolean loggedIn = service.loginUser(username, password);
        if (loggedIn){
            return true;
        } else {
            return false;
        }
    }

    public String registerUser(String username) {
        //if username exist
        try {
            String password = service.insertCustomer(username);
            return password;

        }catch (Exception e){
            String message = "User could not be inserted";
            return null;
        }
    }

    public String getMyProducts(Customer c){

        ArrayOfProductDTO products = service.getMyInventory(c.getUsername());

        if (products.equals(null) || products.equals("")){
            return null;
        }else{
           return products.toString();
        }
    }

    public double getMyMoney(Customer c){
        double money = service.getSaldo(c.getUsername());

        return money;
    }
}
