
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * База любого API ответа.
 * 
 * <p>Java class for LesUserAbstractResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LesUserAbstractResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LesUserAbstractResponse", namespace = "http://api.lesuser.lesegais.ru/")
@XmlSeeAlso({
    ResponseUpdateDocument.class,
    ResponseGetModifiedDocuments.class,
    ResponseGetParty.class,
    ResponseDeleteDocument.class,
    ResponseGetDocument.class,
    ResponseInsertDocument.class,
    ResponseGetValuesPaged.class
})
public  class LesUserAbstractResponse {
	
	

}
