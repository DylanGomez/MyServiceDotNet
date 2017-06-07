
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.myservice.ArrayOfProductDTO;
import org.datacontract.schemas._2004._07.myservice.CustomerDTO;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoginUserPassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _LoginUserUsername_QNAME = new QName("http://tempuri.org/", "username");
    private final static QName _InsertCustomerValue_QNAME = new QName("http://tempuri.org/", "value");
    private final static QName _GetAllProductsResponseGetAllProductsResult_QNAME = new QName("http://tempuri.org/", "GetAllProductsResult");
    private final static QName _InsertCustomerResponseInsertCustomerResult_QNAME = new QName("http://tempuri.org/", "InsertCustomerResult");
    private final static QName _GetMyInventoryResponseGetMyInventoryResult_QNAME = new QName("http://tempuri.org/", "GetMyInventoryResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuyProductResponse }
     * 
     */
    public BuyProductResponse createBuyProductResponse() {
        return new BuyProductResponse();
    }

    /**
     * Create an instance of {@link InsertCustomer }
     * 
     */
    public InsertCustomer createInsertCustomer() {
        return new InsertCustomer();
    }

    /**
     * Create an instance of {@link LoginUserResponse }
     * 
     */
    public LoginUserResponse createLoginUserResponse() {
        return new LoginUserResponse();
    }

    /**
     * Create an instance of {@link BuyProduct }
     * 
     */
    public BuyProduct createBuyProduct() {
        return new BuyProduct();
    }

    /**
     * Create an instance of {@link GetMyInventoryResponse }
     * 
     */
    public GetMyInventoryResponse createGetMyInventoryResponse() {
        return new GetMyInventoryResponse();
    }

    /**
     * Create an instance of {@link GetAllProductsResponse }
     * 
     */
    public GetAllProductsResponse createGetAllProductsResponse() {
        return new GetAllProductsResponse();
    }

    /**
     * Create an instance of {@link GetSaldo }
     * 
     */
    public GetSaldo createGetSaldo() {
        return new GetSaldo();
    }

    /**
     * Create an instance of {@link GetAllProducts }
     * 
     */
    public GetAllProducts createGetAllProducts() {
        return new GetAllProducts();
    }

    /**
     * Create an instance of {@link LoginUser }
     * 
     */
    public LoginUser createLoginUser() {
        return new LoginUser();
    }

    /**
     * Create an instance of {@link GetSaldoResponse }
     * 
     */
    public GetSaldoResponse createGetSaldoResponse() {
        return new GetSaldoResponse();
    }

    /**
     * Create an instance of {@link InsertCustomerResponse }
     * 
     */
    public InsertCustomerResponse createInsertCustomerResponse() {
        return new InsertCustomerResponse();
    }

    /**
     * Create an instance of {@link GetMyInventory }
     * 
     */
    public GetMyInventory createGetMyInventory() {
        return new GetMyInventory();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = LoginUser.class)
    public JAXBElement<String> createLoginUserPassword(String value) {
        return new JAXBElement<String>(_LoginUserPassword_QNAME, String.class, LoginUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = LoginUser.class)
    public JAXBElement<String> createLoginUserUsername(String value) {
        return new JAXBElement<String>(_LoginUserUsername_QNAME, String.class, LoginUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "value", scope = InsertCustomer.class)
    public JAXBElement<String> createInsertCustomerValue(String value) {
        return new JAXBElement<String>(_InsertCustomerValue_QNAME, String.class, InsertCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllProductsResult", scope = GetAllProductsResponse.class)
    public JAXBElement<ArrayOfProductDTO> createGetAllProductsResponseGetAllProductsResult(ArrayOfProductDTO value) {
        return new JAXBElement<ArrayOfProductDTO>(_GetAllProductsResponseGetAllProductsResult_QNAME, ArrayOfProductDTO.class, GetAllProductsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "InsertCustomerResult", scope = InsertCustomerResponse.class)
    public JAXBElement<CustomerDTO> createInsertCustomerResponseInsertCustomerResult(CustomerDTO value) {
        return new JAXBElement<CustomerDTO>(_InsertCustomerResponseInsertCustomerResult_QNAME, CustomerDTO.class, InsertCustomerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetMyInventoryResult", scope = GetMyInventoryResponse.class)
    public JAXBElement<ArrayOfProductDTO> createGetMyInventoryResponseGetMyInventoryResult(ArrayOfProductDTO value) {
        return new JAXBElement<ArrayOfProductDTO>(_GetMyInventoryResponseGetMyInventoryResult_QNAME, ArrayOfProductDTO.class, GetMyInventoryResponse.class, value);
    }

}
