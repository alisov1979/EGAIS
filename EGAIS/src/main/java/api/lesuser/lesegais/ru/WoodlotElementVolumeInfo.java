
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Местоположение + данные о кубатуре
 * 
 * <p>Java class for WoodlotElementVolumeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WoodlotElementVolumeInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://data.lesuser.lesegais.ru/}WoodlotElement">
 *       &lt;sequence>
 *         &lt;element name="elementVolumeInfo" type="{http://data.lesuser.lesegais.ru/}VolumeInfoList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WoodlotElementVolumeInfo", propOrder = {
    "elementVolumeInfo"
})
public class WoodlotElementVolumeInfo
    extends WoodlotElement
{

    @XmlElement(required = true)
    protected VolumeInfoList elementVolumeInfo;

    /**
     * Gets the value of the elementVolumeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeInfoList }
     *     
     */
    public VolumeInfoList getElementVolumeInfo() {
        return elementVolumeInfo;
    }

    /**
     * Sets the value of the elementVolumeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeInfoList }
     *     
     */
    public void setElementVolumeInfo(VolumeInfoList value) {
        this.elementVolumeInfo = value;
    }

}
