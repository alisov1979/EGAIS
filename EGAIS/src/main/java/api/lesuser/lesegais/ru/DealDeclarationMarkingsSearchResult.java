
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Результат поиска маркировок
 * 
 * <p>Java class for DealDeclarationMarkingsSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealDeclarationMarkingsSearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dealMarkingsList" type="{http://data.lesuser.lesegais.ru/}DealMarkingsList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dealId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealDeclarationMarkingsSearchResult", propOrder = {
    "dealMarkingsList"
})
public class DealDeclarationMarkingsSearchResult {

    protected DealMarkingsList dealMarkingsList;
    @XmlAttribute(name = "dealId", required = true)
    protected String dealId;

    /**
     * Gets the value of the dealMarkingsList property.
     * 
     * @return
     *     possible object is
     *     {@link DealMarkingsList }
     *     
     */
    public DealMarkingsList getDealMarkingsList() {
        return dealMarkingsList;
    }

    /**
     * Sets the value of the dealMarkingsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealMarkingsList }
     *     
     */
    public void setDealMarkingsList(DealMarkingsList value) {
        this.dealMarkingsList = value;
    }

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
