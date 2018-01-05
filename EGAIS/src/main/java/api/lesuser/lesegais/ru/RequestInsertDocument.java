
package api.lesuser.lesegais.ru;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import ptr.mule.exchange.Map;


/**
 * Запрос на добавление документа.
 * 
 * <p>Java class for RequestInsertDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestInsertDocument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.lesuser.lesegais.ru/}LesUserAbstractRequest">
 *       &lt;choice>
 *         &lt;element name="dealDeclaration" type="{http://data.lesuser.lesegais.ru/}PartialDealDeclaration"/>
 *         &lt;element name="dealDeclarationReport" type="{http://data.lesuser.lesegais.ru/}PartialDealDeclarationReport"/>
 *         &lt;element name="dealDeclarationMarkings" type="{http://data.lesuser.lesegais.ru/}PartialDealDeclarationMarkings"/>
 *         &lt;element name="duplicate" type="{http://data.lesuser.lesegais.ru/}DocumentRef" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestInsertDocument", namespace = "http://api.lesuser.lesegais.ru/", propOrder = {
    "dealDeclaration",
    "dealDeclarationReport",
    "dealDeclarationMarkings",
    "duplicate"
})
@XmlRootElement(name = "RequestInsertDocument")
public class RequestInsertDocument
    extends LesUserAbstractRequest 
{
    @XmlElement(name = "dealDeclaration")
	protected PartialDealDeclaration dealDeclaration;
    @XmlElement(name = "dealDeclarationReport")
    protected PartialDealDeclarationReport dealDeclarationReport;
    @XmlElement(name = "dealDeclarationMarkings")
    protected PartialDealDeclarationMarkings dealDeclarationMarkings;    
    @XmlElement(name = "duplicate")
    protected List<DocumentRef> duplicate;
    
    public RequestInsertDocument(){};
    
    public RequestInsertDocument(Map map, String type, String partyValue)
    {
    	
    	if ("deal".equals(type))
    	{
    		this.dealDeclaration = new PartialDealDeclaration(map);
    		this.dealDeclaration.setSellerId(partyValue);
    	}
    	else if ("report".equals(type))
    	{
    		this.dealDeclarationReport = new PartialDealDeclarationReport(map);
    		this.dealDeclarationReport.setSellerId(partyValue);
    	}
    	
    	
    	
    }
    
    @Override
    public void setCurrentTime(String time)
    {    	
    	if (this.dealDeclaration != null)
    	{
    		if ((time == null || "".equals(time.trim())) && this.getDealDeclaration().getClientCreateTime() == null)
    			this.dealDeclaration.setClientCreateTime(Map.getDateInXMLGregorianCalendarFormat(Map.getNow()));
    	}
    	else if (this.dealDeclarationReport != null)
    	{
    		if ((time == null || "".equals(time.trim())) && this.getDealDeclarationReport().getClientCreateTime() == null)
    			this.dealDeclarationReport.setClientCreateTime(Map.getDateInXMLGregorianCalendarFormat(Map.getNow()));
    	}
    	
    }
    
	@Override
	public XMLGregorianCalendar getCurrentTime() {
		
		if (this.dealDeclaration != null)
		{
			return this.dealDeclaration.getClientCreateTime();
		}
		else if (this.dealDeclarationReport != null)
		{
			return this.dealDeclarationReport.getClientCreateTime();
		}
		
		return null;
		
	}

    /**
     * Gets the value of the dealDeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link PartialDealDeclaration }
     *     
     */
    public PartialDealDeclaration getDealDeclaration() {
        return dealDeclaration;
    }

    /**
     * Sets the value of the dealDeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialDealDeclaration }
     *     
     */
    public void setDealDeclaration(PartialDealDeclaration value) {
        this.dealDeclaration = value;
    }

    /**
     * Gets the value of the dealDeclarationReport property.
     * 
     * @return
     *     possible object is
     *     {@link PartialDealDeclarationReport }
     *     
     */
    public PartialDealDeclarationReport getDealDeclarationReport() {
        return dealDeclarationReport;
    }

    /**
     * Sets the value of the dealDeclarationReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialDealDeclarationReport }
     *     
     */
    public void setDealDeclarationReport(PartialDealDeclarationReport value) {
        this.dealDeclarationReport = value;
    }

    /**
     * Gets the value of the dealDeclarationMarkings property.
     * 
     * @return
     *     possible object is
     *     {@link PartialDealDeclarationMarkings }
     *     
     */
    public PartialDealDeclarationMarkings getDealDeclarationMarkings() {
        return dealDeclarationMarkings;
    }

    /**
     * Sets the value of the dealDeclarationMarkings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialDealDeclarationMarkings }
     *     
     */
    public void setDealDeclarationMarkings(PartialDealDeclarationMarkings value) {
        this.dealDeclarationMarkings = value;
    }

    /**
     * Gets the value of the duplicate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the duplicate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDuplicate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentRef }
     * 
     * 
     */
    public List<DocumentRef> getDuplicate() {
        if (duplicate == null) {
            duplicate = new ArrayList<DocumentRef>();
        }
        return this.duplicate;
    }



}
