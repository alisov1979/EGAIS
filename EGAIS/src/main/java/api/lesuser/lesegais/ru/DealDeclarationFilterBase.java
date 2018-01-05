
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Базовый фильтр по декларациям
 * 
 * <p>Java class for DealDeclarationFilterBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealDeclarationFilterBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://common.lesuser.lesegais.ru/}ObjectBase">
 *       &lt;sequence>
 *         &lt;element name="sellerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="declarationType" type="{http://common.lesuser.lesegais.ru/}DeclarationType" minOccurs="0"/>
 *         &lt;element name="saleContractShortInfo" type="{http://data.lesuser.lesegais.ru/}SaleContractShortInfo" minOccurs="0"/>
 *         &lt;element name="clientCreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dealNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://common.lesuser.lesegais.ru/}EgaisManagedCommonAttributes"/>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://common.lesuser.lesegais.ru/}ObjectStatus" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealDeclarationFilterBase", propOrder = {
    "sellerId",
    "buyerId",
    "declarationType",
    "saleContractShortInfo",
    "clientCreateTime",
    "dealNumber"
})
@XmlSeeAlso({
    DealDeclarationFilter.class
})
public class DealDeclarationFilterBase
    extends ObjectBase
{

    protected String sellerId;
    protected String buyerId;
    @XmlSchemaType(name = "string")
    protected DeclarationType declarationType;
    protected SaleContractShortInfo saleContractShortInfo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clientCreateTime;
    protected String dealNumber;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "status")
    protected ObjectStatus status;
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
     * Gets the value of the sellerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * Sets the value of the sellerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerId(String value) {
        this.sellerId = value;
    }

    /**
     * Gets the value of the buyerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerId() {
        return buyerId;
    }

    /**
     * Sets the value of the buyerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerId(String value) {
        this.buyerId = value;
    }

    /**
     * Gets the value of the declarationType property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationType }
     *     
     */
    public DeclarationType getDeclarationType() {
        return declarationType;
    }

    /**
     * Sets the value of the declarationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationType }
     *     
     */
    public void setDeclarationType(DeclarationType value) {
        this.declarationType = value;
    }

    /**
     * Gets the value of the saleContractShortInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SaleContractShortInfo }
     *     
     */
    public SaleContractShortInfo getSaleContractShortInfo() {
        return saleContractShortInfo;
    }

    /**
     * Sets the value of the saleContractShortInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleContractShortInfo }
     *     
     */
    public void setSaleContractShortInfo(SaleContractShortInfo value) {
        this.saleContractShortInfo = value;
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
     * Gets the value of the dealNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealNumber() {
        return dealNumber;
    }

    /**
     * Sets the value of the dealNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealNumber(String value) {
        this.dealNumber = value;
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
