package ptr.mule.egais;

import java.util.Set;

import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

/**
 *
 * @author www.javadb.com
 */
public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {

	public boolean handleMessage(SOAPMessageContext smc) {

		Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		if (outboundProperty.booleanValue()) {

			try {

				SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
				SOAPHeader header = envelope.getHeader();

				SOAPElement lesUserRequestHeader = header.addChildElement("LesUserRequestHeader", "api",
						"http://api.lesuser.lesegais.ru/");
				lesUserRequestHeader.setAttribute("apiVersion", "1.0-rc3");
				lesUserRequestHeader.setAttribute("operationId", "1");

				SOAPElement security = lesUserRequestHeader.addChildElement("security", "api");

				SOAPElement credentials = security.addChildElement("credentials", "api");
				credentials.setAttribute("userLogin", "u_7802348846_001");
				credentials.setAttribute("userPassword", "!Q@W#E$R5t");

				SOAPElement apiKey = security.addChildElement("apiKey", "api");
				apiKey.setValue("3db76ff1-edbc-47d6-9b18-bf1f975832cf");

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		return outboundProperty;

	}

	
	public Set getHeaders() {
		// throw new UnsupportedOperationException("Not supported yet.");
		return null;
	}

	public boolean handleFault(SOAPMessageContext context) {
		// throw new UnsupportedOperationException("Not supported yet.");
		return true;
	}

	public void close(MessageContext context) {
		// throw new UnsupportedOperationException("Not supported yet.");
	}
}