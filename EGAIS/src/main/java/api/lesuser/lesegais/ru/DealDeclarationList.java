
package api.lesuser.lesegais.ru;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Массив отчетов
 * 
 * <p>Java class for DealDeclarationList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealDeclarationList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dealElement" type="{http://data.lesuser.lesegais.ru/}DealDeclaration" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealDeclarationList", propOrder = {
    "dealElement"
})
public class DealDeclarationList {

    @XmlElement(required = true)
    protected List<DealDeclaration> dealElement;

    /**
     * Gets the value of the dealElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dealElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDealElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DealDeclaration }
     * 
     * 
     */
    public List<DealDeclaration> getDealElement() {
        if (dealElement == null) {
            dealElement = new ArrayList<DealDeclaration>();
        }
        return this.dealElement;
    }

}
