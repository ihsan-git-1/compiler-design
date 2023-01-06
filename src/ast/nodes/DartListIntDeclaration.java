package ast.nodes;

import java.util.ArrayList;
import java.util.List;

import ast.variables.NumberClass;

public class DartListIntDeclaration extends DartAllListsDeclarationAbstractChild{
	String name;
	List<NumberClass> itemsList;
	
	public DartListIntDeclaration(String name,List<NumberClass> listItem) {
		this.name = name;
		this.itemsList=new ArrayList<>();
	}
	
	public List<NumberClass> getListItem(){
		return itemsList;
	}
	
	public void setItemsList(List<NumberClass> list) {
		this.itemsList =  list;
	}
	
	@Override
	public String toString() {

		return  "Dart Int List "+ name;
	}
}
