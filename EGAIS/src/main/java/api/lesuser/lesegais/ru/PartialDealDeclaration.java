
package api.lesuser.lesegais.ru;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import ptr.mule.exchange.Map;


/**
 * Декларации о сделке (без полей, заполняемых ЕГАИС)
 * 
 * <p>Java class for PartialDealDeclaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartialDealDeclaration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://data.lesuser.lesegais.ru/}DealDeclarationBase">
 *       &lt;sequence>
 *         &lt;element name="underLyingDocumentShortInfo" type="{http://data.lesuser.lesegais.ru/}UnderLyingDocumentShortInfo" minOccurs="0"/>
 *         &lt;element name="woodPlaceInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hardWoodInfo" type="{http://data.lesuser.lesegais.ru/}CompositionHardwoodList"/>
 *         &lt;element name="reasonTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="reasonText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartialDealDeclaration", namespace = "http://data.lesuser.lesegais.ru/", propOrder = {
    "underLyingDocumentShortInfo",
    "woodPlaceInfo",
    "hardWoodInfo",
    "reasonTypeId",
    "reasonText"
})
@XmlSeeAlso({
    DealDeclaration.class
})
@XmlRootElement(name = "PartialDealDeclaration", namespace = "http://data.lesuser.lesegais.ru/")
public class PartialDealDeclaration
    extends DealDeclarationBase
{
	@XmlElement(name = "underLyingDocumentShortInfo")
    protected UnderLyingDocumentShortInfo underLyingDocumentShortInfo;
	@XmlElement(name = "woodPlaceInfo")
	protected String woodPlaceInfo;
    @XmlElement(name = "hardWoodInfo",required = true)
    protected CompositionHardwoodList hardWoodInfo;
    @XmlElement(name = "reasonTypeId")
    protected BigInteger reasonTypeId;
    @XmlElement(name = "reasonText")
    protected String reasonText;
    
    public PartialDealDeclaration(){};
    
    public PartialDealDeclaration(Map map)
    {
    	super.buyerId 				= "P_153438";//СТД Петрович
    	super.declarationType 		=  DeclarationType.DEAL;
    	super.saleContractShortInfo = new SaleContractShortInfo(map);
    	super.isBuyer				= true;
    	this.hardWoodInfo			= new CompositionHardwoodList(map);
    
    }

    /**
     * Gets the value of the underLyingDocumentShortInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UnderLyingDocumentShortInfo }
     *     
     */
    public UnderLyingDocumentShortInfo getUnderLyingDocumentShortInfo() {
        return underLyingDocumentShortInfo;
    }

    /**
     * Sets the value of the underLyingDocumentShortInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderLyingDocumentShortInfo }
     *     
     */
    public void setUnderLyingDocumentShortInfo(UnderLyingDocumentShortInfo value) {
        this.underLyingDocumentShortInfo = value;
    }

    /**
     * Gets the value of the woodPlaceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWoodPlaceInfo() {
        return woodPlaceInfo;
    }

    /**
     * Sets the value of the woodPlaceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWoodPlaceInfo(String value) {
        this.woodPlaceInfo = value;
    }

    /**
     * Gets the value of the hardWoodInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CompositionHardwoodList }
     *     
     */
    public CompositionHardwoodList getHardWoodInfo() {
        return hardWoodInfo;
    }

    /**
     * Sets the value of the hardWoodInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositionHardwoodList }
     *     
     */
    public void setHardWoodInfo(CompositionHardwoodList value) {
        this.hardWoodInfo = value;
    }

    /**
     * Gets the value of the reasonTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReasonTypeId() {
        return reasonTypeId;
    }

    /**
     * Sets the value of the reasonTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReasonTypeId(BigInteger value) {
        this.reasonTypeId = value;
    }

    /**
     * Gets the value of the reasonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonText() {
        return reasonText;
    }

    /**
     * Sets the value of the reasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonText(String value) {
        this.reasonText = value;
    }

}
