
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Базовые поля сущности
 * 
 * <p>Java class for ObjectBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="sourceKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectBase", namespace = "http://common.lesuser.lesegais.ru/")
@XmlSeeAlso({
    ContractShortInfo.class,
    DealDeclarationFilterBase.class,
    UnderLyingDocumentShortInfo.class,
    DealDeclarationBase.class,
    DocumentBase.class,
    Tract.class,
    StateAuthority.class,
    ConstituentEntity.class,
    WoodSort.class,
    RightGrantingType.class,
    FederalDistrict.class,
    System.class,
    WoodlotIdType.class,
    LandType.class,
    Party.class,
    WoodBreed.class,
    WoodClass.class,
    Forestry.class,
    SubForestry.class,
    Country.class,
    UpdateReason.class,
    PersonDocumentType.class,
    PartyType.class
})
public class ObjectBase {

    @XmlAttribute(name = "sourceKey")
    protected String sourceKey;
    
    public ObjectBase()
    {
    	this.sourceKey = "37";
    }

    /**
     * Gets the value of the sourceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceKey() {
        return sourceKey;
    }

    /**
     * Sets the value of the sourceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceKey(String value) {
        this.sourceKey = value;
    }

}
