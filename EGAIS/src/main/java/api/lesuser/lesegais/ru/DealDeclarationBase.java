
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Базовый документ по декларациям
 * 
 * <p>Java class for DealDeclarationBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealDeclarationBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://common.lesuser.lesegais.ru/}ObjectBase">
 *       &lt;sequence>
 *         &lt;element name="sellerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="buyerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="declarationType" type="{http://common.lesuser.lesegais.ru/}DeclarationType"/>
 *         &lt;element name="saleContractShortInfo" type="{http://data.lesuser.lesegais.ru/}SaleContractShortInfo"/>
 *         &lt;element name="clientCreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="registrationFailReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dealNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isBuyer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *       &lt;attribute name="status" type="{http://common.lesuser.lesegais.ru/}ObjectStatus" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealDeclarationBase", namespace = "http://data.lesuser.lesegais.ru/", propOrder = {
    "sellerId",
    "buyerId",
    "declarationType",
    "saleContractShortInfo",
    "clientCreateTime",
    "registrationFailReason",
    "dealNumber",
    "isBuyer"
})
@XmlSeeAlso({
    PartialDealDeclarationReport.class,
    PartialDealDeclarationMarkings.class,
    PartialDealDeclaration.class
})
@XmlRootElement(name = "DealDeclarationBase", namespace = "http://data.lesuser.lesegais.ru/")
public class DealDeclarationBase
    extends ObjectBase
{

    @XmlElement(name = "sellerId",required = true)
    protected String sellerId;
    @XmlElement(name = "buyerId", required = true)
    protected String buyerId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DeclarationType declarationType;
    @XmlElement(required = true)
    protected SaleContractShortInfo saleContractShortInfo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clientCreateTime;
    @XmlElement(name = "registrationFailReason")
    protected String registrationFailReason;
    @XmlElement(name = "dealNumber")
    protected String dealNumber;
    @XmlElement(name = "isBuyer")
    protected Boolean isBuyer;
    @XmlAttribute(name = "status")
    protected ObjectStatus status;
    
    


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
     * Gets the value of the isBuyer property.
     * 
     */
    public boolean isIsBuyer() {
        return isBuyer;
    }

    /**
     * Sets the value of the isBuyer property.
     * 
     */
    public void setIsBuyer(boolean value) {
        this.isBuyer = value;
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

}
