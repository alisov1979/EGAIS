
package api.lesuser.lesegais.ru;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Список элементов субаренды
 * 
 * <p>Java class for SubLeaseList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubLeaseList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subLease" type="{http://data.lesuser.lesegais.ru/}SubLease" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubLeaseList", propOrder = {
    "subLease"
})
public class SubLeaseList {

    protected List<SubLease> subLease;

    /**
     * Gets the value of the subLease property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subLease property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubLease().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubLease }
     * 
     * 
     */
    public List<SubLease> getSubLease() {
        if (subLease == null) {
            subLease = new ArrayList<SubLease>();
        }
        return this.subLease;
    }

}
