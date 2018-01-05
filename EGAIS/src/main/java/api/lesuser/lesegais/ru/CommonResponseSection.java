
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Общая часть любого API ответа:
 *                 - Всегда содержит идентификатор логической операции, авто-сгенерированный платформой.
 *                 - Всегда содержит версию системы
 * 
 *                 При обращении в службу поддержки ОБЯЗАТЕЛЬНО указывать идентификатор логической операциии и версию системы
 * 
 * <p>Java class for CommonResponseSection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonResponseSection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
@XmlType(name = "CommonResponseSection", namespace = "http://api.lesuser.lesegais.ru/")
public class CommonResponseSection {

    @XmlAttribute(name = "operationId", required = true)
    protected String operationId;
    @XmlAttribute(name = "lesuserVersion", required = true)
    protected String lesuserVersion;

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
