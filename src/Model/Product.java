package Model;

/**
 * Created by dylan on 30-5-2017.
 */
public class Product {

    private int productID;
    private String productName;
    private double productPrice;
    private int aantal;

    public Product( String productName, double productPrice, int aantal){
        this.productName = productName;
        this.productPrice = productPrice;
        this.aantal = aantal;
    }
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getAantal(){ return aantal;}

    public void setAantal(int aantal){this.aantal = aantal;}
}
