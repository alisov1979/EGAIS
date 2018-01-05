
package api.lesuser.lesegais.ru;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Ответ на запрос добавление записи в справочник.
 *                 Содержит полную запись (поля переданные клиентом + данные заполненные ЕГАИС).
 *                 Для дальнейшей работы с записью клиенту нужно сохранить (и передавать в последующих запросах):
 *                 - id
 *                 - updateDate
 * 
 * <p>Java class for ResponseInsertParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseInsertParty">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.lesuser.lesegais.ru/}LesUserAbstractResponse">
 *       &lt;choice>
 *         &lt;element name="party" type="{http://lookup.lesuser.lesegais.ru/}Party"/>
 *         &lt;element name="duplicatePartyId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseInsertParty", namespace = "http://api.lesuser.lesegais.ru/", propOrder = {
    "party",
    "duplicatePartyId"
})
public class ResponseInsertParty
    extends LesUserAbstractResponse
{

    protected Party party;
    protected List<String> duplicatePartyId;

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setParty(Party value) {
        this.party = value;
    }

    /**
     * Gets the value of the duplicatePartyId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the duplicatePartyId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDuplicatePartyId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDuplicatePartyId() {
        if (duplicatePartyId == null) {
            duplicatePartyId = new ArrayList<String>();
        }
        return this.duplicatePartyId;
    }

}
