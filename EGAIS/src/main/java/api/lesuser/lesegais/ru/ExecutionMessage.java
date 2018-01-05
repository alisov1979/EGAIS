
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Структура любого сообщение возвращаемого вместе с ответом на запрос. Всегда содержит текст сообщения в поле 'messageText'. Также может содержать структуры,
 *                 описывающие ошибку, включая детальные сообщения от сервера
 * 
 * <p>Java class for ExecutionMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecutionMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stackTrace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="error" type="{http://api.lesuser.lesegais.ru/}ExecutionError" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operationId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lesuserVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutionMessage", namespace = "http://api.lesuser.lesegais.ru/", propOrder = {
    "stackTrace",
    "error"
})
public class ExecutionMessage {

    protected String stackTrace;
    protected ExecutionError error;
    @XmlAttribute(name = "operationId", required = true)
    protected String operationId;
    @XmlAttribute(name = "lesuserVersion", required = true)
    protected String lesuserVersion;

    /**
     * Gets the value of the stackTrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStackTrace() {
        return stackTrace;
    }

    /**
     * Sets the value of the stackTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackTrace(String value) {
        this.stackTrace = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionError }
     *     
     */
    public ExecutionError getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionError }
     *     
     */
    public void setError(ExecutionError value) {
        this.error = value;
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

    /**
     * Gets the value of the lesuserVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLesuserVersion() {
        return lesuserVersion;
    }

    /**
     * Sets the value of the lesuserVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLesuserVersion(String value) {
        this.lesuserVersion = value;
    }

}
