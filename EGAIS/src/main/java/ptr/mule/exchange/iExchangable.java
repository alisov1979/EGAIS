package ptr.mule.exchange;

import java.util.List;

import ptr.mule.exchange.Object;

public interface iExchangable {
	
	public String getType();
	
	public Object getObject();
	
	public List<String> getRecipients();
	
	public Boolean canBePassed(String baseName);
	
	public String getSender();

}
