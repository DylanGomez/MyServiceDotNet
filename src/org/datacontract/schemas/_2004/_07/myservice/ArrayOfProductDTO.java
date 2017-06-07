
package org.datacontract.schemas._2004._07.myservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProductDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductDTO" type="{http://schemas.datacontract.org/2004/07/myService}ProductDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductDTO", propOrder = {
    "productDTO"
})
public class ArrayOfProductDTO {

    @XmlElement(name = "ProductDTO", nillable = true)
    protected List<ProductDTO> productDTO;

    /**
     * Gets the value of the productDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductDTO }
     * 
     * 
     */
    public List<ProductDTO> getProductDTO() {
        if (productDTO == null) {
            productDTO = new ArrayList<ProductDTO>();
        }
        return this.productDTO;
    }

}
