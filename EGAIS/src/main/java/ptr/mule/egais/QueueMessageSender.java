
package ptr.mule.egais;

import java.util.UUID;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;

public class QueueMessageSender {

    ActiveMQConnectionFactory factory = null;
    Connection connection = null;
    Session session = null;
    public static Boolean TRANSACTIONAL = false;

    public QueueMessageSender()
            throws JMSException {
 
        factory 	= new ActiveMQConnectionFactory("failover:(tcp://10.13.170.24:61616,tcp://10.13.170.25:61616)");
        connection 	= factory.createConnection();
        session 	= connection.createSession(TRANSACTIONAL,Session.AUTO_ACKNOWLEDGE);
       

    }
    
	public void sendMessage(String queueName, String message) throws JMSException {
		
		 	Destination dest = new ActiveMQQueue(queueName);
	        MessageProducer producer = session.createProducer(dest);	        
	        producer.setDeliveryMode(DeliveryMode.PERSISTENT);		
			TextMessage msg = session.createTextMessage(message);
			msg.setJMSType("TEXT");				
			msg.setJMSCorrelationID(UUID.randomUUID().toString());
			
			producer.send(msg);			
			producer.close();

	}
	
	public void close(){
		
		if (this.connection != null){
			try {
				this.connection.close();
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

    // Create 100 text messages with integer, float and string message headers
    // and send it to Queues
    public void createAndSendTextMessage(String message) throws JMSException {

          
 
    }

/*    // Create 100 object messages with stock price, name and company name in it.
    public void createAndSendObjectMessage() throws JMSException {
        for (int i = 1; i <= 100; i++) {
            MyMessage mymessage = new MyMessage();
            mymessage.setStockPrice(i);
            mymessage.setStockName("Stock " + i);
            mymessage.setStockCompany("Company " + i);
            // Adding Object to the body
            ObjectMessage msg = session.createObjectMessage(mymessage);
            msg.setJMSType("OBJECT");
            // Adding an int property
            msg.setIntProperty("idSquare", (int) Math.pow(i, 2));
            producer.send(msg);
        }
        System.out.println("Object Messages sent.");
    }*/

  /*  // Create 100 Map messages
    public void createAndSendMapMessage() throws JMSException {
        for (int i = 1; i <= 100; i++) {
            MapMessage mapMsg = session.createMapMessage();
            // Set Map Values with Keys
            mapMsg.setJMSType("MAP");
            mapMsg.setInt("MessageNum", i);
            mapMsg.setDouble("Log", Math.log10(i));
            mapMsg.setDouble("Square Root", Math.sqrt(i));
            mapMsg.setString("Cube Root", String.valueOf(Math.cbrt(i)));
            mapMsg.setString("Exponential", String.valueOf(Math.exp(i)));
            mapMsg.setInt("Square", (int) Math.pow(i, 2));
            mapMsg.setInt("Cube", (int) Math.pow(i, 3));
            mapMsg.setFloat("tan\u03B8", (float) Math.tan(i));
            mapMsg.setFloat("sin\u03B8", (float) Math.sin(i));
            mapMsg.setFloat("cos\u03B8", (float) Math.cos(i));
            producer.send(mapMsg);
        }
        System.out.println("Map Messages sent.");

    }

    public void createAndSendStreamMessage() throws JMSException {
        StreamMessage streamMsg = session.createStreamMessage();
        streamMsg.setJMSType("STREAM");
        // Setting integer property
        streamMsg.setIntProperty("id", 1);
        // Setting object
        streamMsg.writeObject(new Integer(2));
        // Setting String. Please note that the stream message must be read
        // at consumer side with the same order as it is written in producer
        // side.
        streamMsg.writeString("Stream String");
        File streamFile = new File("src/main/resources/ForStreamMessage.txt");
        streamMsg.setStringProperty("fileNameExtension", streamFile.getName());
        streamMsg.setLongProperty("fileSize", streamFile.length());
        try {
            streamMsg.writeBytes(Files.readAllBytes(streamFile.toPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        producer.send(streamMsg);
        System.out.println("Stream Messages sent.");
    }

    // Reads a file and creates a byte message from its content.

    public void createAndSendBytesMessage() throws JMSException {
        BytesMessage bytesMsgPdf = session.createBytesMessage();
        bytesMsgPdf.setJMSType("BYTES");
        // Create message from pdf file
        try {
            bytesMsgPdf.writeBytes(Files.readAllBytes(
                    new File("src/main/resources/pdf-sample.pdf").toPath()));
            bytesMsgPdf.setStringProperty("fileExtension", "pdf");
            bytesMsgPdf.setStringProperty("fileName", "SampleFileName");
        } catch (IOException e) {
            e.printStackTrace();
        }
        producer.send(bytesMsgPdf);
        // Create message from jpg file
        BytesMessage bytesMsgJpg = session.createBytesMessage();
        bytesMsgJpg.setJMSType("BYTES");
        try {
            bytesMsgJpg.writeBytes(Files.readAllBytes(
                    new File("src/main/resources/Sample.jpg").toPath()));
            bytesMsgJpg.setStringProperty("fileExtension", "jpg");
            bytesMsgJpg.setStringProperty("fileName", "SampleJpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
        producer.send(bytesMsgJpg);
        System.out.println("Bytes Message sent.");
    }*/
}