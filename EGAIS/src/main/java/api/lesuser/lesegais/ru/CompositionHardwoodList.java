
package api.lesuser.lesegais.ru;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ptr.mule.exchange.Map;


/**
 * Массив отчетов
 * 
 * <p>Java class for CompositionHardwoodList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompositionHardwoodList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compositionElement" type="{http://data.lesuser.lesegais.ru/}CompositionHardwood" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositionHardwoodList", namespace = "http://data.lesuser.lesegais.ru/", propOrder = {
    "compositionElement"
})
public class CompositionHardwoodList {

    @XmlElement(required = true)
    protected List<CompositionHardwood> compositionElement;
    
    public CompositionHardwoodList(){}
    
    public CompositionHardwoodList(Map map)
    {    	
    	this.compositionElement = new ArrayList<>();    	
    	int i = 0;
    	if (map != null && map.NextItem("Документ.ПТР_СделкиЕГАИСУчетДревесины.План") )
    	{
    		while(map.NextRow(i))
    		{
    			this.compositionElement.add(new CompositionHardwood(i + 1, map));
        		i ++;	
    		}   		
    	}   	
    }

    /**
     * Gets the value of the compositionElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositionElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositionElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositionHardwood }
     * 
     * 
     */
    public List<CompositionHardwood> getCompositionElement() {
        if (compositionElement == null) {
            compositionElement = new ArrayList<CompositionHardwood>();
        }
        return this.compositionElement;
    }

}
