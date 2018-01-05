
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
 * База для: Лесная декларация / отчет об использовании лесов
 * 
 * <p>Java class for ContractForestDeclarationReportBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractForestDeclarationReportBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://data.lesuser.lesegais.ru/}DocumentBase">
 *       &lt;sequence>
 *         &lt;element name="stateAuthorityId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="partyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="underlyingContractRef" type="{http://data.lesuser.lesegais.ru/}DocumentRef"/>
 *         &lt;element name="woodlotElements" type="{http://data.lesuser.lesegais.ru/}WoodlotElementVolumeInfoList"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://common.lesuser.lesegais.ru/}EgaisManagedCommonAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractForestDeclarationReportBase", propOrder = {
    "stateAuthorityId",
    "partyId",
    "underlyingContractRef",
    "woodlotElements",
    "startDate"
})
@XmlSeeAlso({
    ContractReport.class,
    ContractForestDeclaration.class
})
public class ContractForestDeclarationReportBase
    extends DocumentBase
{

    @XmlElement(required = true)
    protected BigInteger stateAuthorityId;
    @XmlElement(required = true)
    protected String partyId;
    @XmlElement(required = true)
    protected DocumentRef underlyingContractRef;
    @XmlElement(required = true)
    protected WoodlotElementVolumeInfoList woodlotElements;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
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
     * Gets the value of the stateAuthorityId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStateAuthorityId() {
        return stateAuthorityId;
    }

    /**
     * Sets the value of the stateAuthorityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStateAuthorityId(BigInteger value) {
        this.stateAuthorityId = value;
    }

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyId(String value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the underlyingContractRef property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentRef }
     *     
     */
    public DocumentRef getUnderlyingContractRef() {
        return underlyingContractRef;
    }

    /**
     * Sets the value of the underlyingContractRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentRef }
     *     
     */
    public void setUnderlyingContractRef(DocumentRef value) {
        this.underlyingContractRef = value;
    }

    /**
     * Gets the value of the woodlotElements property.
     * 
     * @return
     *     possible object is
     *     {@link WoodlotElementVolumeInfoList }
     *     
     */
    public WoodlotElementVolumeInfoList getWoodlotElements() {
        return woodlotElements;
    }

    /**
     * Sets the value of the woodlotElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link WoodlotElementVolumeInfoList }
     *     
     */
    public void setWoodlotElements(WoodlotElementVolumeInfoList value) {
        this.woodlotElements = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
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
