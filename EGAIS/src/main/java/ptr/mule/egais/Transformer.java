package ptr.mule.egais;

import javax.inject.Inject;
import javax.xml.bind.JAXBContext;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

import ptr.mule.exchange.Map;
import ptr.mule.exchange.Object;
import ptr.mule.exchange.iExchangable;

public class Transformer extends AbstractMessageTransformer {
	
	@Inject
	CallWSLesUserService ws;
	@Inject
	JAXBContext jxbContext;
	public SendMessageToEGAIS sMessage;
	@Inject
	TimeFilter timeFilter;
	@Inject
	SendMessageToJMS sendMessageToJMS;
	private Map map;

	@Override
	public java.lang.Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		
		this.sMessage = new SendMessageToEGAIS(message, ws, timeFilter, jxbContext);
		
		iExchangable payload = (iExchangable) message.getPayload();
		Object object 		 = payload.getObject();	
		
		this.map = new Map(object);
		
		if (object != null && ! messageWasProcessed(object) && ! isDelteted())
		{
			String partyValue = sMessage.getPartyValue(object);				
			
			sMessage.InsertUpdateDocument(object, partyValue);		
			
			sendMessageToJMS.send(sMessage.log(object), jxbContext);
			
			if (isIndividaul()) 
			{
				sendEmail(object);
			}			
		}
		
		return true;		
	}
	
	private boolean messageWasProcessed(Object object)
	{
		
		if (map != null && (map.NextItem("��������.���_������������������������")
				|| map.NextItem("��������.���_������������������������"))&& map.NextRow(0))
		{
			return "���������".equals(map.getString("������"));
		}
				
		return true;
	}
	
	private boolean isDelteted()
	{
		if (map != null && (map.NextItem("��������.���_������������������������")
				|| map.NextItem("��������.���_������������������������"))&& map.NextRow(0))
		{
			return map.getBoolean("���������������");
		}
				
		return false;
	}
	
	private String getMsgId()
	{
		
		if (map != null && (map.NextItem("��������.���_������������������������")
				|| map.NextItem("��������.���_������������������������"))&& map.NextRow(0))
		{
			return map.getString("������");
		}
				
		return null; 
	}
	
	private boolean isIndividaul() 
	{

		if (map != null && (map.NextItem("��������.���_������������������������")
				|| map.NextItem("��������.���_������������������������")) && map.NextRow(0)) {
			
			Boolean ind = map.getBoolean("�������");
			
			return ind == null ? false : ind;
		}

		return false;
	}
	
	private void sendEmail(Object object)
	{		
		String message = null;
		
		if("��������.���_������������������������".equals(object.getType()))
		{
			message = "� ��� ���������� ������������� ������ � ����� ���� ���������. ��������� ���������� � ������� ����� ���� ���������, ��������� ����������� �������.";
		}		
		else if ("��������.���_������������������������".equals(object.getType()))
		{
			message = "� ��� ���������� ������������� ������ � ����� ���� ���������. ��������� ���������� � ������� ����� ���� ���������, ��������� ����������� �������.";
		}
	
		String cMsg = getMsgId();
		
		if (message != null && ! timeFilter.messageWasSend(cMsg))
		{
			sendMessageToJMS.send(message,"egais.email", jxbContext);
			timeFilter.addToCash(cMsg);			
		}
		
	}
	
	

}
