
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информацию о документе-основании
 * 
 * <p>Java class for UnderLyingDocumentShortInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnderLyingDocumentShortInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://common.lesuser.lesegais.ru/}ObjectBase">
 *       &lt;sequence>
 *         &lt;element name="contractLeaseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractPermanentRightId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractPlantsSaleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="governmentContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherContractDealId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://common.lesuser.lesegais.ru/}EgaisManagedCommonAttributes"/>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderLyingDocumentShortInfo", propOrder = {
    "contractLeaseId",
    "contractPermanentRightId",
    "contractPlantsSaleId",
    "governmentContractId",
    "otherContractDealId"
})
public class UnderLyingDocumentShortInfo
    extends ObjectBase
{

    protected String contractLeaseId;
    protected String contractPermanentRightId;
    protected String contractPlantsSaleId;
    protected String governmentContractId;
    protected String otherContractDealId;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "createDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlAttribute(name = "updateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
    @XmlAttribute(name = "sourceSystem")
    protected String sourceSystem;
    @XmlAttribute(name = "createdBy")
    protected String createdBy;
    @XmlAttribute(name = "updatedBy")
    protected String updatedBy;
    @XmlAttribute(name = "updatedBySystem")
    protected String updatedBySystem;

    /**
     * Gets the value of the contractLeaseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractLeaseId() {
        return contractLeaseId;
    }

    /**
     * Sets the value of the contractLeaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractLeaseId(String value) {
        this.contractLeaseId = value;
    }

    /**
     * Gets the value of the contractPermanentRightId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractPermanentRightId() {
        return contractPermanentRightId;
    }

    /**
     * Sets the value of the contractPermanentRightId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractPermanentRightId(String value) {
        this.contractPermanentRightId = value;
    }

    /**
     * Gets the value of the contractPlantsSaleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractPlantsSaleId() {
        return contractPlantsSaleId;
    }

    /**
     * Sets the value of the contractPlantsSaleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractPlantsSaleId(String value) {
        this.contractPlantsSaleId = value;
    }

    /**
     * Gets the value of the governmentContractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentContractId() {
        return governmentContractId;
    }

    /**
     * Sets the value of the governmentContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentContractId(String value) {
        this.governmentContractId = value;
    }

    /**
     * Gets the value of the otherContractDealId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherContractDealId() {
        return otherContractDealId;
    }

    /**
     * Sets the value of the otherContractDealId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherContractDealId(String value) {
        this.otherContractDealId = value;
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

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystem(String value) {
        this.sourceSystem = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedBy(String value) {
        this.updatedBy = value;
    }

    /**
     * Gets the value of the updatedBySystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedBySystem() {
        return updatedBySystem;
    }

    /**
     * Sets the value of the updatedBySystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedBySystem(String value) {
        this.updatedBySystem = value;
    }

}
