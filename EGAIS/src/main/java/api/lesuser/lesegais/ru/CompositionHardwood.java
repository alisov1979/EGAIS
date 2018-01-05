
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ptr.mule.exchange.Map;


/**
 * Состав отчуждаемой древесины
 * 
 * <p>Java class for CompositionHardwood complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompositionHardwood">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tnvedClassId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="woodBreedId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="woodClassId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="number" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="hardwoodVolume" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositionHardwood", namespace = "http://data.lesuser.lesegais.ru/", propOrder = {
    "tnvedClassId",
    "woodBreedId",
    "woodClassId"
})
public class CompositionHardwood {

	@XmlElement(name = "tnvedClassId")
    protected Integer tnvedClassId;
	@XmlElement(name = "woodBreedId")
    protected Integer woodBreedId;
	@XmlElement(name = "woodClassId")
    protected Integer woodClassId;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "number", required = true)
    protected Integer number;
    @XmlAttribute(name = "hardwoodVolume", required = true)
    protected Double hardwoodVolume;
    
    public CompositionHardwood(){};
    
    public CompositionHardwood(Integer i, Map map)
    {
    	this.number 		= i;
    	this.woodBreedId 	= map.getInteger("КодОКПД2РодительКодСинхронизацииЕГАИС");
    	this.woodClassId 	= map.getInteger("КодОКПД2КодСинхронизацииЕГАИС");
    	this.hardwoodVolume = map.getDouble("Количество");
    }

	public Integer getTnvedClassId() {
		return tnvedClassId;
	}

	public void setTnvedClassId(Integer tnvedClassId) {
		this.tnvedClassId = tnvedClassId;
	}

	public Integer getWoodBreedId() {
		return woodBreedId;
	}

	public void setWoodBreedId(Integer woodBreedId) {
		this.woodBreedId = woodBreedId;
	}

	public Integer getWoodClassId() {
		return woodClassId;
	}

	public void setWoodClassId(Integer woodClassId) {
		this.woodClassId = woodClassId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getHardwoodVolume() {
		return hardwoodVolume;
	}

	public void setHardwoodVolume(Double hardwoodVolume) {
		this.hardwoodVolume = hardwoodVolume;
	}

  

}
