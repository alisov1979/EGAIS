
package api.lesuser.lesegais.ru;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import ptr.mule.exchange.Map;


/**
 * Массив отчетов
 * 
 * <p>Java class for DealReportList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealReportList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reportElement" type="{http://data.lesuser.lesegais.ru/}DealReport" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealReportList", propOrder = {
    "reportElement"
}, namespace = "http://data.lesuser.lesegais.ru/")
@XmlRootElement(name = "DealReportList", namespace = "http://data.lesuser.lesegais.ru/")
public class DealReportList {

    @XmlElement(required = true)
    protected List<DealReport> reportElement;
    
    public DealReportList(){};
    
    public DealReportList(Map map)
    {
    	
    	this.reportElement = new ArrayList<>();   	   
    	this.reportElement.add(new DealReport(map));
 	
    }

    /**
     * Gets the value of the reportElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DealReport }
     * 
     * 
     */
    public List<DealReport> getReportElement() {
        if (reportElement == null) {
            reportElement = new ArrayList<DealReport>();
        }
        return this.reportElement;
    }

}
