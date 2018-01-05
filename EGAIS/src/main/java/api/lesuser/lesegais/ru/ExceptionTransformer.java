package api.lesuser.lesegais.ru;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.module.ws.consumer.SoapFaultException;
import org.mule.transformer.AbstractMessageTransformer;

import ptr.mule.egais.EGAISDeal;

public class ExceptionTransformer extends AbstractMessageTransformer {


	
	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
				
				
		String error = message.getExceptionPayload().getRootException().getMessage();
		
		ptr.mule.exchange.Object object  = (ptr.mule.exchange.Object) message.getInvocationProperty("InPayload");
				
		String operationType = "��������� �����������";
		
		if ("UpdateDocument".equals(message.getInvocationProperty("rout")))
		{
			operationType = "����������";
		}
		
		EGAISDeal egaisDeal = new EGAISDeal(object, (String) message.getInvocationProperty("request"), error, "������", operationType);
		
		message.setPayload(egaisDeal);
		
		return message;
	}

}
