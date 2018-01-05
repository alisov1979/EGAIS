
package api.lesuser.lesegais.ru;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Массив маркировок
 * 
 * <p>Java class for DealMarkingsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealMarkingsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dealMarkingsElement" type="{http://data.lesuser.lesegais.ru/}DealMarkingsElement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealMarkingsList", propOrder = {
    "dealMarkingsElement"
})
public class DealMarkingsList {

    protected List<DealMarkingsElement> dealMarkingsElement;

    /**
     * Gets the value of the dealMarkingsElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dealMarkingsElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDealMarkingsElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DealMarkingsElement }
     * 
     * 
     */
    public List<DealMarkingsElement> getDealMarkingsElement() {
        if (dealMarkingsElement == null) {
            dealMarkingsElement = new ArrayList<DealMarkingsElement>();
        }
        return this.dealMarkingsElement;
    }

}
