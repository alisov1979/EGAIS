
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Декларации о сделке
 * 
 * <p>Java class for DealDeclarationMarkingsFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealDeclarationMarkingsFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="dealId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealDeclarationMarkingsFilter")
public class DealDeclarationMarkingsFilter {

    @XmlAttribute(name = "dealId", required = true)
    protected String dealId;

    /**
     * Gets the value of the dealId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealId() {
        return dealId;
    }

    /**
     * Sets the value of the dealId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealId(String value) {
        this.dealId = value;
    }

}
