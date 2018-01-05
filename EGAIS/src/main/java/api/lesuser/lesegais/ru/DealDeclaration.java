
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import ptr.mule.exchange.Map;


/**
 * Декларации о сделке
 * 
 * <p>Java class for DealDeclaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealDeclaration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://data.lesuser.lesegais.ru/}PartialDealDeclaration">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://common.lesuser.lesegais.ru/}EgaisManagedCommonAttributes"/>
 *       &lt;attGroup ref="{http://data.lesuser.lesegais.ru/}EgaisManagedDocumentBaseAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealDeclaration", namespace = "http://data.lesuser.lesegais.ru/")
public class DealDeclaration
    extends PartialDealDeclaration
{

   @XmlAttribute(name = "createDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;	
    @XmlAttribute(name = "updateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
    @XmlAttribute(name = "sourceSystem")
    protected String sourceSystem;
    @XmlAttribute(name = "createdBy")
    protected String createdBy;
    @XmlAttribute(name = "updatedBy")
    protected String updatedBy;
    @XmlAttribute(name = "updatedBySystem")
    protected String updatedBySystem;
    @XmlAttribute(name = "id")
    protected String id;

    public DealDeclaration(){};
    
    public DealDeclaration(Map map)
    {
    	super(map);
    	if (map != null && map.NextItem("Документ.ПТР_СделкиЕГАИСУчетДревесины") && map.NextRow(0))
    	{   		
    		//this.createDate = Map.getXMLGregorianCalendar(map.getString("ДатаСоздания"));
    		//this.updateDate = Map.getXMLGregorianCalendar(map.getString("ДатаОбновления"));
    		this.id 		= map.getString("Идентификатор");
    		//this.id			= map.getString("НомерДекларации");
    		this.sourceKey	= null;
    	}
    }

	public XMLGregorianCalendar getCreateDate() {
		return createDate;
	}

	public void setCreateDate(XMLGregorianCalendar createDate) {
		this.createDate = createDate;
	}

	public XMLGregorianCalendar getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(XMLGregorianCalendar updateDate) {
		this.updateDate = updateDate;
	}

	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUpdatedBySystem() {
		return updatedBySystem;
	}

	public void setUpdatedBySystem(String updatedBySystem) {
		this.updatedBySystem = updatedBySystem;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


    
}
