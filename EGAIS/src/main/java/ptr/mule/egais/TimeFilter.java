package ptr.mule.egais;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;

public class TimeFilter {

	private List<String> map;
	private Long update;
	private Long cashDuration;
	
	public void init(){
		cashDuration = 3600000L;
	}

	public Boolean messageWasSend(String message) {
		Boolean result = false;

		if (map == null) {
			map = new ArrayList<>();
		}

		if (update == null) {
			update = System.currentTimeMillis();
		}

		Long currentTime = System.currentTimeMillis();

		Long diff = currentTime - update;

		if (diff >= cashDuration)// очистка кэша каждые 3600 сек
		{
			map.clear();

			update = System.currentTimeMillis();
		}

		String messageHash = DigestUtils.md5Hex(message);

		for (String str : map) {
			if (str.equals(messageHash)) {
				result = true;
			}
		}

		return result;

	}
	
	public void addToCash(String message)
	{
		
		String messageHash = DigestUtils.md5Hex(message);
		
		if (map == null) {
			map = new ArrayList<>();
		}
		
		map.add(messageHash);		
		
	}

	public Long getCashDuration() {
		return cashDuration;
	}

	public void setCashDuration(Long cashDuration) {
		this.cashDuration = cashDuration;
	}
	
	

}
