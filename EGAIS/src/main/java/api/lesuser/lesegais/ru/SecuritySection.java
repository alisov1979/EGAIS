
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Общая часть любого API запроса. Содержащий данные для аутентификации клиента.
 * 
 * <p>Java class for SecuritySection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecuritySection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="credentials" type="{http://api.lesuser.lesegais.ru/}Credentials" minOccurs="0"/>
 *         &lt;element name="apiKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritySection", namespace = "http://api.lesuser.lesegais.ru/", propOrder = {
    "credentials",
    "apiKey"
})
public class SecuritySection {

    protected Credentials credentials;
    @XmlElement(required = true)
    protected String apiKey;
    
    public SecuritySection()
    {
    	this.credentials = new Credentials();
    	this.apiKey = "3db76ff1-edbc-47d6-9b18-bf1f975832cf";
    }

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link Credentials }
     *     
     */
    public Credentials getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credentials }
     *     
     */
    public void setCredentials(Credentials value) {
        this.credentials = value;
    }

    /**
     * Gets the value of the apiKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Sets the value of the apiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiKey(String value) {
        this.apiKey = value;
    }

    
    public static String getCred()
    {
    	String cred =  "<api:LesUserRequestHeader apiVersion=\"1.0-rc2\" operationId=\"1\" xmlns:api=\"http://api.lesuser.lesegais.ru/\">" + 
		        "<api:security>" + 
		        "<!--Optional:-->" + 
		        "<api:credentials userLogin=\"u_7802348846_001\" userPassword=\"!Q@W#E$R5t\"/>" + 
		        "<api:apiKey>3db76ff1-edbc-47d6-9b18-bf1f975832cf</api:apiKey>" + 
		        "</api:security>" + 
		        "</api:LesUserRequestHeader>";
    	
    	return cred;
    }
    
}
