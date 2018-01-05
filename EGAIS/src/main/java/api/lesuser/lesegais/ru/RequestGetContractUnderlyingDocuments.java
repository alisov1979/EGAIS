
package api.lesuser.lesegais.ru;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Запрос на получение данных справочника документов-оснований.
 * 
 * <p>Java class for RequestGetContractUnderlyingDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestGetContractUnderlyingDocuments">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.lesuser.lesegais.ru/}LesUserAbstractRequest">
 *       &lt;attribute name="lookupName" use="required" type="{http://api.lesuser.lesegais.ru/}UnderlyingDocumentType" />
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
@XmlType(name = "RequestGetContractUnderlyingDocuments", namespace = "http://api.lesuser.lesegais.ru/")
public class RequestGetContractUnderlyingDocuments
    extends LesUserAbstractRequest
{

    @XmlAttribute(name = "lookupName", required = true)
    protected UnderlyingDocumentType lookupName;
    @XmlAttribute(name = "pageSize")
    protected BigInteger pageSize;
    @XmlAttribute(name = "pageNumber")
    protected BigInteger pageNumber;

    /**
     * Gets the value of the lookupName property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingDocumentType }
     *     
     */
    public UnderlyingDocumentType getLookupName() {
        return lookupName;
    }

    /**
     * Sets the value of the lookupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingDocumentType }
     *     
     */
    public void setLookupName(UnderlyingDocumentType value) {
        this.lookupName = value;
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
