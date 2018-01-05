
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Детальное описание ошибки исполнения запроса - включает код ошибки, сообщение для пользователя, а также техническое сообщение для службы поддержки
 * 
 * <p>Java class for ExecutionError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecutionError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="errorCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userMessage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="internalMessage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutionError", namespace = "http://api.lesuser.lesegais.ru/")
public class ExecutionError {

    @XmlAttribute(name = "errorCode", required = true)
    protected String errorCode;
    @XmlAttribute(name = "userMessage")
    protected String userMessage;
    @XmlAttribute(name = "internalMessage")
    protected String internalMessage;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the userMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserMessage() {
        return userMessage;
    }

    /**
     * Sets the value of the userMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserMessage(String value) {
        this.userMessage = value;
    }

    /**
     * Gets the value of the internalMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalMessage() {
        return internalMessage;
    }

    /**
     * Sets the value of the internalMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalMessage(String value) {
        this.internalMessage = value;
    }

}
