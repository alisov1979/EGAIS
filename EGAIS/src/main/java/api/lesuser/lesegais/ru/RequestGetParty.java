
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * «апрос на получение данных Ћесопользовател€.
 *                 ¬нимание: Ќе рекомендуетс€ слишком часто использовать этот запрос!
 *                 ѕравильный способ - это синхронизаци€ справочников и в дальнейшем работа с локальной репликой.
 *                 Ётот запрос можно использовать в том случае, если Ћесопользователь на которого ссылаетс€ документ отсутствует в локальной реплике.
 * 
 * <p>Java class for RequestGetParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestGetParty">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.lesuser.lesegais.ru/}LesUserAbstractRequest">
 *       &lt;sequence>
 *         &lt;element name="partyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestGetParty", namespace = "http://api.lesuser.lesegais.ru/", propOrder = {
    "partyId"
})
public class RequestGetParty
    extends LesUserAbstractRequest
{

    @XmlElement(required = true)
    protected String partyId;

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyId(String value) {
        this.partyId = value;
    }

	@Override
	public void setCurrentTime(String time) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public XMLGregorianCalendar getCurrentTime() {
		// TODO Auto-generated method stub
		return null;
	}

}
