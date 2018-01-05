
package api.lesuser.lesegais.ru;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Местоположение - элемент лесного участка или лесосеки
 * 
 * <p>Java class for WoodlotElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WoodlotElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elementNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="constituentEntityId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="forestryId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subForestryId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forestBlockNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="surveyPlotRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WoodlotElement", propOrder = {
    "elementNumber",
    "constituentEntityId",
    "forestryId",
    "subForestryId",
    "tractId",
    "forestBlockNumber",
    "surveyPlotRange",
    "area"
})
@XmlSeeAlso({
    WoodlotElementVolumeInfo.class
})
public class WoodlotElement {

    @XmlElement(required = true)
    protected BigInteger elementNumber;
    @XmlElement(required = true)
    protected BigInteger constituentEntityId;
    @XmlElement(required = true)
    protected String forestryId;
    @XmlElement(required = true)
    protected String subForestryId;
    protected String tractId;
    @XmlElement(required = true)
    protected String forestBlockNumber;
    protected String surveyPlotRange;
    protected double area;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the elementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getElementNumber() {
        return elementNumber;
    }

    /**
     * Sets the value of the elementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setElementNumber(BigInteger value) {
        this.elementNumber = value;
    }

    /**
     * Gets the value of the constituentEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConstituentEntityId() {
        return constituentEntityId;
    }

    /**
     * Sets the value of the constituentEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConstituentEntityId(BigInteger value) {
        this.constituentEntityId = value;
    }

    /**
     * Gets the value of the forestryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForestryId() {
        return forestryId;
    }

    /**
     * Sets the value of the forestryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForestryId(String value) {
        this.forestryId = value;
    }

    /**
     * Gets the value of the subForestryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubForestryId() {
        return subForestryId;
    }

    /**
     * Sets the value of the subForestryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubForestryId(String value) {
        this.subForestryId = value;
    }

    /**
     * Gets the value of the tractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTractId() {
        return tractId;
    }

    /**
     * Sets the value of the tractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTractId(String value) {
        this.tractId = value;
    }

    /**
     * Gets the value of the forestBlockNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForestBlockNumber() {
        return forestBlockNumber;
    }

    /**
     * Sets the value of the forestBlockNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForestBlockNumber(String value) {
        this.forestBlockNumber = value;
    }

    /**
     * Gets the value of the surveyPlotRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveyPlotRange() {
        return surveyPlotRange;
    }

    /**
     * Sets the value of the surveyPlotRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveyPlotRange(String value) {
        this.surveyPlotRange = value;
    }

    /**
     * Gets the value of the area property.
     * 
     */
    public double getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     */
    public void setArea(double value) {
        this.area = value;
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
