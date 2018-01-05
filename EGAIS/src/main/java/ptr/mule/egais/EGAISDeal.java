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
						
		if (map != null && (map.NextItem("��������.���_������������������������")
				 || map.NextItem("��������.���_������������������������"))&& map.NextRow(0)) {
			Property docRef = map.getPropertyByName("������");

			Row row = new Row();
			row.addProperty(docRef);
			row.addProperty(new Property("������������.���_�������������������������������", "������", status));
			if (success) 
			{
				row.addProperty(new Property("������", "���������������", dealNumber));
				row.addProperty(new Property("������", "�������������", id));
				row.addProperty(new Property("������", "��������������", updateDate));
				row.addProperty(new Property("������", "������������", createDate));
			}

			row.addProperty(new Property("������","��������", success == true ? "��" : "���"));
			row.addProperty(new Property("������","���������������", "���"));

			List<Item> items = new ArrayList<>();

			items.add(new Item(row, docType, sender));

			Row operationRow = new Row();
			operationRow.addProperty(new Property("����", "����", Map.getNow()));
			operationRow.addProperty(new Property("������", "������", request));		
			operationRow.addProperty(new Property("������", "�����", response));
			operationRow.addProperty(new Property("������������.���_������������������������������������",
					"�����������", operationType));
			operationRow.addProperty(new Property("������", "�����������", status));
			items.add(new Item(operationRow, "����������������������", "��_�����"));

			this.object = new Object(items, docType, sender, "�����");

		}
	}

	public EGAISDeal(Object doc, String request, String response, String status, String operationType) {

		Map map = new Map(doc);
		String docType = doc.getType();
		if (map != null && map.NextItem(docType) && map.NextRow(0)) {
			Property docRef = map.getPropertyByName("������");

			Row row = new Row();
			row.addProperty(docRef);
			row.addProperty(new Property("������������.���_�������������������������������", "������", status));
			row.addProperty(new Property("������","��������", "���"));
			List<Item> items = new ArrayList<>();

			items.add(new Item(row, "��������.���_������������������������", "��_�����"));

			Row operationRow = new Row();
			operationRow.addProperty(new Property("����", "����", Map.getNow()));
			operationRow.addProperty(new Property("������", "������", request));
			operationRow.addProperty(new Property("������", "�����", response));
			operationRow.addProperty(new Property("������������.���_������������������������������������",
					"�����������", operationType));
			operationRow.addProperty(new Property("������", "�����������", status));
			items.add(new Item(operationRow, "����������������������", "��_�����"));

			this.object = new Object(items, docType, "��_�����", "�����");

		}

	}

}
