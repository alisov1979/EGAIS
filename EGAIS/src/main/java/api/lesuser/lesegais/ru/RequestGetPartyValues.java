
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Запрос на получение данных справочника Лесопользователей.
 * 
 * <p>Java class for RequestGetPartyValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestGetPartyValues">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.lesuser.lesegais.ru/}LesUserAbstractRequest">
 *       &lt;sequence>
 *         &lt;element name="filter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="inn" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="100" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="pageSize" type="{http://www.w3.org/2001/XMLSchema}integer" default="10" />
 *       &lt;attribute name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestGetPartyValues", namespace = "http://api.lesuser.lesegais.ru/", propOrder = {
    "filter"
})
@XmlRootElement(name = "RequestGetPartyValues")
public class RequestGetPartyValues
    extends LesUserAbstractRequest
{
	@XmlElement(name = "filter")
    protected RequestGetPartyValues.Filter filter;
    @XmlAttribute(name = "pageSize")
    protected BigInteger pageSize;
    @XmlAttribute(name = "pageNumber")
    protected BigInteger pageNumber;
    
    public RequestGetPartyValues()
    {
    	
    }
    
    public RequestGetPartyValues(String inn)
    {
    	this.pageSize 	= new BigInteger("10");
    	this.pageNumber = new BigInteger("0");
    	this.filter 	= new Filter(inn);
   
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link RequestGetPartyValues.Filter }
     *     
     */
    public RequestGetPartyValues.Filter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestGetPartyValues.Filter }
     *     
     */
    public void setFilter(RequestGetPartyValues.Filter value) {
        this.filter = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPageSize() {
        if (pageSize == null) {
            return new BigInteger("10");
        } else {
            return pageSize;
        }
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPageSize(BigInteger value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPageNumber() {
        if (pageNumber == null) {
            return new BigInteger("0");
        } else {
            return pageNumber;
        }
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPageNumber(BigInteger value) {
        this.pageNumber = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="inn" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="100" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inn"
    })
    public static class Filter {

        @XmlElement(namespace = "http://api.lesuser.lesegais.ru/")
        protected List<String> inn;
        
        public Filter(){}
        
        public Filter(String inn)
        {
        	this.inn = new ArrayList<>();
        	this.inn.add(inn);
        }

        /**
         * Gets the value of the inn property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inn property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInn().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getInn() {
            if (inn == null) {
                inn = new ArrayList<String>();
            }
            return this.inn;
        }

    }


	@Override
	public void setCurrentTime(String time) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public XMLGregorianCalendar getCurrentTime() {
		// TODO Auto-generated method stub
		return null;
	}

}
