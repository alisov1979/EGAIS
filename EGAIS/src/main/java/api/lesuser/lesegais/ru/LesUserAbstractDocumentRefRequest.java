
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Ѕазовый запрос API, использующий ссылку на документ DocumentRef.
 * 
 * <p>Java class for LesUserAbstractDocumentRefRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LesUserAbstractDocumentRefRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.lesuser.lesegais.ru/}LesUserAbstractRequest">
 *       &lt;sequence>
 *         &lt;element name="documentRef" type="{http://data.lesuser.lesegais.ru/}DocumentRef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LesUserAbstractDocumentRefRequest", namespace = "http://api.lesuser.lesegais.ru/", propOrder = {
    "documentRef"
})
@XmlSeeAlso({
    LesUserStateChangeRequest.class
})
public class LesUserAbstractDocumentRefRequest
    extends LesUserAbstractRequest
{

    @XmlElement(required = true)
    protected DocumentRef documentRef;

    /**
     * Gets the value of the documentRef property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentRef }
     *     
     */
    public DocumentRef getDocumentRef() {
        return documentRef;
    }

    /**
     * Sets the value of the documentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentRef }
     *     
     */
    public void setDocumentRef(DocumentRef value) {
        this.documentRef = value;
    }

	@Override
	public void setCurrentTime(String time) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public XMLGregorianCalendar getCurrentTime() {
		// TODO Auto-generated method stub
		return null;
	}

}
