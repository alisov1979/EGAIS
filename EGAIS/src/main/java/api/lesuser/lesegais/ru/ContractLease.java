
package api.lesuser.lesegais.ru;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ������� ������ ������ ��������
 * 
 * <p>Java class for ContractLease complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractLease">
 *   &lt;complexContent>
 *     &lt;extension base="{http://data.lesuser.lesegais.ru/}CommonContract">
 *       &lt;sequence>
 *         &lt;element name="stateAuthorityId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="coniferousVolume" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="hardwoodVolume" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="softwoodVolume" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unclassifiedVolume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="governmentRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subLeases" type="{http://data.lesuser.lesegais.ru/}SubLeaseList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractLease", propOrder = {
    "stateAuthorityId",
    "coniferousVolume",
    "hardwoodVolume",
    "softwoodVolume",
    "unclassifiedVolume",
    "governmentRegistrationNumber",
    "subLeases"
})
public class ContractLease
    extends CommonContract
{

    @XmlElement(required = true)
    protected BigInteger stateAuthorityId;
    protected double coniferousVolume;
    protected double hardwoodVolume;
    protected double softwoodVolume;
    protected Double unclassifiedVolume;
    protected String governmentRegistrationNumber;
    protected SubLeaseList subLeases;

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
     * Gets the value of the coniferousVolume property.
     * 
     */
    public double getConiferousVolume() {
        return coniferousVolume;
    }

    /**
     * Sets the value of the coniferousVolume property.
     * 
     */
    public void setConiferousVolume(double value) {
        this.coniferousVolume = value;
    }

    /**
     * Gets the value of the hardwoodVolume property.
     * 
     */
    public double getHardwoodVolume() {
        return hardwoodVolume;
    }

    /**
     * Sets the value of the hardwoodVolume property.
     * 
     */
    public void setHardwoodVolume(double value) {
        this.hardwoodVolume = value;
    }

    /**
     * Gets the value of the softwoodVolume property.
     * 
     */
    public double getSoftwoodVolume() {
        return softwoodVolume;
    }

    /**
     * Sets the value of the softwoodVolume property.
     * 
     */
    public void setSoftwoodVolume(double value) {
        this.softwoodVolume = value;
    }

    /**
     * Gets the value of the unclassifiedVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnclassifiedVolume() {
        return unclassifiedVolume;
    }

    /**
     * Sets the value of the unclassifiedVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnclassifiedVolume(Double value) {
        this.unclassifiedVolume = value;
    }

    /**
     * Gets the value of the governmentRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentRegistrationNumber() {
        return governmentRegistrationNumber;
    }

    /**
     * Sets the value of the governmentRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentRegistrationNumber(String value) {
        this.governmentRegistrationNumber = value;
    }

    /**
     * Gets the value of the subLeases property.
     * 
     * @return
     *     possible object is
     *     {@link SubLeaseList }
     *     
     */
    public SubLeaseList getSubLeases() {
        return subLeases;
    }

    /**
     * Sets the value of the subLeases property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubLeaseList }
     *     
     */
    public void setSubLeases(SubLeaseList value) {
        this.subLeases = value;
    }

}
