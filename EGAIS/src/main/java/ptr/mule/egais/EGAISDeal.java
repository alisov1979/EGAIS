package ptr.mule.egais;

import java.util.ArrayList;
import java.util.List;

import api.lesuser.lesegais.ru.DealDeclaration;
import api.lesuser.lesegais.ru.DealDeclarationReport;
import ptr.mule.exchange.Item;
import ptr.mule.exchange.Map;
import ptr.mule.exchange.Object;
import ptr.mule.exchange.Property;
import ptr.mule.exchange.Row;
import ptr.mule.exchange.SetObject;

public class EGAISDeal extends SetObject {
	
	

	public EGAISDeal(Object doc, String request, String response, String status, DealDeclaration dealDeclaration, DealDeclarationReport dealDeclarationReport, String operationType, boolean success) {
		Map map = new Map(doc);
		String dealNumber ="";
		String createDate = "";
		String updateDate = "";
		String id = "";
		String docType = doc.getType();
		String sender = doc.getSender();
		
		if (dealDeclaration != null) 
		{
			dealNumber = dealDeclaration.getDealNumber();
			createDate = dealDeclaration != null ? dealDeclaration.getCreateDate().toString() : "";
			createDate = dealDeclaration != null ? dealDeclaration.getClientCreateTime().toString() : "";
			updateDate = dealDeclaration != null ? dealDeclaration.getUpdateDate().toString() : "";
			id = dealDeclaration.getId();
		}
		
		if (dealDeclarationReport != null) 
		{
			dealNumber = dealDeclarationReport.getDealNumber();
			createDate = dealDeclarationReport != null ? dealDeclarationReport.getCreateDate().toString() : "";
			createDate = dealDeclaration != null ? dealDeclarationReport.getClientCreateTime().toString() : "";
			updateDate = dealDeclarationReport != null ? dealDeclarationReport.getUpdateDate().toString() : "";			
		}
						
		if (map != null && (map.NextItem("Документ.ПТР_СделкиЕГАИСУчетДревесины")
				 || map.NextItem("Документ.ПТР_ОтчетыЕГАИСУчетДревесины"))&& map.NextRow(0)) {
			Property docRef = map.getPropertyByName("Ссылка");

			Row row = new Row();
			row.addProperty(docRef);
			row.addProperty(new Property("Перечисление.ПТР_СтатусыСделкиЕГАИСУчетДревесины", "Статус", status));
			if (success) 
			{
				row.addProperty(new Property("Строка", "НомерДекларации", dealNumber));
				row.addProperty(new Property("Строка", "Идентификатор", id));
				row.addProperty(new Property("Строка", "ДатаОбновления", updateDate));
				row.addProperty(new Property("Строка", "ДатаСоздания", createDate));
			}

			row.addProperty(new Property("Булево","Проведен", success == true ? "Да" : "Нет"));
			row.addProperty(new Property("Булево","ПометкаУдаления", "Нет"));

			List<Item> items = new ArrayList<>();

			items.add(new Item(row, docType, sender));

			Row operationRow = new Row();
			operationRow.addProperty(new Property("Дата", "Дата", Map.getNow()));
			operationRow.addProperty(new Property("Строка", "Запрос", request));		
			operationRow.addProperty(new Property("Строка", "Ответ", response));
			operationRow.addProperty(new Property("Перечисление.ПТР_ВидыОперацийСделкиЕГАИСУчетДревесины",
					"ВидОперации", operationType));
			operationRow.addProperty(new Property("Строка", "Комментарий", status));
			items.add(new Item(operationRow, "ДополнительныеСвойства", "УУ_ЮНИОН"));

			this.object = new Object(items, docType, sender, "ЕГАИС");

		}
	}

	public EGAISDeal(Object doc, String request, String response, String status, String operationType) {

		Map map = new Map(doc);
		String docType = doc.getType();
		if (map != null && map.NextItem(docType) && map.NextRow(0)) {
			Property docRef = map.getPropertyByName("Ссылка");

			Row row = new Row();
			row.addProperty(docRef);
			row.addProperty(new Property("Перечисление.ПТР_СтатусыСделкиЕГАИСУчетДревесины", "Статус", status));
			row.addProperty(new Property("Булево","Проведен", "Нет"));
			List<Item> items = new ArrayList<>();

			items.add(new Item(row, "Документ.ПТР_СделкиЕГАИСУчетДревесины", "УУ_ЮНИОН"));

			Row operationRow = new Row();
			operationRow.addProperty(new Property("Дата", "Дата", Map.getNow()));
			operationRow.addProperty(new Property("Строка", "Запрос", request));
			operationRow.addProperty(new Property("Строка", "Ответ", response));
			operationRow.addProperty(new Property("Перечисление.ПТР_ВидыОперацийСделкиЕГАИСУчетДревесины",
					"ВидОперации", operationType));
			operationRow.addProperty(new Property("Строка", "Комментарий", status));
			items.add(new Item(operationRow, "ДополнительныеСвойства", "УУ_ЮНИОН"));

			this.object = new Object(items, docType, "УУ_ЮНИОН", "ЕГАИС");

		}

	}

}
