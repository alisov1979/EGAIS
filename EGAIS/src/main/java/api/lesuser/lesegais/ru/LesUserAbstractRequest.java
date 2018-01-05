
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * База любого API запроса.
 * 
 * <p>Java class for LesUserAbstractRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LesUserAbstractRequest">
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
@XmlType(name = "LesUserAbstractRequest", namespace = "http://api.lesuser.lesegais.ru/")
@XmlSeeAlso({
    RequestUpdateDocument.class,
    RequestDeleteDocument.class,
    RequestGetParty.class,
    RequestGetDocument.class,
    RequestGetContractUnderlyingDocuments.class,
    RequestGetPartyValues.class,
    RequestGetLookupValues.class,
    RequestInsertDocument.class,
    RequestGetModifiedDocuments.class,
    LesUserAbstractDocumentRefRequest.class
})
public abstract class LesUserAbstractRequest {

	 public abstract void setCurrentTime(String time);
	 
	 public abstract XMLGregorianCalendar getCurrentTime();
	

}
