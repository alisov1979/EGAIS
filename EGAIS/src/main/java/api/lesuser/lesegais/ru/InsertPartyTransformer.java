package api.lesuser.lesegais.ru;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

import ptr.mule.exchange.Map;

public class InsertPartyTransformer extends AbstractMessageTransformer {

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {

		RequestInsertParty rip = null;
		
		ResponseGetPartyValues payload  = (ResponseGetPartyValues) message.getPayload();
		
		if (payload.getParty() == null || payload.getParty().isEmpty())
		{
			ptr.mule.exchange.Object object = (ptr.mule.exchange.Object) message.getInvocationProperty("InPayload");
			
			Map map = new Map(object);
			
			if (map != null && map.NextItem("ƒокумент.ѕ“–_—делки≈√ј»—”четƒревесины") && map.NextRow(0))
			{			
				rip = new RequestInsertParty(map);
			}			
		}
		
		message.setPayload(rip);
		
		message.setInvocationProperty("m", "InsertParty");
		
		return message;
	}

}
