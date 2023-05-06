package ast.nodes;

import java.util.ArrayList;
import java.util.List;

import ast.NodeType;
import ast.variables.NumberClass;
import gen.dart_parse;

public class DartListIntDeclaration extends DartAllListsDeclarationAbstractChild{
	String name;
	List<NumberClass> itemsList;
	
	public DartListIntDeclaration(dart_parse.DartListIntDeclarationContext ctx, String name) {
		super(ctx);
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
		return getLineString()+"Dart Int List "+ name +", parent: "+getParent()+", Child Count:  "+getChildCount()+" Type: "+ NodeType.LIST +", list Content: "+s;
	}
}
