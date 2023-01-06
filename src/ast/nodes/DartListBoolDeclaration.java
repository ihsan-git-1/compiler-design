package ast.nodes;

import java.util.ArrayList;
import java.util.List;

import ast.variables.BooleanValueClass;

public class DartListBoolDeclaration extends DartAllListsDeclarationAbstractChild{
	String name;
	List<BooleanValueClass> itemsList;
	
	public DartListBoolDeclaration(String name,List<BooleanValueClass> listItem) {
		this.name = name;
		this.itemsList=new ArrayList<>();
	}
	
	public List<BooleanValueClass> getListItem(){
		return itemsList;
	}
	
	public void setItemsList(List<BooleanValueClass> list) {
		this.itemsList =  list;
	}
	
	@Override
	public String toString() {

		return  "Dart String List "+ name;
	}
}
