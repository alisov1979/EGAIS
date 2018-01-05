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
		
		if (map != null && (map.NextItem("Документ.ПТР_СделкиЕГАИСУчетДревесины")
				|| map.NextItem("Документ.ПТР_ОтчетыЕГАИСУчетДревесины"))&& map.NextRow(0))
		{
			return "Обработан".equals(map.getString("Статус"));
		}
				
		return true;
	}
	
	private boolean isDelteted()
	{
		if (map != null && (map.NextItem("Документ.ПТР_СделкиЕГАИСУчетДревесины")
				|| map.NextItem("Документ.ПТР_ОтчетыЕГАИСУчетДревесины"))&& map.NextRow(0))
		{
			return map.getBoolean("ПометкаУдаления");
		}
				
		return false;
	}
	
	private String getMsgId()
	{
		
		if (map != null && (map.NextItem("Документ.ПТР_СделкиЕГАИСУчетДревесины")
				|| map.NextItem("Документ.ПТР_ОтчетыЕГАИСУчетДревесины"))&& map.NextRow(0))
		{
			return map.getString("Ссылка");
		}
				
		return null; 
	}
	
	private boolean isIndividaul() 
	{

		if (map != null && (map.NextItem("Документ.ПТР_СделкиЕГАИСУчетДревесины")
				|| map.NextItem("Документ.ПТР_ОтчетыЕГАИСУчетДревесины")) && map.NextRow(0)) {
			
			Boolean ind = map.getBoolean("ФизЛицо");
			
			return ind == null ? false : ind;
		}

		return false;
	}
	
	private void sendEmail(Object object)
	{		
		String message = null;
		
		if("Документ.ПТР_СделкиЕГАИСУчетДревесины".equals(object.getType()))
		{
			message = "У вас существуют неподписанные сделки в ЕГАИС учет древесины. Требуется подписание в системе ЕГАИС учет древесины, используя электронную подпись.";
		}		
		else if ("Документ.ПТР_ОтчетыЕГАИСУчетДревесины".equals(object.getType()))
		{
			message = "У вас существуют неподписанные отчеты в ЕГАИС учет древесины. Требуется подписание в системе ЕГАИС учет древесины, используя электронную подпись.";
		}
	
		String cMsg = getMsgId();
		
		if (message != null && ! timeFilter.messageWasSend(cMsg))
		{
			sendMessageToJMS.send(message,"egais.email", jxbContext);
			timeFilter.addToCash(cMsg);			
		}
		
	}
	
	

}
