
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Составная часть любого API запроса. Позволяет задать пользователя и пароль ЕГАИС от имени которого происходит операция.
 *                 Рекомендуется синхронизацию справочников и данных проведить от имени системы, а создание и обновление конкретных документов от имено пользователя ЕГАИС если того требует рабочий процесс.
 * 
 * <p>Java class for Credentials complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Credentials">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="userLogin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userPassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Credentials", namespace = "http://api.lesuser.lesegais.ru/")
public class Credentials {

    @XmlAttribute(name = "userLogin")
    protected String userLogin;
    @XmlAttribute(name = "userPassword")
    protected String userPassword;
    
    public Credentials(){
    	
    	this.userLogin = "u_7802348846_001";
    	this.userPassword = "!Q@W#E$R5t";
    	
    };
    
    

    /**
     * Gets the value of the userLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLogin() {
        return userLogin;
    }

    /**
     * Sets the value of the userLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLogin(String value) {
        this.userLogin = value;
    }

    /**
     * Gets the value of the userPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * Sets the value of the userPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPassword(String value) {
        this.userPassword = value;
    }

}
