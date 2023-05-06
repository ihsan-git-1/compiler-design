package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DartListStringDeclaration extends DartAllListsDeclarationAbstractChild{
	public String name;
	public List<String> itemsList = new ArrayList<>();
	
	public DartListStringDeclaration(dart_parse.DartListStringDeclarationContext ctx, String name) {
		super(ctx);
		this.name = name;
	}
	
	public List<String> getListItem(){
		return itemsList;
	}
	
	public void setItemsList(List<String> list) {
		this.itemsList =  list;
	}

	public void printList(List<String> list){
		for(String item:list){
			System.out.print(item);
			System.out.print(" ");
		}
	}

	@Override
	public String toString() {
		String var = getLineString()+"Dart String List "+ name + " parent "+getParent()+" Child Count:  "+getChildCount()+" Type: "+ NodeType.LIST;
		System.out.print(var);
		printList(this.itemsList);
		return  "" ;
	}




}
