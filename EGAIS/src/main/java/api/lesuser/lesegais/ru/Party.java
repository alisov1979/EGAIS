
package api.lesuser.lesegais.ru;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import ptr.mule.exchange.Map;


/**
 * Лесопользователь (Контрагент)
 * 
 * <p>Java class for Party complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Party">
 *   &lt;complexContent>
 *     &lt;extension base="{http://common.lesuser.lesegais.ru/}ObjectBase">
 *       &lt;sequence>
 *         &lt;element name="partyType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="inn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ogrn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personMidName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personDocTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="personDocSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personDocNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="physicalAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="goldenRecordId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="golden" type="{http://common.lesuser.lesegais.ru/}DuplicateStatus" minOccurs="0"/>
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
@XmlType(name = "Party", namespace = "http://lookup.lesuser.lesegais.ru/", propOrder = {
    "partyType",
    "inn",
    "ogrn",
    "partyName",
    "personFirstName",
    "personLastName",
    "personMidName",
    "personDocTypeId",
    "personDocSeries",
    "personDocNum",
    "physicalAddress",
    "goldenRecordId",
    "golden",
    "countryId"
})
public class Party
    extends ObjectBase
{

    @XmlElement(name = "partyType", required = true)
    protected BigInteger partyType;
    @XmlElement(name = "inn")
    protected String inn;
    @XmlElement(name = "ogrn")
    protected String ogrn;
    @XmlElement(name = "partyName")
    protected String partyName;
    @XmlElement(name = "personFirstName")
    protected String personFirstName;
    @XmlElement(name = "personLastName")
    protected String personLastName;
    @XmlElement(name = "personMidName")
    protected String personMidName;
    @XmlElement(name = "personDocTypeId")
    protected BigInteger personDocTypeId;
    @XmlElement(name = "personDocSeries")
    protected String personDocSeries;
    @XmlElement(name = "personDocNum")
    protected String personDocNum;
    @XmlElement(required = true)
    protected String physicalAddress;
    @XmlElement(name = "goldenRecordId")
    protected String goldenRecordId;
    @XmlSchemaType(name = "string")
    protected DuplicateStatus golden;
    @XmlElement(name = "countryId")
    protected BigInteger countryId;
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
    
    public Party(){};
    
    public Party(Map map)
    {
    	super();
    	//ИНН
    	this.inn 				= map.getString("ИНН");
    	//ОГРН
    	this.ogrn 				= map.getString("ОГРН");
    	//Фактический адрес
    	this.physicalAddress 	= map.getString("Адрес");
    	//ключ
    	this.sourceKey 			= "37";
    	//тип
    	this.partyType 			= new BigInteger("0");
    	//предопр. параметр
    	this.golden  			= DuplicateStatus.SINGLE;
    	//Наименование организации
    	this.partyName 			= map.getString("КонтрагентНаименованиеПолное");
    	
    }

    /**
     * Gets the value of the partyType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPartyType() {
        return partyType;
    }

    /**
     * Sets the value of the partyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPartyType(BigInteger value) {
        this.partyType = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInn(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOgrn() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOgrn(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the partyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName(String value) {
        this.partyName = value;
    }

    /**
     * Gets the value of the personFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonFirstName() {
        return personFirstName;
    }

    /**
     * Sets the value of the personFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonFirstName(String value) {
        this.personFirstName = value;
    }

    /**
     * Gets the value of the personLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonLastName() {
        return personLastName;
    }

    /**
     * Sets the value of the personLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonLastName(String value) {
        this.personLastName = value;
    }

    /**
     * Gets the value of the personMidName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonMidName() {
        return personMidName;
    }

    /**
     * Sets the value of the personMidName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonMidName(String value) {
        this.personMidName = value;
    }

    /**
     * Gets the value of the personDocTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersonDocTypeId() {
        return personDocTypeId;
    }

    /**
     * Sets the value of the personDocTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersonDocTypeId(BigInteger value) {
        this.personDocTypeId = value;
    }

    /**
     * Gets the value of the personDocSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonDocSeries() {
        return personDocSeries;
    }

    /**
     * Sets the value of the personDocSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonDocSeries(String value) {
        this.personDocSeries = value;
    }

    /**
     * Gets the value of the personDocNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonDocNum() {
        return personDocNum;
    }

    /**
     * Sets the value of the personDocNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonDocNum(String value) {
        this.personDocNum = value;
    }

    /**
     * Gets the value of the physicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalAddress() {
        return physicalAddress;
    }

    /**
     * Sets the value of the physicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalAddress(String value) {
        this.physicalAddress = value;
    }

    /**
     * Gets the value of the goldenRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoldenRecordId() {
        return goldenRecordId;
    }

    /**
     * Sets the value of the goldenRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoldenRecordId(String value) {
        this.goldenRecordId = value;
    }

    /**
     * Gets the value of the golden property.
     * 
     * @return
     *     possible object is
     *     {@link DuplicateStatus }
     *     
     */
    public DuplicateStatus getGolden() {
        return golden;
    }

    /**
     * Sets the value of the golden property.
     * 
     * @param value
     *     allowed object is
     *     {@link DuplicateStatus }
     *     
     */
    public void setGolden(DuplicateStatus value) {
        this.golden = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountryId(BigInteger value) {
        this.countryId = value;
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
