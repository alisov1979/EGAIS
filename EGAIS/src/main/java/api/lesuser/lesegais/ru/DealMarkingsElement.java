
package api.lesuser.lesegais.ru;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Маркировки
 * 
 * <p>Java class for DealMarkingsElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealMarkingsElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="markingLabelNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tnvedClassId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="reasonTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="reasonText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" use="required" type="{http://common.lesuser.lesegais.ru/}ObjectStatus" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealMarkingsElement", propOrder = {
    "markingLabelNumber",
    "tnvedClassId",
    "volume",
    "reasonTypeId",
    "reasonText"
})
public class DealMarkingsElement {

    @XmlElement(required = true)
    protected String markingLabelNumber;
    protected BigInteger tnvedClassId;
    protected double volume;
    protected BigInteger reasonTypeId;
    protected String reasonText;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "status", required = true)
    protected ObjectStatus status;

    /**
     * Gets the value of the markingLabelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkingLabelNumber() {
        return markingLabelNumber;
    }

    /**
     * Sets the value of the markingLabelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkingLabelNumber(String value) {
        this.markingLabelNumber = value;
    }

    /**
     * Gets the value of the tnvedClassId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTnvedClassId() {
        return tnvedClassId;
    }

    /**
     * Sets the value of the tnvedClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTnvedClassId(BigInteger value) {
        this.tnvedClassId = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     */
    public void setVolume(double value) {
        this.volume = value;
    }

    /**
     * Gets the value of the reasonTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReasonTypeId() {
        return reasonTypeId;
    }

    /**
     * Sets the value of the reasonTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReasonTypeId(BigInteger value) {
        this.reasonTypeId = value;
    }

    /**
     * Gets the value of the reasonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonText() {
        return reasonText;
    }

    /**
     * Sets the value of the reasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonText(String value) {
        this.reasonText = value;
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

}
