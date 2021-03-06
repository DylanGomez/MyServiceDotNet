
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.datacontract.schemas._2004._07.myservice.ArrayOfProductDTO;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IStoreService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    org.datacontract.schemas._2004._07.myservice.ObjectFactory.class,
    org.tempuri.ObjectFactory.class
})
public interface IStoreService {


    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "LoginUser", action = "http://tempuri.org/IStoreService/LoginUser")
    @WebResult(name = "LoginUserResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "LoginUser", targetNamespace = "http://tempuri.org/", className = "org.tempuri.LoginUser")
    @ResponseWrapper(localName = "LoginUserResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.LoginUserResponse")
    public Boolean loginUser(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "password", targetNamespace = "http://tempuri.org/")
        String password);

    /**
     * 
     * @param value
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "InsertCustomer", action = "http://tempuri.org/IStoreService/InsertCustomer")
    @WebResult(name = "InsertCustomerResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "InsertCustomer", targetNamespace = "http://tempuri.org/", className = "org.tempuri.InsertCustomer")
    @ResponseWrapper(localName = "InsertCustomerResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.InsertCustomerResponse")
    public String insertCustomer(
        @WebParam(name = "value", targetNamespace = "http://tempuri.org/")
        String value);

    /**
     * 
     * @return
     *     returns org.datacontract.schemas._2004._07.myservice.ArrayOfProductDTO
     */
    @WebMethod(operationName = "GetAllProducts", action = "http://tempuri.org/IStoreService/GetAllProducts")
    @WebResult(name = "GetAllProductsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetAllProducts", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetAllProducts")
    @ResponseWrapper(localName = "GetAllProductsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetAllProductsResponse")
    public ArrayOfProductDTO getAllProducts();

    /**
     * 
     * @param aantal
     * @param product
     * @param username
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "BuyProduct", action = "http://tempuri.org/IStoreService/BuyProduct")
    @WebResult(name = "BuyProductResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "BuyProduct", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuyProduct")
    @ResponseWrapper(localName = "BuyProductResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.BuyProductResponse")
    public Boolean buyProduct(
        @WebParam(name = "aantal", targetNamespace = "http://tempuri.org/")
        Integer aantal,
        @WebParam(name = "product", targetNamespace = "http://tempuri.org/")
        String product,
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username);

    /**
     * 
     * @param username
     * @return
     *     returns org.datacontract.schemas._2004._07.myservice.ArrayOfProductDTO
     */
    @WebMethod(operationName = "GetMyInventory", action = "http://tempuri.org/IStoreService/GetMyInventory")
    @WebResult(name = "GetMyInventoryResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetMyInventory", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetMyInventory")
    @ResponseWrapper(localName = "GetMyInventoryResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetMyInventoryResponse")
    public ArrayOfProductDTO getMyInventory(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username);

    /**
     * 
     * @param username
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "GetSaldo", action = "http://tempuri.org/IStoreService/GetSaldo")
    @WebResult(name = "GetSaldoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetSaldo", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetSaldo")
    @ResponseWrapper(localName = "GetSaldoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetSaldoResponse")
    public Double getSaldo(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username);

}
