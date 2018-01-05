package ptr.mule.egais;

import api.lesuser.lesegais.ru.LesUserService;
import api.lesuser.lesegais.ru.LesUserServicePortType;

public class CallWSLesUserService {
	
	LesUserService lesUserService;
	LesUserServicePortType lesUserServicePortType;
	
	public void init()
	{
		this.lesUserService = new LesUserService();
		HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
		this.lesUserService.setHandlerResolver(handlerResolver);
		this.lesUserServicePortType = lesUserService.getLesUserServicePort();
		
	}
	

}
