
package api.lesuser.lesegais.ru;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Базовый документ, содержит в себе набор элементов, присутствующих в каждом типе документа (договора,
 *                 сделки).
 * 
 * <p>Java class for DocumentBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://common.lesuser.lesegais.ru/}ObjectBase">
 *       &lt;sequence>
 *         &lt;element name="contractNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="landTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="status" type="{http://common.lesuser.lesegais.ru/}ObjectStatus" minOccurs="0"/>
 *         &lt;element name="receiptDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="registrationFailReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signatureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastUpdateReason" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastUpdateReasonText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientCreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentBase", propOrder = {
    "contractNumber",
    "landTypeId",
    "status",
    "receiptDate",
    "registrationFailReason",
    "signatureDate",
    "lastUpdateReason",
    "lastUpdateReasonText",
    "clientCreateTime"
})
@XmlSeeAlso({
    ContractForestDeclarationReportBase.class,
    CommonContract.class
})
public class DocumentBase
    extends ObjectBase
{

    @XmlElement(required = true)
    protected String contractNumber;
    protected BigInteger landTypeId;
    @XmlSchemaType(name = "string")
    protected ObjectStatus status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receiptDate;
    protected String registrationFailReason;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signatureDate;
    protected BigInteger lastUpdateReason;
    protected String lastUpdateReasonText;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clientCreateTime;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the landTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLandTypeId() {
        return landTypeId;
    }

    /**
     * Sets the value of the landTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLandTypeId(BigInteger value) {
        this.landTypeId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectStatus }
     *     
     */
    public ObjectStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectStatus }
     *     
     */
    public void setStatus(ObjectStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the receiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiptDate() {
        return receiptDate;
    }

    /**
     * Sets the value of the receiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiptDate(XMLGregorianCalendar value) {
        this.receiptDate = value;
    }

    /**
     * Gets the value of the registrationFailReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationFailReason() {
        return registrationFailReason;
    }

    /**
     * Sets the value of the registrationFailReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationFailReason(String value) {
        this.registrationFailReason = value;
    }

    /**
     * Gets the value of the signatureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignatureDate() {
        return signatureDate;
    }

    /**
     * Sets the value of the signatureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignatureDate(XMLGregorianCalendar value) {
        this.signatureDate = value;
    }

    /**
     * Gets the value of the lastUpdateReason property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastUpdateReason() {
        return lastUpdateReason;
    }

    /**
     * Sets the value of the lastUpdateReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastUpdateReason(BigInteger value) {
        this.lastUpdateReason = value;
    }

    /**
     * Gets the value of the lastUpdateReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateReasonText() {
        return lastUpdateReasonText;
    }

    /**
     * Sets the value of the lastUpdateReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateReasonText(String value) {
        this.lastUpdateReasonText = value;
    }

    /**
     * Gets the value of the clientCreateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClientCreateTime() {
        return clientCreateTime;
    }

    /**
     * Sets the value of the clientCreateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClientCreateTime(XMLGregorianCalendar value) {
        this.clientCreateTime = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
