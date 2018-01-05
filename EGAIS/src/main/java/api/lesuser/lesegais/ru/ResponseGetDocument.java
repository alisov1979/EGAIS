
package api.lesuser.lesegais.ru;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Ответ на запрос получения документа.
 * 
 * <p>Java class for ResponseGetDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseGetDocument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.lesuser.lesegais.ru/}LesUserAbstractResponse">
 *       &lt;choice>
 *         &lt;element name="dealDeclaration" type="{http://data.lesuser.lesegais.ru/}DealDeclarationSearchResult"/>
 *         &lt;element name="dealDeclarationReport" type="{http://data.lesuser.lesegais.ru/}DealDeclarationReportSearchResult"/>
 *         &lt;element name="dealDeclarationMarkings" type="{http://data.lesuser.lesegais.ru/}DealDeclarationMarkingsSearchResult"/>
 *       &lt;/choice>
 *       &lt;attribute name="pageSize" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="pageNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseGetDocument", namespace = "http://api.lesuser.lesegais.ru/", propOrder = {
    "dealDeclaration",
    "dealDeclarationReport",
    "dealDeclarationMarkings"
})
public class ResponseGetDocument
    extends LesUserAbstractResponse
{

    protected DealDeclarationSearchResult dealDeclaration;
    protected DealDeclarationReportSearchResult dealDeclarationReport;
    protected DealDeclarationMarkingsSearchResult dealDeclarationMarkings;
    @XmlAttribute(name = "pageSize", required = true)
    protected BigInteger pageSize;
    @XmlAttribute(name = "pageNumber", required = true)
    protected BigInteger pageNumber;
    @XmlAttribute(name = "count")
    protected BigInteger count;

    /**
     * Gets the value of the dealDeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link DealDeclarationSearchResult }
     *     
     */
    public DealDeclarationSearchResult getDealDeclaration() {
        return dealDeclaration;
    }

    /**
     * Sets the value of the dealDeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealDeclarationSearchResult }
     *     
     */
    public void setDealDeclaration(DealDeclarationSearchResult value) {
        this.dealDeclaration = value;
    }

    /**
     * Gets the value of the dealDeclarationReport property.
     * 
     * @return
     *     possible object is
     *     {@link DealDeclarationReportSearchResult }
     *     
     */
    public DealDeclarationReportSearchResult getDealDeclarationReport() {
        return dealDeclarationReport;
    }

    /**
     * Sets the value of the dealDeclarationReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealDeclarationReportSearchResult }
     *     
     */
    public void setDealDeclarationReport(DealDeclarationReportSearchResult value) {
        this.dealDeclarationReport = value;
    }

    /**
     * Gets the value of the dealDeclarationMarkings property.
     * 
     * @return
     *     possible object is
     *     {@link DealDeclarationMarkingsSearchResult }
     *     
     */
    public DealDeclarationMarkingsSearchResult getDealDeclarationMarkings() {
        return dealDeclarationMarkings;
    }

    /**
     * Sets the value of the dealDeclarationMarkings property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealDeclarationMarkingsSearchResult }
     *     
     */
    public void setDealDeclarationMarkings(DealDeclarationMarkingsSearchResult value) {
        this.dealDeclarationMarkings = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPageSize(BigInteger value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPageNumber(BigInteger value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

}
