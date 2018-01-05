package ptr.mule.egais;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;

import ptr.mule.exchange.iExchangable;

public class SendMessageToJMS {
	
	private List<String> queues;
	private ActiveMQConnectionFactory factory = null;
	private Connection connection = null;
	private Session session = null;
	public static Boolean TRANSACTIONAL = false;
	
	
	public void init() throws JMSException
	{								
		factory 	= new ActiveMQConnectionFactory("tcp://10.13.252.97:61616");
		connection 	= factory.createConnection();
		session 	= connection.createSession(TRANSACTIONAL, Session.AUTO_ACKNOWLEDGE);
	}
	
	public void closeConnection()
	{
		if (this.connection != null){
			try {
				this.connection.close();
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void send(iExchangable message, JAXBContext jxbContext)
	{		
		setMessageQueues(message);
		String textMessage = getXMLString(message, jxbContext);
		
		try 
		{			
			for (String qName : queues) 
			{
				sendMessage(qName, textMessage);
			}								
		} 
		catch (JMSException e) 
		{
			throw new NullPointerException(e.toString());
		} 

	}
	
	public void send(String message, String queue, JAXBContext jxbContext)
	{		

		this.queues = new ArrayList<>();
		this.queues.add(queue);
		
		try 
		{			
			for (String qName : queues) 
			{
				sendMessage(qName, message);
			}								
		} 
		catch (JMSException e) 
		{
			throw new NullPointerException(e.toString());
		} 

	}
	
	private void add(String value){
		
		if (this.queues == null){
			this.queues = new ArrayList<>();
		}
		
		if (! this.queues.contains(value)){
			this.queues.add(value);
		}
		
	}
	
	private String getXMLString(iExchangable message, JAXBContext jxbContext) 
	{
		StringWriter sw = new StringWriter();
		try {
			jxbContext.createMarshaller().marshal(message, sw);
			return sw.toString();

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	private void setMessageQueues(iExchangable message)
	{
		List<String> recipients = message.getRecipients();
		this.queues = new ArrayList<>();
		for (String tmp : recipients){
			
			switch (tmp) {
			case "”“_—œ¡":
				add("ut.spb.set");
				break;
			case "”“_—«‘Œ":
				add("ut.reg.set");
				break;
			case "”“_Ã— ":
				add("ut.msk.set");
				break;	
			case "”“_ﬁÕ»ŒÕ":
				add("ut.uni.set");
				break;	
			case "””_ﬁÕ»ŒÕ":
				add("uu.uni.set");
				break;	
			case "”“÷_ﬁÕ»ŒÕ":
				add("utc.set");
				break;
			case "≈√¿»—":
				add("egais");
				break;
			}			
		}
	}
	
	private void sendMessage(String queueName, String message) throws JMSException {
		
	 	Destination dest = new ActiveMQQueue(queueName);
        MessageProducer producer = session.createProducer(dest);	        
        producer.setDeliveryMode(DeliveryMode.PERSISTENT);		
		TextMessage msg = session.createTextMessage(message);
		msg.setJMSType("TEXT");				
		msg.setJMSCorrelationID(UUID.randomUUID().toString());
		
		producer.send(msg);			
		producer.close();
}

}
