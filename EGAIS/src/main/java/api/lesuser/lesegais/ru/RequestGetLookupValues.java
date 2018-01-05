
package api.lesuser.lesegais.ru;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * «апрос на получение данных справочника.
 * 
 * <p>Java class for RequestGetLookupValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestGetLookupValues">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.lesuser.lesegais.ru/}LesUserAbstractRequest">
 *       &lt;attribute name="lookupName" use="required" type="{http://api.lesuser.lesegais.ru/}LookupType" />
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
@XmlType(name = "RequestGetLookupValues", namespace = "http://api.lesuser.lesegais.ru/")
public class RequestGetLookupValues
    extends LesUserAbstractRequest
{

    @XmlAttribute(name = "lookupName", required = true)
    protected LookupType lookupName;
    @XmlAttribute(name = "pageSize")
    protected BigInteger pageSize;
    @XmlAttribute(name = "pageNumber")
    protected BigInteger pageNumber;

    /**
     * Gets the value of the lookupName property.
     * 
     * @return
     *     possible object is
     *     {@link LookupType }
     *     
     */
    public LookupType getLookupName() {
        return lookupName;
    }

    /**
     * Sets the value of the lookupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupType }
     *     
     */
    public void setLookupName(LookupType value) {
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
