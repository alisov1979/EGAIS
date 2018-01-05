
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Константы.
 * 
 * <p>Java class for APIConstants complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APIConstants">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="soapApiVersion" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.0-rc2" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APIConstants", namespace = "http://api.lesuser.lesegais.ru/")
public class APIConstants {

    /**
     * 
     * 
     */
    @XmlAttribute(name = "soapApiVersion")
    public final static String SOAP_API_VERSION = "1.0-rc3";//1.0-rc2

}
