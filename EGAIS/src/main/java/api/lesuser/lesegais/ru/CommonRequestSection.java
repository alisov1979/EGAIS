
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Общая часть любого API запроса. Основная часть - параметры безопасности.
 *                 Также, есть возможность предоставить опциональный параметр - идентификатор логической операции. Если идентификатор не предоставлен,
 *                 то платформа автоматически сгенерирует новое уникальное значение. Идентификатор логических операций используется для аудита, а также для контроля композитных операций
 * 
 * <p>Java class for CommonRequestSection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonRequestSection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="security" type="{http://api.lesuser.lesegais.ru/}SecuritySection"/>
 *       &lt;/sequence>
 *       &lt;attribute name="apiVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="operationId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonRequestSection", namespace = "http://api.lesuser.lesegais.ru/", propOrder = {
    "security"
})
public class CommonRequestSection {

    @XmlElement(required = true)
    protected SecuritySection security;
    @XmlAttribute(name = "apiVersion", required = true)
    protected String apiVersion;
    @XmlAttribute(name = "operationId")
    protected String operationId;
    
    public CommonRequestSection()
    {
    	this.security 		= new SecuritySection();
    	this.apiVersion 	= "1.0-rc1";
    	this.operationId 	= "1";
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritySection }
     *     
     */
    public SecuritySection getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritySection }
     *     
     */
    public void setSecurity(SecuritySection value) {
        this.security = value;
    }

    /**
     * Gets the value of the apiVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * Sets the value of the apiVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiVersion(String value) {
        this.apiVersion = value;
    }

    /**
     * Gets the value of the operationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * Sets the value of the operationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationId(String value) {
        this.operationId = value;
    }

}
