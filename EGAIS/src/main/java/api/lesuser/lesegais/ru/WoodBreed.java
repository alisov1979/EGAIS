
package api.lesuser.lesegais.ru;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * ������������ �������� �������� �������� breed_id, ������� ������������ ������, ��� ������ (���������) � class_id, �������� �� �������� ����� �������������� � ������� ����������� ��������� (�������� � ������� � ������). �������� ��������, � ����������� ������������ ������ ���� �����, ��������� � �������� � ������ `type`, ������� ����� ��������� ��������� ��������:
 *                 `okpd` - ����� �������� ����������� ������������ ��� ������, ����������� ������ ���������� ���������. �������� � ������ ������ �� �������������� ����2. � ���� ������, � ������� ����������� ���������, �������� �� `class_id` ������ ����� ������������ � ������� `woodClassId`
 *                 `tnved` - �������� ����������� � ����� ����� ������ �������������� ������ � ������� � ������������ ����������, ����������� ������������� (����������). � ���� ������, �������� �� ���� `class_id` ���������� ����� ��������� � ���� `tnvedClassId`. ������ ���� � ������������ � `class_name` �������� ������ �� �������������� ����� (����������� �����).
 *                 ������ � ��������� ���������� � ����� �� ����� `*deprecated` �������� ������������� � �� ����� �������������� � ����� ����������.
 * 
 * <p>Java class for WoodBreed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WoodBreed">
 *   &lt;complexContent>
 *     &lt;extension base="{http://common.lesuser.lesegais.ru/}ObjectBase">
 *       &lt;attGroup ref="{http://common.lesuser.lesegais.ru/}EgaisManagedCommonAttributes"/>
 *       &lt;attribute name="type" type="{http://lookup.lesuser.lesegais.ru/}WoodBreedType" />
 *       &lt;attribute name="breedId" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="breedName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="breedDeprecated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="classId" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="className" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="classOkpdCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="classDeprecated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WoodBreed", namespace = "http://lookup.lesuser.lesegais.ru/")
public class WoodBreed
    extends ObjectBase
{

    @XmlAttribute(name = "type")
    protected WoodBreedType type;
    @XmlAttribute(name = "breedId")
    protected BigInteger breedId;
    @XmlAttribute(name = "breedName")
    protected String breedName;
    @XmlAttribute(name = "breedDeprecated")
    protected Boolean breedDeprecated;
    @XmlAttribute(name = "classId")
    protected BigInteger classId;
    @XmlAttribute(name = "className")
    protected String className;
    @XmlAttribute(name = "classOkpdCode")
    protected String classOkpdCode;
    @XmlAttribute(name = "classDeprecated")
    protected Boolean classDeprecated;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link WoodBreedType }
     *     
     */
    public WoodBreedType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link WoodBreedType }
     *     
     */
    public void setType(WoodBreedType value) {
        this.type = value;
    }

    /**
     * Gets the value of the breedId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBreedId() {
        return breedId;
    }

    /**
     * Sets the value of the breedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBreedId(BigInteger value) {
        this.breedId = value;
    }

    /**
     * Gets the value of the breedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreedName() {
        return breedName;
    }

    /**
     * Sets the value of the breedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreedName(String value) {
        this.breedName = value;
    }

    /**
     * Gets the value of the breedDeprecated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBreedDeprecated() {
        return breedDeprecated;
    }

    /**
     * Sets the value of the breedDeprecated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBreedDeprecated(Boolean value) {
        this.breedDeprecated = value;
    }

    /**
     * Gets the value of the classId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClassId() {
        return classId;
    }

    /**
     * Sets the value of the classId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClassId(BigInteger value) {
        this.classId = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the classOkpdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassOkpdCode() {
        return classOkpdCode;
    }

    /**
     * Sets the value of the classOkpdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassOkpdCode(String value) {
        this.classOkpdCode = value;
    }

    /**
     * Gets the value of the classDeprecated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassDeprecated() {
        return classDeprecated;
    }

    /**
     * Sets the value of the classDeprecated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassDeprecated(Boolean value) {
        this.classDeprecated = value;
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
