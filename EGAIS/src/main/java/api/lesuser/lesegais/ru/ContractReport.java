
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Отчет об использовании лесов
 * 
 * <p>Java class for ContractReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractReport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://data.lesuser.lesegais.ru/}ContractForestDeclarationReportBase">
 *       &lt;sequence>
 *         &lt;element name="reportingPeriod" type="{http://data.lesuser.lesegais.ru/}ReportingPeriod"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractReport", propOrder = {
    "reportingPeriod"
})
public class ContractReport
    extends ContractForestDeclarationReportBase
{

    @XmlElement(required = true)
    protected ReportingPeriod reportingPeriod;

    /**
     * Gets the value of the reportingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingPeriod }
     *     
     */
    public ReportingPeriod getReportingPeriod() {
        return reportingPeriod;
    }

    /**
     * Sets the value of the reportingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingPeriod }
     *     
     */
    public void setReportingPeriod(ReportingPeriod value) {
        this.reportingPeriod = value;
    }

}
