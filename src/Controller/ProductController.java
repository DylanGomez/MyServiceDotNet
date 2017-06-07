package Controller;

import org.tempuri.IStoreService;
import org.tempuri.StoreService;

/**
 * Created by dylan on 30-5-2017.
 */
public class ProductController {

    public StoreService storeService = new StoreService();
    public IStoreService service =  storeService.getBasicHttpBindingIStoreService();

    public void getAllProducts(){
        service.getAllProducts();

    }



}
