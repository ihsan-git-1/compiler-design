package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class DartListIntDeclaration extends DartAllListsDeclarationAbstractChild{
	String name;
	List<String> itemsList;
	
	public DartListStringDeclaration(String name,List<String> listItem) {
		this.name = name;
		this.itemsList=new ArrayList<>();
	}
	
	public List<String> getListItem(){
		return itemsList;
	}
	
	public void setItemsList(List<String> list) {
		this.itemsList =  list;
	}
	
	@Override
	public String toString() {

		return  "Dart String List "+ name;
	}
}
