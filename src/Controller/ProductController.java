package Controller;

import org.datacontract.schemas._2004._07.myservice.ArrayOfProductDTO;
import org.tempuri.IStoreService;
import org.tempuri.StoreService;
import Model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dylan on 30-5-2017.
 */
public class ProductController {

    public StoreService storeService = new StoreService();
    public IStoreService service =  storeService.getBasicHttpBindingIStoreService();

    public List<Product> GetAllProducts()
    {
        List<Product> models = new ArrayList<Product>();
        ArrayOfProductDTO products = service.getAllProducts();

        for (int i = 0; i < products.getProductDTO().size(); i++)
        {
            models.add(new Product(products.getProductDTO().get(i).getName().getValue(), products.getProductDTO().get(i).getPrice(), products.getProductDTO().get(i).getStock()));
        }
        return models;
    }


    public List<Product> GetMyInventory(String s)
    {
        List<Product> models = new ArrayList<Product>();
        ArrayOfProductDTO products = service.getMyInventory(s);
        for (int i = 0; i < products.getProductDTO().size(); i++)
        {
            models.add(new Product(products.getProductDTO().get(i).getName().getValue(), products.getProductDTO().get(i).getPrice(), products.getProductDTO().get(i).getStock()));
        }
        return models;
    }

    public boolean BuyProduct(int aantal, String product, String username)
    {
        if (service.buyProduct(aantal, product, username))
        {
            return true;
        }

        return false;

    }

}
