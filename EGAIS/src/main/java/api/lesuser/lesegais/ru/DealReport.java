
package api.lesuser.lesegais.ru;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import ptr.mule.exchange.Map;


/**
 * Массив отчетов
 * 
 * <p>Java class for DealReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compositionElement" type="{http://data.lesuser.lesegais.ru/}CompositionHardwood" maxOccurs="unbounded"/>
 *         &lt;element name="reasonTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="reasonText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" use="required" type="{http://common.lesuser.lesegais.ru/}ObjectStatus" />
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealReport", propOrder = {
    "compositionElement",
    "reasonTypeId",
    "reasonText"
}, namespace = "http://data.lesuser.lesegais.ru/")
@XmlRootElement(name = "DealReport", namespace = "http://data.lesuser.lesegais.ru/")
public class DealReport {

    @XmlElement(required = true)
    protected List<CompositionHardwood> compositionElement;
    protected BigInteger reasonTypeId;
    protected String reasonText;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "status", required = true)
    protected ObjectStatus status;
    @XmlAttribute(name = "number")
    protected BigInteger number;
    
    public DealReport(){};
    
    public DealReport(Map map)
    {
    	
    	this.status = ObjectStatus.DRAFT;
    	this.compositionElement = new ArrayList<>();
    	
    	int i = 0;
    	if (map != null && map.NextItem("Документ.ПТР_ОтчетыЕГАИСУчетДревесины.Факт") )
    	{
    		while(map.NextRow(i))
    		{
    			this.compositionElement.add(new CompositionHardwood(i + 1, map));
        		i ++;	
    		}   		
    	}   	
    	
    }

    /**
     * Gets the value of the compositionElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositionElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositionElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositionHardwood }
     * 
     * 
     */
    public List<CompositionHardwood> getCompositionElement() {
        if (compositionElement == null) {
            compositionElement = new ArrayList<CompositionHardwood>();
        }
        return this.compositionElement;
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

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

}
