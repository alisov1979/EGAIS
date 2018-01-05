
package api.lesuser.lesegais.ru;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Госконтракты (данные о контрактах, указанных в части 5 статьи 19 лесного кодекса
 *                 Российской федерации)
 * 
 * <p>Java class for ContractForestWorks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractForestWorks">
 *   &lt;complexContent>
 *     &lt;extension base="{http://data.lesuser.lesegais.ru/}CommonContract">
 *       &lt;sequence>
 *         &lt;element name="stateAuthorityId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="coniferousVolume" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="hardwoodVolume" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="softwoodVolume" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unclassifiedVolume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="relatedPlantsSaleContractId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractForestWorks", propOrder = {
    "stateAuthorityId",
    "coniferousVolume",
    "hardwoodVolume",
    "softwoodVolume",
    "unclassifiedVolume",
    "relatedPlantsSaleContractId"
})
public class ContractForestWorks
    extends CommonContract
{

    @XmlElement(required = true)
    protected BigInteger stateAuthorityId;
    protected double coniferousVolume;
    protected double hardwoodVolume;
    protected double softwoodVolume;
    protected Double unclassifiedVolume;
    protected List<String> relatedPlantsSaleContractId;

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
     * Gets the value of the relatedPlantsSaleContractId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedPlantsSaleContractId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedPlantsSaleContractId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRelatedPlantsSaleContractId() {
        if (relatedPlantsSaleContractId == null) {
            relatedPlantsSaleContractId = new ArrayList<String>();
        }
        return this.relatedPlantsSaleContractId;
    }

}
