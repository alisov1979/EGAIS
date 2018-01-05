
package api.lesuser.lesegais.ru;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Ответ на запрос удаления документа.
 * 
 * <p>Java class for ResponseDeleteDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseDeleteDocument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.lesuser.lesegais.ru/}LesUserAbstractResponse">
 *       &lt;choice>
 *         &lt;element name="dealDeclaration" type="{http://data.lesuser.lesegais.ru/}DealDeclaration"/>
 *         &lt;element name="dealDeclarationReport" type="{http://data.lesuser.lesegais.ru/}DealDeclarationReport"/>
 *         &lt;element name="dealDeclarationMarkings" type="{http://data.lesuser.lesegais.ru/}DealDeclarationMarkings"/>
 *         &lt;element name="duplicate" type="{http://data.lesuser.lesegais.ru/}DocumentRef" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseDeleteDocument", namespace = "http://api.lesuser.lesegais.ru/", propOrder = {
    "dealDeclaration",
    "dealDeclarationReport",
    "dealDeclarationMarkings",
    "duplicate"
})
public class ResponseDeleteDocument
    extends LesUserAbstractResponse
{

    protected DealDeclaration dealDeclaration;
    protected DealDeclarationReport dealDeclarationReport;
    protected DealDeclarationMarkings dealDeclarationMarkings;
    protected List<DocumentRef> duplicate;

    /**
     * Gets the value of the dealDeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link DealDeclaration }
     *     
     */
    public DealDeclaration getDealDeclaration() {
        return dealDeclaration;
    }

    /**
     * Sets the value of the dealDeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealDeclaration }
     *     
     */
    public void setDealDeclaration(DealDeclaration value) {
        this.dealDeclaration = value;
    }

    /**
     * Gets the value of the dealDeclarationReport property.
     * 
     * @return
     *     possible object is
     *     {@link DealDeclarationReport }
     *     
     */
    public DealDeclarationReport getDealDeclarationReport() {
        return dealDeclarationReport;
    }

    /**
     * Sets the value of the dealDeclarationReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealDeclarationReport }
     *     
     */
    public void setDealDeclarationReport(DealDeclarationReport value) {
        this.dealDeclarationReport = value;
    }

    /**
     * Gets the value of the dealDeclarationMarkings property.
     * 
     * @return
     *     possible object is
     *     {@link DealDeclarationMarkings }
     *     
     */
    public DealDeclarationMarkings getDealDeclarationMarkings() {
        return dealDeclarationMarkings;
    }

    /**
     * Sets the value of the dealDeclarationMarkings property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealDeclarationMarkings }
     *     
     */
    public void setDealDeclarationMarkings(DealDeclarationMarkings value) {
        this.dealDeclarationMarkings = value;
    }

    /**
     * Gets the value of the duplicate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the duplicate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDuplicate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentRef }
     * 
     * 
     */
    public List<DocumentRef> getDuplicate() {
        if (duplicate == null) {
            duplicate = new ArrayList<DocumentRef>();
        }
        return this.duplicate;
    }

}
