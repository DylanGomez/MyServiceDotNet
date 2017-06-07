package Client;
import View.RegisterForm;
import org.tempuri.*;
/**
 * Created by dylan on 31-5-2017.
 */
public class Client {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        IStoreService proxy=
                storeService.getBasicHttpBindingIStoreService();

            new RegisterForm();
    }

}
