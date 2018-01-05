
package api.lesuser.lesegais.ru;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Запрос на получение созданных или измененых документов с указанной даты.
 *                 Документы возвращаются согласно правам доступа учетной записи.
 * 
 * <p>Java class for RequestGetModifiedDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestGetModifiedDocuments">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.lesuser.lesegais.ru/}LesUserAbstractRequest">
 *       &lt;attribute name="createOrUpdateDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="documentType" use="required" type="{http://data.lesuser.lesegais.ru/}DocumentType" />
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
@XmlType(name = "RequestGetModifiedDocuments", namespace = "http://api.lesuser.lesegais.ru/")
public class RequestGetModifiedDocuments
    extends LesUserAbstractRequest
{

    @XmlAttribute(name = "createOrUpdateDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createOrUpdateDateFrom;
    @XmlAttribute(name = "documentType", required = true)
    protected DocumentType documentType;
    @XmlAttribute(name = "pageSize")
    protected BigInteger pageSize;
    @XmlAttribute(name = "pageNumber")
    protected BigInteger pageNumber;

    /**
     * Gets the value of the createOrUpdateDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateOrUpdateDateFrom() {
        return createOrUpdateDateFrom;
    }

    /**
     * Sets the value of the createOrUpdateDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateOrUpdateDateFrom(XMLGregorianCalendar value) {
        this.createOrUpdateDateFrom = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDocumentType(DocumentType value) {
        this.documentType = value;
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
