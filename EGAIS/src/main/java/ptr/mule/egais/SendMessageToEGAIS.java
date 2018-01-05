package ptr.mule.egais;

import java.io.StringWriter;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.mule.api.MuleMessage;

import api.lesuser.lesegais.ru.DealDeclaration;
import api.lesuser.lesegais.ru.DealDeclarationReport;
import api.lesuser.lesegais.ru.InsertUpdateDocumentResponse;
import api.lesuser.lesegais.ru.LesUserAbstractRequest;
import api.lesuser.lesegais.ru.LesUserAbstractResponse;
import api.lesuser.lesegais.ru.LesUserFault;
import api.lesuser.lesegais.ru.Party;
import api.lesuser.lesegais.ru.RequestGetPartyValues;
import api.lesuser.lesegais.ru.RequestInsertDocument;
import api.lesuser.lesegais.ru.RequestInsertParty;
import api.lesuser.lesegais.ru.RequestUpdateDocument;
import api.lesuser.lesegais.ru.ResponseGetPartyValues;
import api.lesuser.lesegais.ru.ResponseInsertDocument;
import api.lesuser.lesegais.ru.ResponseInsertParty;
import ptr.mule.exchange.Map;
import ptr.mule.exchange.Object;
import ptr.mule.exchange.iExchangable;

public class SendMessageToEGAIS {

	public CallWSLesUserService ws;
	public LesUserAbstractRequest request;
	public LesUserAbstractResponse reply;
	public LesUserFault error;
	public String userError;	
	public MuleMessage muleMessage;	
	public TimeFilter timeFilter;	
	public JAXBContext jxbContext;
	
	public SendMessageToEGAIS(MuleMessage muleMessage, CallWSLesUserService ws, TimeFilter timeFilter, JAXBContext jxbContext)
	{
		this.muleMessage 	= muleMessage;
		this.ws 			= ws;
		this.timeFilter 	= timeFilter;
		this.jxbContext 	= jxbContext;
	}

	public boolean sendMessage(LesUserAbstractRequest message) {
		
		this.request= message;
		this.reply = null;
		this.error = null;
		this.userError = null;
		
		if (message instanceof RequestInsertParty) {
			try {
				reply = ws.lesUserServicePortType.insertParty((RequestInsertParty) message);
			} catch (LesUserFault e) {
				this.error = e;
			}
		} else if (message instanceof RequestGetPartyValues) {
			try {
				reply = ws.lesUserServicePortType.getPartyValues((RequestGetPartyValues) message);
			} catch (LesUserFault e) {
				this.error = e;
			}
		} else if (message instanceof RequestInsertDocument) {
			try {
				message.setCurrentTime(null);//устанавливаем время отправки запроса
				reply = ws.lesUserServicePortType.insertDocument((RequestInsertDocument) message);
			} catch (LesUserFault e) {
				this.error = e;
			}
		} else if (message instanceof RequestUpdateDocument) {
			try {
				message.setCurrentTime(null);//устанавливаем время отправки запроса
				reply = ws.lesUserServicePortType.updateDocument((RequestUpdateDocument) message);
			} catch (LesUserFault e) {
				this.error = e;
			}
		}

		if (error != null && error.getFaultInfo() != null && error.getFaultInfo().getError() != null) {
			this.userError = error.getFaultInfo().getError().getUserMessage();
		}

		return this.error == null ? true : false;
	}

