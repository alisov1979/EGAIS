
package api.lesuser.lesegais.ru;

import java.text.ParseException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import ptr.mule.exchange.Map;


/**
 * Декларации о сделке (без полей, заполняемых ЕГАИС)
 * 
 * <p>Java class for PartialDealDeclarationReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartialDealDeclarationReport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://data.lesuser.lesegais.ru/}DealDeclarationBase">
 *       &lt;sequence>
 *         &lt;element name="dealReportList" type="{http://data.lesuser.lesegais.ru/}DealReportList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dealId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartialDealDeclarationReport", propOrder = {
    "dealReportList"
}, namespace = "http://data.lesuser.lesegais.ru/")
@XmlSeeAlso({
    DealDeclarationReport.class
})
public class PartialDealDeclarationReport
    extends DealDeclarationBase
{
	@XmlElement(name = "dealReportList")
    protected DealReportList dealReportList;
    @XmlAttribute(name = "dealId", required = true)
    protected String dealId;
    
    
    public PartialDealDeclarationReport(){};
    
    public PartialDealDeclarationReport(Map map)
    { 	    	
    	super.buyerId 				= "P_153438";//СТД Петрович
    	super.declarationType 		=  DeclarationType.DEAL;
    	super.status				= ObjectStatus.SIGNED;
    	super.isBuyer				= true;	
    	this.dealId 				= map.getString("ИдентификаторСделки");
    	super.saleContractShortInfo = new SaleContractShortInfo(map);
    	
    	if(map.NextItem("Документ.ПТР_ОтчетыЕГАИСУчетДревесины") && map.NextRow(0))
    	{
    		String creationTime = map.getString("ДатаРегистрацииСделки");
        	if (creationTime != null && ! "".equals(creationTime.trim()))
        	{
        		ZonedDateTime zdt = ZonedDateTime.parse(creationTime);
        		GregorianCalendar gregory = GregorianCalendar.from(zdt);
        		try {
        			super.clientCreateTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory);
        		} catch (DatatypeConfigurationException e) {

        		} 
        	}	
    	}
    	this.dealReportList 		= new DealReportList(map);   	
    }
    

    /**
     * Gets the value of the dealReportList property.
     * 
     * @return
     *     possible object is
     *     {@link DealReportList }
     *     
     */
    public DealReportList getDealReportList() {
        return dealReportList;
    }

    /**
     * Sets the value of the dealReportList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealReportList }
     *     
     */
    public void setDealReportList(DealReportList value) {
        this.dealReportList = value;
    }

    /**
     * Gets the value of the dealId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealId() {
        return dealId;
    }

    /**
     * Sets the value of the dealId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealId(String value) {
        this.dealId = value;
    }

}
