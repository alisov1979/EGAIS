
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import ptr.mule.exchange.Map;


/**
 * Запрос на обновление документа.
 *                 Обязательно указывать ID и updateDate.
 * 
 *                 По updateDate происходит проверка актуальности данных.
 *                 Если updateDate не совпадает с данными ЕГАИС то значит документ был изменен в ЕГАИС после синхронизации клиентом.
 *                 В этом случае клиенту следует запросить документ и смержить данные на свое стороны и повторить запрос обновления.
 * 
 * <p>Java class for RequestUpdateDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestUpdateDocument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.lesuser.lesegais.ru/}LesUserAbstractRequest">
 *       &lt;choice>
 *         &lt;element name="dealDeclaration" type="{http://data.lesuser.lesegais.ru/}DealDeclaration"/>
 *         &lt;element name="dealDeclarationReport" type="{http://data.lesuser.lesegais.ru/}DealDeclarationReport"/>
 *         &lt;element name="dealDeclarationMarkings" type="{http://data.lesuser.lesegais.ru/}DealDeclarationMarkings"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestUpdateDocument", namespace = "http://api.lesuser.lesegais.ru/", propOrder = {
    "dealDeclaration",
    "dealDeclarationReport",
    "dealDeclarationMarkings"
})
@XmlRootElement(name = "RequestUpdateDocument")
public class RequestUpdateDocument
    extends LesUserAbstractRequest 
{
	@XmlElement(name = "dealDeclaration")
    protected DealDeclaration dealDeclaration;
	@XmlElement(name = "dealDeclarationReport")
    protected DealDeclarationReport dealDeclarationReport;
	@XmlElement(name = "dealDeclarationMarkings")
    protected DealDeclarationMarkings dealDeclarationMarkings;
    
    public RequestUpdateDocument(){};
    
    public RequestUpdateDocument(Map map, String partyValue){
    	this.dealDeclaration = new DealDeclaration(map);
    	this.dealDeclaration.setSellerId(partyValue);
    }
    
    @Override
    public void setCurrentTime(String time)
    {    	
    	if (this.dealDeclaration != null)
    	{
    		if ((time == null || "".equals(time.trim())) && this.getDealDeclaration().getClientCreateTime() == null)
    			this.dealDeclaration.setClientCreateTime(Map.getDateInXMLGregorianCalendarFormat(Map.getNow()));
    	}
    	
    }

    /**
     * Gets the value of the dealDeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link DealDeclaration }
     *     
     */
    public DealDeclaration getDealDeclaration() {
        return dealDeclaration;
    }

    /**
     * Sets the value of the dealDeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealDeclaration }
     *     
     */
    public void setDealDeclaration(DealDeclaration value) {
        this.dealDeclaration = value;
    }

    /**
     * Gets the value of the dealDeclarationReport property.
     * 
     * @return
     *     possible object is
     *     {@link DealDeclarationReport }
     *     
     */
    public DealDeclarationReport getDealDeclarationReport() {
        return dealDeclarationReport;
    }

    /**
     * Sets the value of the dealDeclarationReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealDeclarationReport }
     *     
     */
    public void setDealDeclarationReport(DealDeclarationReport value) {
        this.dealDeclarationReport = value;
    }

    /**
     * Gets the value of the dealDeclarationMarkings property.
     * 
     * @return
     *     possible object is
     *     {@link DealDeclarationMarkings }
     *     
     */
    public DealDeclarationMarkings getDealDeclarationMarkings() {
        return dealDeclarationMarkings;
    }

    /**
     * Sets the value of the dealDeclarationMarkings property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealDeclarationMarkings }
     *     
     */
    public void setDealDeclarationMarkings(DealDeclarationMarkings value) {
        this.dealDeclarationMarkings = value;
    }

	@Override
	public XMLGregorianCalendar getCurrentTime() {
		// TODO Auto-generated method stub
		return null;
	}

}