	public String getPartyValue(Object object) {
		
		RequestGetPartyValues requestGetPartyValues = null;
		RequestInsertParty requestInsertParty 		= null;
		String type = object.getType();
	
		Map map = new Map(object);		
		if (map != null 
				&& (map.NextItem("Документ.ПТР_СделкиЕГАИСУчетДревесины") 
						|| map.NextItem("Документ.ПТР_ОтчетыЕГАИСУчетДревесины"))
				&& map.NextRow(0)) {
			String inn = map.getString("ИНН");
			if (inn != null && !"".equals(inn.trim())) {
				requestGetPartyValues 	= new RequestGetPartyValues(inn);
				if("Документ.ПТР_СделкиЕГАИСУчетДревесины".equals(type))
				{
					requestInsertParty 		= new RequestInsertParty(map);
				}				
			}
		}
		
		if (requestGetPartyValues != null) 
		{
			// проверяем что контрагент зарегистрирован
			if (this.sendMessage(requestGetPartyValues)) 
			{
				ResponseGetPartyValues responseGetPartyValues = (ResponseGetPartyValues) this.reply;				
				if (responseGetPartyValues.getParty() == null || responseGetPartyValues.getParty().isEmpty()) 
				{
					// если не зарегистрирован, то регистрируем
					if (requestInsertParty != null && this.sendMessage(requestInsertParty)) 
					{
						ResponseInsertParty responseInsertParty = (ResponseInsertParty) this.reply;
						if (responseInsertParty.getParty() != null) 
						{
							return responseInsertParty.getParty().getId();
						}
					}
				} 
				else 
				{
					return getParty(responseGetPartyValues.getParty());
				}
			}
		}
		return "";
	}
	
	public boolean InsertUpdateDocument(Object object, String partyValue)
	{		
		if (partyValue == null || "".equals(partyValue))
		{
			return false;
		}
		
		Map map = new Map(object);
		
		if (map != null && map.NextItem("Документ.ПТР_СделкиЕГАИСУчетДревесины") && map.NextRow(0))
		{			
			String id = map.getString("Идентификатор");
			
			if (id != null && ! "".equals(id.trim()))
			{
				return this.sendMessage(new RequestUpdateDocument(map, partyValue));
			}
			else
			{
				return this.sendMessage(new RequestInsertDocument(map, "deal", partyValue));	
			}
						
		}
		else if(map != null && map.NextItem("Документ.ПТР_ОтчетыЕГАИСУчетДревесины") && map.NextRow(0))
		{
			return this.sendMessage(new RequestInsertDocument(map, "report", partyValue));
		}
		
		return false;		
	}

	private String getParty(List<Party> parties) {
		if (parties != null) {
			for (Party party : parties) {
				return party.getId();
			}
		}
		return "";
	}
	
	
	public String getXMLStringRequest() {
		StringWriter sw = new StringWriter();
		try {
			jxbContext.createMarshaller().marshal(this.request, sw);
			return sw.toString();

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public String getXMLStringReply() {
		
		StringWriter sw = new StringWriter();
		try {
			jxbContext.createMarshaller().marshal(this.reply, sw);
			return sw.toString();

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public iExchangable log(Object object){
		
		DealDeclaration dealDeclaration = null;
		DealDeclarationReport dealDeclarationReport = null;
		String operationType = "Создание";
		String result	=	"Ошибка";
		String type = object.getType();
		if (this.reply instanceof InsertUpdateDocumentResponse) 
		{
			if ("Документ.ПТР_ОтчетыЕГАИСУчетДревесины".equals(type))
			{
				dealDeclarationReport = ((ResponseInsertDocument) this.reply).getDealDeclarationReport();
			}
			else if ("Документ.ПТР_СделкиЕГАИСУчетДревесины".equals(type))
			{
				dealDeclaration = ((InsertUpdateDocumentResponse) this.reply).getDealDeclaration();
			}						
			operationType 	= this.reply instanceof ResponseInsertDocument ? "Первичная регистрация": "Обновление";
			result 			= (dealDeclaration == null && dealDeclarationReport == null) ? "Ошибка" :"Обработан";
		}	
		
		String request = this.getXMLStringRequest();
		String reply   = this.userError == null || "".equals(this.userError)  ? this.getXMLStringReply() : this.userError;
		
		return new EGAISDeal(object, request, reply, result, dealDeclaration, dealDeclarationReport, operationType, 
				this.userError == null || "".equals(this.userError) ? true : false);
	}
	


}
