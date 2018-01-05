
package api.lesuser.lesegais.ru;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Список номеров участков
 * 
 * <p>Java class for WoodlotIdList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WoodlotIdList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="woodlotId" type="{http://data.lesuser.lesegais.ru/}WoodlotId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WoodlotIdList", propOrder = {
    "woodlotId"
})
public class WoodlotIdList {

    protected List<WoodlotId> woodlotId;

    /**
     * Gets the value of the woodlotId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the woodlotId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWoodlotId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WoodlotId }
     * 
     * 
     */
    public List<WoodlotId> getWoodlotId() {
        if (woodlotId == null) {
            woodlotId = new ArrayList<WoodlotId>();
        }
        return this.woodlotId;
    }

}
