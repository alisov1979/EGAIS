
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Лесная декларация
 * 
 * <p>Java class for ContractForestDeclaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractForestDeclaration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://data.lesuser.lesegais.ru/}ContractForestDeclarationReportBase">
 *       &lt;sequence>
 *         &lt;element name="declarationPeriod" type="{http://data.lesuser.lesegais.ru/}DeclarationPeriod"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractForestDeclaration", propOrder = {
    "declarationPeriod"
})
public class ContractForestDeclaration
    extends ContractForestDeclarationReportBase
{

    @XmlElement(required = true)
    protected DeclarationPeriod declarationPeriod;

    /**
     * Gets the value of the declarationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationPeriod }
     *     
     */
    public DeclarationPeriod getDeclarationPeriod() {
        return declarationPeriod;
    }

    /**
     * Sets the value of the declarationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationPeriod }
     *     
     */
    public void setDeclarationPeriod(DeclarationPeriod value) {
        this.declarationPeriod = value;
    }

}
