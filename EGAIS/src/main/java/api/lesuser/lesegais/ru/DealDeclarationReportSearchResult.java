
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Результат поиска отчетов о сделке
 * 
 * <p>Java class for DealDeclarationReportSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealDeclarationReportSearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dealReportList" type="{http://data.lesuser.lesegais.ru/}DealReportList" minOccurs="0"/>
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
@XmlType(name = "DealDeclarationReportSearchResult", propOrder = {
    "dealReportList"
})
public class DealDeclarationReportSearchResult {

    protected DealReportList dealReportList;
    @XmlAttribute(name = "dealId", required = true)
    protected String dealId;

    /**
     * Gets the value of the dealReportList property.
     * 
     * @return
     *     possible object is
     *     {@link DealReportList }
     *     
     */
    public DealReportList getDealReportList() {
        return dealReportList;
    }

    /**
     * Sets the value of the dealReportList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealReportList }
     *     
     */
    public void setDealReportList(DealReportList value) {
        this.dealReportList = value;
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
