
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.myservice.ArrayOfProductDTO;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetMyInventoryResult" type="{http://schemas.datacontract.org/2004/07/myService}ArrayOfProductDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getMyInventoryResult"
})
@XmlRootElement(name = "GetMyInventoryResponse")
public class GetMyInventoryResponse {

    @XmlElementRef(name = "GetMyInventoryResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProductDTO> getMyInventoryResult;

    /**
     * Gets the value of the getMyInventoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProductDTO> getGetMyInventoryResult() {
        return getMyInventoryResult;
    }

    /**
     * Sets the value of the getMyInventoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductDTO }{@code >}
     *     
     */
    public void setGetMyInventoryResult(JAXBElement<ArrayOfProductDTO> value) {
        this.getMyInventoryResult = value;
    }

}
