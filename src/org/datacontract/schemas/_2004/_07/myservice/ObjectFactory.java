
package org.datacontract.schemas._2004._07.myservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.myservice package. 
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

    private final static QName _ArrayOfProductDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/myService", "ArrayOfProductDTO");
    private final static QName _ProductDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/myService", "ProductDTO");
    private final static QName _ProductDTOName_QNAME = new QName("http://schemas.datacontract.org/2004/07/myService", "Name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.myservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfProductDTO }
     * 
     */
    public ArrayOfProductDTO createArrayOfProductDTO() {
        return new ArrayOfProductDTO();
    }

    /**
     * Create an instance of {@link ProductDTO }
     * 
     */
    public ProductDTO createProductDTO() {
        return new ProductDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/myService", name = "ArrayOfProductDTO")
    public JAXBElement<ArrayOfProductDTO> createArrayOfProductDTO(ArrayOfProductDTO value) {
        return new JAXBElement<ArrayOfProductDTO>(_ArrayOfProductDTO_QNAME, ArrayOfProductDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/myService", name = "ProductDTO")
    public JAXBElement<ProductDTO> createProductDTO(ProductDTO value) {
        return new JAXBElement<ProductDTO>(_ProductDTO_QNAME, ProductDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/myService", name = "Name", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTOName(String value) {
        return new JAXBElement<String>(_ProductDTOName_QNAME, String.class, ProductDTO.class, value);
    }

}
