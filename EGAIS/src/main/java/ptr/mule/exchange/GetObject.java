//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.07 at 04:22:02 PM MSK 
//

package ptr.mule.exchange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for GetProduct complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="GetProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listOfArticules" type="{product.specification.stdp.ru}listOfArticules"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetObject", propOrder = { "object" })
@XmlRootElement(name = "GetObject", namespace = "http://exchange.mule.ptr/")
public class GetObject implements iExchangable {

	@XmlElement(name = "object", required = true)
	protected Object object;

	/**
	 * Gets the value of the listOfArticules property.
	 * 
	 * @return possible object is {@link ListOfArticules }
	 * 
	 */
	public Object getObject() {

		return object;

	}

	/**
	 * Sets the value of the listOfArticules property.
	 * 
	 * @param value
	 *            allowed object is {@link ListOfArticules }
	 * 
	 */
	public void setObject(Object value) {

		this.object = value;

	}

	public GetObject() {

		this.object = new Object();

	};

	public GetObject(Object object) {
		
		if(object != null && object.getReply() == null){
			object.setReply("");
		}

		this.object = object;

	};

	public static GetObject newRequest(String method, HashMap<String, HashMap<String, String>> request,
			String recipient, String sender) {

		List<Property> properties = new ArrayList<>();

		for (Entry<String, HashMap<String, String>> e : request.entrySet()) {

			for (Entry<String, String> s : e.getValue().entrySet()) {
				properties.add(new Property(s.getKey(), e.getKey(), s.getValue(), null, null));
			}

		}

		return new GetObject(properties, recipient, method, sender);

	}

	public GetObject(List<Property> value, String recipient, String method, String sender) {

		this.object = new Object(new Item(new Row(value)), sender, method, recipient);

	}

	public GetObject(Property property, String recipient, String method, String sender) {

		List<Property> properties = new ArrayList<>();
		properties.add(property);

		this.object = new Object(new Item(new Row(properties)), sender, method, recipient);

	}

	public static HashMap<String, HashMap<String, String>> getMutualSettlements(String ContractorID,
			String beginningDate, String endDate) {

		HashMap<String, HashMap<String, String>> request = new HashMap<>();
		request.put("ContractorID", new HashMap<String, String>());
		request.get("ContractorID").put("����������.�����������", ContractorID);
		request.put("beginningDate", new HashMap<String, String>());
		request.get("beginningDate").put("����", beginningDate);
		request.put("endDate", new HashMap<String, String>());
		request.get("endDate").put("����", endDate);

		return request;
	}

	public static HashMap<String, HashMap<String, String>> getBalance(String ContractorID) {

		HashMap<String, HashMap<String, String>> request = new HashMap<>();
		request.put("ContractorID", new HashMap<String, String>());
		request.get("ContractorID").put("����������.�����������", ContractorID);

		return request;
	}

	public String getRecipient() {

		String recipient = "";

		if (this.object != null) {
			recipient = this.object.getRecipient();
		}

		return recipient;
	}

	public static HashMap<String, HashMap<String, String>> createDataRequest(String ContractorID, String beginningDate,
			String endDate) {

		HashMap<String, HashMap<String, String>> request = new HashMap<>();
		request.put("������", new HashMap<String, String>());
		request.get("������").put("����������.�����������", ContractorID);
		request.put("beginningDate", new HashMap<String, String>());
		request.get("beginningDate").put("����", beginningDate);
		request.put("endDate", new HashMap<String, String>());
		request.get("endDate").put("����", endDate);

		return request;
	}

	public static HashMap<String, HashMap<String, String>> createGoodsRequest(String goodsID) {

		HashMap<String, HashMap<String, String>> request = new HashMap<>();
		request.put("������", new HashMap<String, String>());
		request.get("������").put("����������.������������", goodsID);

		return request;
	}

	public static HashMap<String, HashMap<String, String>> createOrderRequest(String siteId) {

		HashMap<String, HashMap<String, String>> request = new HashMap<>();

		request.put("orderId", new HashMap<String, String>());
		request.get("orderId").put("������", siteId);

		return request;

	}

	@Override
	public String getType() {
		if (this.getObject() != null) {
			return this.object.getType();
		} else
			return "";
	}

	@Override
	public List<String> getRecipients() {
		if(this.getObject() != null){
		return this.object.getRecipients();
		}
		else
			return new ArrayList<String>();
	}

	@Override
	public Boolean canBePassed(String baseName) {
		List<String> recipients = this.getRecipients();
		if (recipients == null) {
			return false;
		} else
			return recipients.contains(baseName);
	}

	@Override
	public String getSender() {
		if (this.object != null) {
			return this.object.getSender();
		} else
			return "";
	}

}
