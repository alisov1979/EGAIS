
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import ptr.mule.exchange.Map;


/**
 * Информация о договоре купли-продажи древесины
 * 
 * <p>Java class for SaleContractShortInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaleContractShortInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signatureDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleContractShortInfo", namespace = "http://data.lesuser.lesegais.ru/",propOrder = {
    "contractNumber",
    "signatureDate",
    "endDate"
})
public class SaleContractShortInfo {

    @XmlElement(required = true)
    protected String contractNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar signatureDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    
    public SaleContractShortInfo(){};
    
    public SaleContractShortInfo(Map map)
    {
    	if (map != null && 
    			map.NextItem("Документ.ПТР_СделкиЕГАИСУчетДревесины") 
    			&& map.NextRow(0))
    	{
    		this.contractNumber = map.getString("НомерДоговора");
        	this.signatureDate 	= map.getDate("ДатаНачалаДействия");
        	this.endDate		= map.getDate("ДатаОкончанияДействия");	
    	}      	
    	else if(map != null && 
    			map.NextItem("Документ.ПТР_ОтчетыЕГАИСУчетДревесины") 
    			&& map.NextRow(0))
    	{
    		this.contractNumber = map.getString("НомерДоговора");
        	this.signatureDate 	= map.getDate("ДатаНачалаДействияДоговора");
        	this.endDate		= map.getDate("ДатаОкончанияДействияДоговора");	
    	}
    	
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the signatureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignatureDate() {
        return signatureDate;
    }

    /**
     * Sets the value of the signatureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignatureDate(XMLGregorianCalendar value) {
        this.signatureDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

}
