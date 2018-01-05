
package api.lesuser.lesegais.ru;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Список местоположений
 * 
 * <p>Java class for WoodlotElementList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WoodlotElementList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="woodlotElement" type="{http://data.lesuser.lesegais.ru/}WoodlotElement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WoodlotElementList", propOrder = {
    "woodlotElement"
})
public class WoodlotElementList {

    protected List<WoodlotElement> woodlotElement;

    /**
     * Gets the value of the woodlotElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the woodlotElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWoodlotElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WoodlotElement }
     * 
     * 
     */
    public List<WoodlotElement> getWoodlotElement() {
        if (woodlotElement == null) {
            woodlotElement = new ArrayList<WoodlotElement>();
        }
        return this.woodlotElement;
    }

}
