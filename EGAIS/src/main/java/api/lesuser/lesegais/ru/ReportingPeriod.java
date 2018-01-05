
package api.lesuser.lesegais.ru;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Период отчетных данных
 * 
 * <p>Java class for ReportingPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportingPeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reportingMonth" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="reportingYear" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingPeriod", propOrder = {
    "reportingMonth",
    "reportingYear"
})
public class ReportingPeriod {

    @XmlElement(required = true)
    protected BigInteger reportingMonth;
    @XmlElement(required = true)
    protected BigInteger reportingYear;

    /**
     * Gets the value of the reportingMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReportingMonth() {
        return reportingMonth;
    }

    /**
     * Sets the value of the reportingMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReportingMonth(BigInteger value) {
        this.reportingMonth = value;
    }

    /**
     * Gets the value of the reportingYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReportingYear() {
        return reportingYear;
    }

    /**
     * Sets the value of the reportingYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReportingYear(BigInteger value) {
        this.reportingYear = value;
    }

}
