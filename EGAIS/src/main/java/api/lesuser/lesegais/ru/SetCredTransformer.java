package api.lesuser.lesegais.ru;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class SetCredTransformer extends AbstractMessageTransformer {

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		
		//+++++++++++++++++++++++
		message.setInvocationProperty("header", SecuritySection.getCred());
		//+++++++++++++++++++++++
		return message;
	}

}
