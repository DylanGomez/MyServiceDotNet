package Controller;

import Model.Customer;
import Model.Product;
import org.tempuri.IStoreService;
import org.tempuri.StoreService;

/**
 * Created by dylan on 30-5-2017.
 */
public class OrderController {

    public StoreService storeService = new StoreService();
    public IStoreService service =  storeService.getBasicHttpBindingIStoreService();

    public void makeOrder(Customer c, Product p, int aantal){
        if (aantal > p.getAantal()){
            String error = "niet genoeg aantalen";
        }
        else if(c.getSaldo() < p.getProductPrice()){
            String error = "onvoldoende saldo";
        }
        else if(aantal <= p.getAantal() && c.getSaldo() >= p.getProductPrice())
            service.buyProduct(aantal, p.getProductID(), c.getCustomerID());
        }
    }


