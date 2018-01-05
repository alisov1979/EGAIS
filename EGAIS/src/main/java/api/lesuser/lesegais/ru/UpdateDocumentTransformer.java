package api.lesuser.lesegais.ru;

import java.util.List;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

import ptr.mule.exchange.Map;

public class UpdateDocumentTransformer extends AbstractMessageTransformer {

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {

		RequestUpdateDocument rid = null;
		
		if (message.getPayload() instanceof ResponseGetPartyValues)
		{			
			ResponseGetPartyValues payload  = (ResponseGetPartyValues) message.getPayload();
			
			ptr.mule.exchange.Object object = (ptr.mule.exchange.Object) message.getInvocationProperty("InPayload");
						
			Map map = new Map(object);
			
			if (map != null && map.NextItem("ƒокумент.ѕ“–_—делки≈√ј»—”четƒревесины"))
			{			
					rid = new RequestUpdateDocument(map,"");
			}
			
			List<Party> paties = payload.getParty();
			
			if (paties != null)
			{
				for (Party party : paties)
				{
					if (rid != null && rid.dealDeclaration != null)
					{
						rid.dealDeclaration.setSellerId(party.getId());
						break;
					}					
				}
			}									
		}
		
		message.setInvocationProperty("m", "UpdateDocument");
		
		return rid;
		
		
	}

}
