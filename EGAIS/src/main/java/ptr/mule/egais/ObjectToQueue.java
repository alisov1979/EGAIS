package ptr.mule.egais;

import java.util.ArrayList;
import java.util.List;

import ptr.mule.exchange.iExchangable;

public class ObjectToQueue {
	
	private List<String> queue;
	
	public ObjectToQueue(iExchangable message)
	{		
		List<String> recipients = message.getRecipients();
		
		this.queue = new ArrayList<>();
		for (String tmp : recipients){
			
			switch (tmp) {
			case "��_���":
				add("ut.spb.set");
				break;
			case "��_����":
				add("ut.reg.set");
				break;
			case "��_���":
				add("ut.msk.set");
				break;	
			case "��_�����":
				add("ut.uni.set");
				break;	
			case "��_�����":
				add("uu.uni.set");
				break;	
			case "���_�����":
				add("utc.set");
				break;
			case "�����":
				add("egais");
				break;
			}			
		}
		
	}
	
	private void add(String value){
		
		if (this.queue == null){
			this.queue = new ArrayList<>();
		}
		
		if (! this.queue.contains(value)){
			this.queue.add(value);
		}
		
	}

	public List<String> getQueue() {
		return queue;
	}
	
	

}
