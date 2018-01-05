
package api.lesuser.lesegais.ru;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Запрос на получение документа.
 * 
 * <p>Java class for RequestGetDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestGetDocument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.lesuser.lesegais.ru/}LesUserAbstractRequest">
 *       &lt;choice>
 *         &lt;element name="dealDeclaration" type="{http://data.lesuser.lesegais.ru/}DealDeclarationFilter"/>
 *         &lt;element name="dealDeclarationReport" type="{http://data.lesuser.lesegais.ru/}DealDeclarationReportFilter"/>
 *         &lt;element name="dealDeclarationMarkings" type="{http://data.lesuser.lesegais.ru/}DealDeclarationMarkingsFilter"/>
 *       &lt;/choice>
 *       &lt;attribute name="pageSize" type="{http://www.w3.org/2001/XMLSchema}integer" default="10" />
 *       &lt;attribute name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestGetDocument", namespace = "http://api.lesuser.lesegais.ru/", propOrder = {
    "dealDeclaration",
    "dealDeclarationReport",
    "dealDeclarationMarkings"
})
public class RequestGetDocument
    extends LesUserAbstractRequest
{

    protected DealDeclarationFilter dealDeclaration;
    protected DealDeclarationReportFilter dealDeclarationReport;
    protected DealDeclarationMarkingsFilter dealDeclarationMarkings;
    @XmlAttribute(name = "pageSize")
    protected BigInteger pageSize;
    @XmlAttribute(name = "pageNumber")
    protected BigInteger pageNumber;

    /**
     * Gets the value of the dealDeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link DealDeclarationFilter }
     *     
     */
    public DealDeclarationFilter getDealDeclaration() {
        return dealDeclaration;
    }

    /**
     * Sets the value of the dealDeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealDeclarationFilter }
     *     
     */
    public void setDealDeclaration(DealDeclarationFilter value) {
        this.dealDeclaration = value;
    }

    /**
     * Gets the value of the dealDeclarationReport property.
     * 
     * @return
     *     possible object is
     *     {@link DealDeclarationReportFilter }
     *     
     */
    public DealDeclarationReportFilter getDealDeclarationReport() {
        return dealDeclarationReport;
    }

    /**
     * Sets the value of the dealDeclarationReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealDeclarationReportFilter }
     *     
     */
    public void setDealDeclarationReport(DealDeclarationReportFilter value) {
        this.dealDeclarationReport = value;
    }

    /**
     * Gets the value of the dealDeclarationMarkings property.
     * 
     * @return
     *     possible object is
     *     {@link DealDeclarationMarkingsFilter }
     *     
     */
    public DealDeclarationMarkingsFilter getDealDeclarationMarkings() {
        return dealDeclarationMarkings;
    }

    /**
     * Sets the value of the dealDeclarationMarkings property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealDeclarationMarkingsFilter }
     *     
     */
    public void setDealDeclarationMarkings(DealDeclarationMarkingsFilter value) {
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
        if (pageSize == null) {
            return new BigInteger("10");
        } else {
            return pageSize;
        }
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
        if (pageNumber == null) {
            return new BigInteger("0");
        } else {
            return pageNumber;
        }
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

	@Override
	public void setCurrentTime(String time) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public XMLGregorianCalendar getCurrentTime() {
		// TODO Auto-generated method stub
		return null;
	}

}
