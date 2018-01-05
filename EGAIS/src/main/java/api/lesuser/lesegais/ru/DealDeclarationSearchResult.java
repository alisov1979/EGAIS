
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Результат поиска деклараций о сделке
 * 
 * <p>Java class for DealDeclarationSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealDeclarationSearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dealDeclarationList" type="{http://data.lesuser.lesegais.ru/}DealDeclarationList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealDeclarationSearchResult", propOrder = {
    "dealDeclarationList"
})
public class DealDeclarationSearchResult {

    protected DealDeclarationList dealDeclarationList;

    /**
     * Gets the value of the dealDeclarationList property.
     * 
     * @return
     *     possible object is
     *     {@link DealDeclarationList }
     *     
     */
    public DealDeclarationList getDealDeclarationList() {
        return dealDeclarationList;
    }

    /**
     * Sets the value of the dealDeclarationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealDeclarationList }
     *     
     */
    public void setDealDeclarationList(DealDeclarationList value) {
        this.dealDeclarationList = value;
    }

}
