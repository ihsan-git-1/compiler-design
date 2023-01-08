package ast.nodes;

import java.util.ArrayList;
import java.util.List;

import ast.variables.NumberClass;

public class DartListIntDeclaration extends DartAllListsDeclarationAbstractChild{
	String name;
	List<NumberClass> itemsList;
	
	public DartListIntDeclaration(String name,int line ,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
		this.name = name;
	}
	
	public List<NumberClass> getListItem(){
		return itemsList;
	}
	
	public void setItemsList(List<NumberClass> list) {
		this.itemsList =  list;
	}
	public String printList(List<NumberClass> list){
		String s = "";
		for(NumberClass item:list){
			s += item.getNum();
			s+=" ";
		}
		
		return s;
	}

	@Override
	public String toString() {
		String s= printList(itemsList);
		return "Dart Int List "+ name + ", line:" +getLine()+", parent: "+getParent()+", Child Count:  "+getChildCount()+" Type: "+getType()+", list Content: "+s;
	}
}
